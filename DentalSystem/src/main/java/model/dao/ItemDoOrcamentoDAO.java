package model.dao;

import java.util.List;
import model.entities.Cliente;
import model.entities.ItemDoOrcamento;
import model.entities.Orcamento;

public interface ItemDoOrcamentoDAO {
    
    void inserir(ItemDoOrcamento item);
    void atualizar(ItemDoOrcamento item);
    void deletarPorId(ItemDoOrcamento item);
    ItemDoOrcamento buscarPorId(Integer id);
    List<ItemDoOrcamento> buscarTodos();
    List<Orcamento> buscarTodosOrcamentos();
}
