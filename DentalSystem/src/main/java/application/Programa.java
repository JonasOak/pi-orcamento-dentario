package application;

import java.util.List;
import model.controller.ClienteController;
import model.dao.DaoFactory;
import model.entities.Cliente;

public class Programa {
    
    public static void main(String[] args) {
        
        ClienteController clienteController = DaoFactory.criarClienteController();
        
        // Teste busca de cliente por id
//        Cliente cliente1 = clienteController.buscarPorId(2);
//        System.out.println(cliente1);
        
        // Teste buscar todos os clientes
        List<Cliente> list = clienteController.buscarTodos();
        for (Cliente c : list) {
            System.out.println(c);
        }

    }
}
