package model.entities;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ItemDoOrcamentoTableModel extends AbstractTableModel {
    
    private List<ItemDoOrcamento> itens;
    
    public ItemDoOrcamentoTableModel() {
    }

    public void setItens(List<ItemDoOrcamento> itens) {
        this.itens = itens;
    }
    
   @Override
    public int getRowCount() {
        if (itens != null) {
            return itens.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override  
    public String getColumnName(int col) {   
       switch (col) {   
          case 0:   
             return "ID";   
          case 1:   
             return "ID Orçamento";   
          case 2:   
             return "Cliente";
          case 3:   
             return "Serviço";
          case 4:   
             return "Valor";
          case 5:   
             return "Dente";
          default:   
             return null;   
       }   
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (itens != null && linha >= 0 && linha < itens.size()) {   
            ItemDoOrcamento item = itens.get(linha);   
            switch (coluna) {   
               case 0:   
                  return item.getIdItemDoOrcamento();
               case 1:   
                  return item.getOrcamento().getIdOrcamento();
               case 2:
                   return item.getOrcamento().getCliente().getNomeCliente();
               case 3:   
                  return item.getServico();
               case 4:   
                  return item.getValor();
               case 5:   
                  return item.getDente();
            }   
         }   
         return null;   
    }
    
}
