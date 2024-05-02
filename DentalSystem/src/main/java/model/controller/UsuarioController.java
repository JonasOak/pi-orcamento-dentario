package model.controller;

import java.sql.Connection;

public class UsuarioController {
    
    private Connection conn;
    
    public UsuarioController(Connection conn) {
        this.conn = conn;
    }
    
}
