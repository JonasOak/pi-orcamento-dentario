package model.entities;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {
    
    private List<Usuario> usuarios;

    public UsuarioTableModel() {
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        if (usuarios != null) {
            return usuarios.size();
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
             return "Nome";   
          case 2:   
             return "Cargo";
          case 3:   
             return "Login";
          case 4:   
             return "Senha";
          case 5:   
             return "Email";
          default:   
             return null;   
       }   
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (usuarios != null && linha >= 0 && linha < usuarios.size()) {   
            Usuario usuario = usuarios.get(linha);   
            switch (coluna) {   
               case 0:   
                  return usuario.getIdUsuario();   
               case 1:   
                  return usuario.getNome();
               case 2:   
                  return usuario.getCargo();
               case 3:   
                  return usuario.getLogin();
               case 4:   
                  return usuario.getSenha();
               case 5:   
                  return usuario.getEmail();
            }   
         }   
         return null;   
    }
    
}
