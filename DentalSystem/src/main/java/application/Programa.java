package application;

import model.view.Login;

public class Programa {
    
    public static void main(String args[]) {
        Login.setNimbusLAF();
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
}