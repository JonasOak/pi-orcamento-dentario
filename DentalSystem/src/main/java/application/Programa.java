package application;

import model.view.Menu;

public class Programa {
    
    public static void main(String args[]) {
        Menu.setNimbusLAF();
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }
}