package model.controller;

import java.sql.Connection;

public class OrcamentoController {
    
    private Connection conn;
    
    public OrcamentoController(Connection conn) {
        this.conn = conn;
    }
    
}
