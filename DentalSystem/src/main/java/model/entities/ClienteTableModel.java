package model.entities;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {
    
    private List<Cliente> clientes;
    
    public ClienteTableModel() {
    }
    
    public void setClientes(List<Cliente> clientes) {   
         this.clientes = clientes;   
      }

    @Override
    public int getRowCount() {
        if (clientes != null) {
            return clientes.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override  
    public String getColumnName(int col) {   
       switch (col) {   
          case 0:   
             return "ID";   
          case 1:   
             return "Nome";   
          case 2:   
             return "Endereco";
          case 3:   
             return "UF";
          case 4:   
             return "Telefone";
          case 5:   
             return "Documento";
          case 6:   
             return "Email";
          default:   
             return null;   
       }   
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (clientes != null && linha >= 0 && linha < clientes.size()) {   
            Cliente cliente = clientes.get(linha);   
            switch (coluna) {   
               case 0:   
                  return cliente.getIdCliente();   
               case 1:   
                  return cliente.getNomeCliente();   
               case 2:   
                  return cliente.getEndereco();
               case 3:   
                  return cliente.getUf();
               case 4:   
                  return cliente.getTelefone();
               case 5:   
                  return cliente.getDocumento();
               case 6:   
                  return cliente.getEmail();
            }   
         }   
         return null;   
    }
    
}
