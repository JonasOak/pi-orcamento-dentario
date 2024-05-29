package model.dao;

import java.util.List;
import model.entities.ItemDoOrcamento;
import model.entities.Orcamento;

public interface ItemDoOrcamentoDAO {
    
    void inserir(ItemDoOrcamento item);
    void atualizar(ItemDoOrcamento item);
    void deletarPorId(Integer id);
    ItemDoOrcamento buscarPorId(Integer id);
    List<ItemDoOrcamento> buscarTodos();
    List<Orcamento> buscarTodosOrcamentos();
}
