package model.dao;

import java.util.List;
import model.entities.Cliente;

public interface ClienteDao {
    
    void inserir(Cliente c);
    void atualizar(Cliente c);
    void deletarPorId(Integer id);
    List<Cliente> buscarTodos();
    Cliente buscarPorId(Integer id);
}