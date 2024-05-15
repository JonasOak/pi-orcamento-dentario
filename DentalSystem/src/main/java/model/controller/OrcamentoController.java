package model.controller;

import db.BD;
import db.ExcecaoBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.dao.OrcamentoDao;
import model.entities.Cliente;
import model.entities.Orcamento;

public class OrcamentoController implements OrcamentoDao {
    
    private Connection conn;
    
    public OrcamentoController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Orcamento o) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO orcamento "
                    + "(data_registro, data_agendamento, plano, fk_id_cliente, observacao) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            st.setDate(1, new java.sql.Date(o.getDataRegistro().getTime()));
            st.setDate(2, new java.sql.Date(o.getDataAgendamento().getTime()));
            st.setString(3, o.getPlano());
            st.setInt(4, o.getCliente().getIdCliente());
            st.setString(5, o.getObservacao());
            
            int linhasAfetadas = st.executeUpdate();
            
            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    o.setIdOrcamento(id);
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
    public void atualizar(Orcamento o) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE orcamento "
                    + "SET data_registro = ?, data_agendamento = ?, plano = ?, fk_id_cliente = ?, observacao = ? "
                    + "WHERE id_orcamento = ?");
            
            st.setDate(1, new java.sql.Date(o.getDataRegistro().getTime()));
            st.setDate(2, new java.sql.Date(o.getDataAgendamento().getTime()));
            st.setString(3, o.getPlano());
            st.setInt(4, o.getCliente().getIdCliente());
            st.setString(5, o.getObservacao());
            st.setInt(6, o.getIdOrcamento());
            
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
    public void deletarPorId(Orcamento orcamento) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM orcamento WHERE id_orcamento = ?");

            st.setInt(1, orcamento.getIdOrcamento());

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
    public Orcamento buscarPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT c.nome, o.fk_id_cliente as id_cliente, "
                    + "o.id_orcamento, o.data_registro, o.data_agendamento, o.plano, o.observacao "
                    + "FROM orcamento o JOIN cliente c "
                    + "ON o.fk_id_cliente = c.id_cliente "
                    + "WHERE o.id_orcamento = ?");
            
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("id_cliente"));
                c.setNomeCliente(rs.getString("nome"));
                
                Orcamento o = instanciarOrcamento(rs, c);
                return o;
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
    public List<Orcamento> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT orcamento.*, cliente.id_cliente FROM orcamento "
                    + "JOIN cliente ON cliente.id_cliente = orcamento.fk_id_cliente "
                    + "ORDER BY orcamento.id_orcamento");
            
            rs = st.executeQuery();
            
            List<Orcamento> list = new ArrayList<>();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("id_cliente"));
                
                Orcamento o = instanciarOrcamento(rs, c);
                list.add(o);
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
    public List<Orcamento> buscarPorCliente(Cliente c) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT cliente.nome, orcamento.* FROM orcamento "
                    + "JOIN cliente ON cliente.id_cliente = orcamento.fk_id_cliente "
                    + "WHERE cliente.nome LIKE ? "
                    + "ORDER BY cliente.nome");
            
            st.setString(1, "%" + c.getNomeCliente() + "%");
            
            rs = st.executeQuery();
            List<Orcamento> list = new ArrayList<>();
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNomeCliente(rs.getString("nome"));
                Orcamento orcamento = instanciarOrcamento(rs, cliente);
                list.add(orcamento);
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
}