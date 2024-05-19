package model.entities;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class OrcamentoTableModel extends AbstractTableModel {
    
    private List<Orcamento> orcamentos;
    
    public OrcamentoTableModel(){
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    @Override
    public int getRowCount() {
        if (orcamentos != null) {
            return orcamentos.size();
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
             return "Cliente";   
          case 2:   
             return "Data registro";
          case 3:   
             return "Data agendamento";
          case 4:   
             return "Plano";
          case 5:   
             return "Observação";
          default:   
             return null;   
       }   
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (orcamentos != null && linha >= 0 && linha < orcamentos.size()) {   
            Orcamento orcamento = orcamentos.get(linha);   
            switch (coluna) {   
               case 0:   
                  return orcamento.getIdOrcamento();
               case 1:   
                  return orcamento.getCliente().getNomeCliente();
               case 2:   
                  return orcamento.getDataRegistro();
               case 3:   
                  return orcamento.getDataAgendamento();
               case 4:   
                  return orcamento.getPlano();
               case 5:   
                  return orcamento.getObservacao();
            }   
         }   
         return null;   
    }
    
}
