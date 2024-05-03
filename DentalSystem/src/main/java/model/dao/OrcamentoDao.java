package model.dao;

import java.util.List;
import model.entities.Orcamento;

public interface OrcamentoDao {
    
    void inserir(Orcamento o);
    void atualizar(Orcamento o);
    void deletarPorId(Integer id);
    List<Orcamento> buscarTodos();
    List<Orcamento> buscarPorId(Integer id);
}