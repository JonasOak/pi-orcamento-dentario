package model.dao;

import db.BD;
import model.controller.ClienteController;
import model.controller.ItemDoOrcamentoController;
import model.controller.OrcamentoController;
import model.controller.UsuarioController;

public class DaoFactory {
    
    public static ClienteController criarClienteController() {
        return new ClienteController(BD.getConnection());
    }
    
    public static OrcamentoController criarOrcamentoController() {
        return new OrcamentoController(BD.getConnection());
    }
    
    public static ItemDoOrcamentoController criarItemDoOrcamentoController() {
        return new ItemDoOrcamentoController(BD.getConnection());
    }
    
    public static UsuarioController criarUsuarioController() {
        return new UsuarioController(BD.getConnection());
    }
}
