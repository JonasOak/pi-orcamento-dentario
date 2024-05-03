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
    public void deletarPorId(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM orcamento WHERE id_orcamento = ?");

            st.setInt(1, id);

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
    public List<Orcamento> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Orcamento> buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Método para instanciar orçamento e não deixar o código verboso
    private Orcamento instanciarOrcamento(ResultSet rs, Cliente cliente) throws SQLException {
        Orcamento orcamento = new Orcamento();
        orcamento.setIdOrcamento(rs.getInt("id_orcamento"));
        orcamento.setDataRegistro(rs.getDate("data_registro"));
        orcamento.setDataAgendamento(rs.getDate("data_agendamento"));
        orcamento.setPlano(rs.getString("plano"));
        orcamento.setCliente(cliente);
        orcamento.setObservacao(rs.getString("documento"));
        return orcamento;
    }
    
    // Método para instanciar cliente e não deixar o código verboso
    private Cliente instanciarCliente(ResultSet rs, Orcamento orcamento) throws SQLException {
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
    
}