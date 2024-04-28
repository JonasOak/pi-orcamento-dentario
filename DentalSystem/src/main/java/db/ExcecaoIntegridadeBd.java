/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

public class ExcecaoIntegridadeBd extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    public ExcecaoIntegridadeBd(String msg) {
        super(msg); // Exceção personalizada para conflitos de integridade do BD
    }
    
}
