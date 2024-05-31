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
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class UsuarioController implements UsuarioDao {
    
    private Connection conn;
    
    public UsuarioController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Usuario usuario) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO usuario "
                    + "(nome, cargo, login, senha, email) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getCargo());
            st.setString(3, usuario.getLogin());
            st.setString(4, usuario.getSenha());
            st.setString(5, usuario.getEmail());
            
            int linhasAfetadas = st.executeUpdate();
            
            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    usuario.setIdUsuario(id);
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
    public void atualizar(Usuario usuario) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE usuario "
                    + "SET nome = ?, cargo = ?, login = ?, senha = ?, email = ? "
                    + "WHERE id_usuario = ?");
            
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getCargo());
            st.setString(3, usuario.getLogin());
            st.setString(4, usuario.getSenha());
            st.setString(5, usuario.getEmail());
            st.setInt(6, usuario.getIdUsuario());
            
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
        if (id == null) {
            throw new ExcecaoBd("O valor passado não pode ser nulo");
        }
        try {
            st = conn.prepareStatement("DELETE FROM usuario WHERE id_usuario = ?");

            st.setInt(1, id);
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
    public Usuario buscarPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT usuario.* FROM usuario "
                    + "WHERE usuario.id_usuario = ?");
            
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                return usuario;
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
    public List<Usuario> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT usuario.* FROM usuario "
                    + "ORDER BY usuario.id_usuario");
            
            rs = st.executeQuery();
            
            List<Usuario> list = new ArrayList<>();

            while (rs.next()) {          
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                list.add(usuario);
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
    
}
