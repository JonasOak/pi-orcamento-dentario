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
import model.dao.ClienteDao;
import model.entities.Cliente;

public class ClienteController implements ClienteDao {
    
    private Connection conn;
    
    public ClienteController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Cliente cliente) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO cliente "
                    + "(nome, endereco, uf, telefone, documento, email) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, cliente.getNomeCliente());
            st.setString(2, cliente.getEndereco());
            st.setString(3, cliente.getUf());
            st.setString(4, cliente.getTelefone());
            st.setString(5, cliente.getDocumento());
            st.setString(6, cliente.getEmail());
            
            int linhasAfetadas = st.executeUpdate();
            
            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    cliente.setIdCliente(id);
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
    public void atualizar(Cliente cliente) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE cliente "
                    + "SET nome = ?, endereco = ?, uf = ?, telefone = ?, documento = ?, email = ? "
                    + "WHERE id_cliente = ?");
            
            st.setString(1, cliente.getNomeCliente());
            st.setString(2, cliente.getEndereco());
            st.setString(3, cliente.getUf());
            st.setString(4, cliente.getTelefone());
            st.setString(5, cliente.getDocumento());
            st.setString(6, cliente.getEmail());
            st.setInt(7, cliente.getIdCliente());
            
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Cliente> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT cliente.* FROM cliente "
                    + "ORDER BY cliente.id_cliente");
            
            rs = st.executeQuery();
            
            List<Cliente> list = new ArrayList<>();
            Map<Integer, Cliente> map = new HashMap<>();
            
            while (rs.next()) {
                // Não criar clientes repetidos
                Cliente cliente = map.get(rs.getInt("id_cliente"));
                
                if (cliente == null) {
                    cliente = instanciarCliente(rs);
                    map.put(rs.getInt("id_cliente"), cliente);
                }
                
                list.add(cliente);
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
    
    @Override
    public Cliente buscarPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT cliente.* FROM cliente "
                    + "WHERE cliente.id_cliente = ?");
            
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Cliente cliente = instanciarCliente(rs);
                return cliente;
            }
            return null;
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
}