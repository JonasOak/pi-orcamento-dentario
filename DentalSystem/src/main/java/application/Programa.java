package application;

import model.controller.ClienteController;
import model.dao.DaoFactory;
import model.controller.ItemDoOrcamentoController;
import model.controller.OrcamentoController;
import model.controller.UsuarioController;
import model.entities.Cliente;
import model.entities.ItemDoOrcamento;
import model.entities.Orcamento;
import model.entities.Usuario;

public class Programa {
    
    public static void main(String[] args) {
        
        ClienteController clienteController = DaoFactory.criarClienteController();
        
        // Teste busca de cliente por id
        Cliente cliente = clienteController.buscarPorId(2);
        System.out.println(cliente);
        
        
    }
}
