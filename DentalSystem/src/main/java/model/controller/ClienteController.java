package model.controller;

import db.BD;
import db.ExcecaoBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.Cliente;

public class ClienteController {
    
    // Injeção de dependência para implementar conexão
    private Connection conn;
    
    public ClienteController(Connection conn) {
        this.conn = conn;
    }
    
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
    
}
