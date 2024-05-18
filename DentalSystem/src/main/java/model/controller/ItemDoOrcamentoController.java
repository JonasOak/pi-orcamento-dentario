package model.controller;

import db.BD;
import db.ExcecaoBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.dao.ItemDoOrcamentoDAO;
import model.entities.Cliente;
import model.entities.ItemDoOrcamento;
import model.entities.Orcamento;

public class ItemDoOrcamentoController implements ItemDoOrcamentoDAO {
    
    private Connection conn;
    
    public ItemDoOrcamentoController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(ItemDoOrcamento item) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO item_do_orcamento "
                    + "(fk_id_orcamento, servico, valor, dente) "
                    + "VALUES "
                    + "(?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            st.setInt(1, item.getOrcamento().getIdOrcamento());
            st.setString(2, item.getServico());
            st.setBigDecimal(3, item.getValor());
            st.setString(4, item.getDente());
            
            int linhasAfetadas = st.executeUpdate();
            
            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    item.setIdItemDoOrcamento(id);
                }
                BD.closeResultSet(rs);
            }
            else {
                throw new ExcecaoBd("Erro inesperado! Nenhuma linha foi alterada!");
            }
        }
        catch (SQLException e) {
            throw new ExcecaoBd(e.getMessage());
        }
        finally {
            BD.closeStatement(st);
        }
    }

    @Override
    public void atualizar(ItemDoOrcamento item) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE item_do_orcamento "
                    + "SET fk_id_orcamento = ?, servico = ?, valor = ?, dente = ? "
                    + "WHERE id_item_orcamento = ?");
            
            st.setInt(1, item.getOrcamento().getIdOrcamento());
            st.setString(2, item.getServico());
            st.setBigDecimal(3, item.getValor());
            st.setString(4, item.getDente());
        
            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new ExcecaoBd(e.getMessage());
        }
        finally {
            BD.closeStatement(st);
        }
    }

    @Override
    public void deletarPorId(ItemDoOrcamento item) {
        PreparedStatement st = null;
        if (item == null) {
            throw new ExcecaoBd("O valor passado não pode ser nulo");
        }
        try {
            st = conn.prepareStatement("DELETE FROM orcamento WHERE id_item_orcamento = ?");

            st.setInt(1, item.getIdItemDoOrcamento());
            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new ExcecaoBd("Erro ao excluir dados: " + e.getMessage());
        }
        finally {
            BD.closeStatement(st);
        }
    }

    @Override
    public ItemDoOrcamento buscarPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT c.id_cliente, c.nome, c.endereco, c.uf, c.telefone, c.documento, c.email, "
                    + "o.id_orcamento, o.data_registro, o.data_agendamento, o.plano, o.fk_id_cliente, o.observacao, "
                    + "i.id_item_orcamento,"
                    + "FROM orcamento o JOIN cliente c "
                    + "ON o.fk_id_cliente = c.id_cliente "
                    + "JOIN item_do_orcamento i ON i.fk_id_orcamento = o.id_orcamento "
                    + "WHERE o.id_orcamento = ?");
            
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Cliente c = instanciarCliente(rs);             
                Orcamento o = instanciarOrcamento(rs, c);
                ItemDoOrcamento i = instanciarItemDoOrcamento(rs, c, o);
                return i;
            }
            return null;
        }
        catch (SQLException e) {
            throw new ExcecaoBd((e.getMessage()));
        }
        finally {
            BD.closeStatement(st);
            BD.closeResultSet(rs);
        }
    }

    @Override
    public List<ItemDoOrcamento> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT item_do_orcamento.*, orcamento.*, cliente.* FROM orcamento "
                    + "JOIN cliente ON cliente.id_cliente = orcamento.fk_id_cliente "
                    + "JOIN item_do_orcamento ON item_do_orcamento.fk_id_orcamento = orcamento.id_orcamento "
                    + "ORDER BY orcamento.id_orcamento");
            
            rs = st.executeQuery();
            
            List<ItemDoOrcamento> list = new ArrayList<>();
            while (rs.next()) {
                Cliente c = instanciarCliente(rs);
                Orcamento o = instanciarOrcamento(rs, c);
                ItemDoOrcamento i = instanciarItemDoOrcamento(rs, c, o);
                list.add(i);
            }
            return list;
        }
        catch (SQLException e) {
            throw new ExcecaoBd((e.getMessage()));
        }
        finally {
            BD.closeStatement(st);
            BD.closeResultSet(rs);
        }
    }

    @Override
    public List<Orcamento> buscarTodosOrcamentos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM orcamento");
            rs = st.executeQuery();
            List<Orcamento> list = new ArrayList<>();
            while (rs.next()) {
                Cliente c = instanciarCliente(rs);
                Orcamento o = instanciarOrcamento(rs, c);
                list.add(o);
            }
            return list;
        }
        catch (SQLException e) {
            throw new ExcecaoBd(e.getMessage());
        }
        finally {
            BD.closeStatement(st);
            BD.closeResultSet(rs);
        }
    }
    
    // Método para instanciar cliente e não deixar o código verboso
    private Cliente instanciarCliente(ResultSet rs) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(rs.getInt("id_cliente"));
        cliente.setNomeCliente(rs.getString("nome"));
        cliente.setEndereco(rs.getString("endereco"));
        cliente.setUf(rs.getString("uf"));
        cliente.setTelefone(rs.getString("telefone"));
        cliente.setDocumento(rs.getString("documento"));
        cliente.setEmail(rs.getString("email"));
        return cliente;
    }
    
    // Método para instanciar orçamento e não deixar o código verboso
    private Orcamento instanciarOrcamento(ResultSet rs, Cliente c) throws SQLException {
        Orcamento o = new Orcamento();
        o.setIdOrcamento(rs.getInt("id_orcamento"));
        o.setDataRegistro(rs.getDate("data_registro"));
        o.setDataAgendamento(rs.getDate("data_agendamento"));
        o.setPlano(rs.getString("plano"));
        o.setCliente(c);
        o.setObservacao(rs.getString("observacao"));
        return o;
    }
    
    // Método para instanciar item do orçamento e não deixar o código verboso
    private ItemDoOrcamento instanciarItemDoOrcamento(ResultSet rs, Cliente c, Orcamento o) throws SQLException {
        ItemDoOrcamento item = new ItemDoOrcamento();
        item.setIdItemDoOrcamento(rs.getInt("id_item_orcamento"));
        item.setOrcamento(o);
        item.setServico(rs.getString("servico"));
        item.setValor(rs.getBigDecimal("valor"));
        item.setDente(rs.getString("dente"));
        return item;
    }
    
}
