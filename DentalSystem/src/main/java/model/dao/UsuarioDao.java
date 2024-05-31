package model.dao;

import java.util.List;
import model.entities.Usuario;

public interface UsuarioDao {
    
    void inserir(Usuario u);
    void atualizar(Usuario u);
    void deletarPorId(Integer id);
    Usuario buscarPorId(Integer id);
    List<Usuario> buscarTodos();
}
