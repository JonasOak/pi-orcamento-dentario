package application;

import model.controller.ClienteController;
import model.controller.ItemDoOrcamentoController;
import model.controller.OrcamentoController;
import model.controller.UsuarioController;
import model.entities.Cliente;
import model.entities.ItemDoOrcamento;
import model.entities.Orcamento;
import model.entities.Usuario;

public class Programa {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        UsuarioController usuarioController = new UsuarioController();
        
        Cliente cliente = new Cliente();
        ClienteController clienteController = new ClienteController();
        
        Orcamento orcamento = new Orcamento();
        OrcamentoController orcamentoController = new OrcamentoController();
        
        ItemDoOrcamento itemDoOrcamento = new ItemDoOrcamento();
        ItemDoOrcamentoController itemDoOrcamentoController = new ItemDoOrcamentoController();
        
    }
}
