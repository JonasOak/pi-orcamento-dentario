package model.dao;

import java.util.List;
import model.entities.Cliente;

public interface ClienteDao {
    
    void inserir(Cliente cliente);
    void atualizar(Cliente cliente);
    void deletarPorId(Integer id);
    List<Cliente> buscarTodos();
    Cliente buscarPorId(Integer id);
    List<Cliente> buscarPorNome();
}
