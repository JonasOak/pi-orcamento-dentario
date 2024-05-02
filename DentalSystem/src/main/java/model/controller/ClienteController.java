package model.controller;

import db.BD;
import db.ExcecaoBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.dao.ClienteDao;
import model.entities.Cliente;

public class ClienteController implements ClienteDao {
    
    private Connection conn;
    
    public ClienteController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atualizar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deletarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Cliente> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
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

    @Override
    public List<Cliente> buscarPorNome() {
        throw new UnsupportedOperationException("Not supported yet.");
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
