package model.dao;

import java.sql.ResultSet;
import java.util.List;
import model.entities.Cliente;
import model.entities.Orcamento;

public interface OrcamentoDao {
    
    void inserir(Orcamento o);
    void atualizar(Orcamento o);
    void deletarPorId(Integer id);
    Orcamento buscarPorId(Integer id);
    List<Orcamento> buscarTodos();
    List<Orcamento> buscarPorCliente(Cliente c);
}