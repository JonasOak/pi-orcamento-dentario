package application;

import java.util.List;
import model.controller.ClienteController;
import model.dao.DaoFactory;
import model.entities.Cliente;

public class Programa {
    
    public static void main(String[] args) {
        
        ClienteController clienteController = DaoFactory.criarClienteController();
        List<Cliente> list;
        
        // Teste busca de cliente por id
        //Cliente cliente = clienteController.buscarPorId(2);
        //System.out.println(cliente);
        
        // Teste buscar todos os clientes
        list = clienteController.buscarTodos();
        for (Cliente c : list) {
            System.out.println(c);
        }
        
        // Teste inserir cliente
        /*
        Cliente[] clientes = {
            new Cliente(null, "Alberto", "Rua Ferdinando", "BA", "(71) 940028922", "12.431.493-21", "albertao@gmail.com"),
            new Cliente(null, "Maria", "Rua das Flores", "SP", "(11) 987654321", "12.345.678-90", "maria@gmail.com"),
            new Cliente(null, "Pedro", "Avenida Principal", "RJ", "(21) 987654321", "98.765.432-10", "pedro@gmail.com"),
            new Cliente(null, "Ana", "Rua da Praia", "SC", "(48) 987654321", "87.654.321-10", "ana@gmail.com"),
            new Cliente(null, "Lucas", "Avenida Central", "MG", "(31) 987654321", "76.543.210-10", "lucas@gmail.com"),
            new Cliente(null, "Julia", "Rua da Esperança", "RS", "(51) 987654321", "65.432.109-87", "julia@gmail.com"),
            new Cliente(null, "Carlos", "Avenida dos Sonhos", "PR", "(41) 987654321", "54.321.098-76", "carlos@gmail.com"),
            new Cliente(null, "Fernanda", "Rua da Paz", "CE", "(85) 987654321", "43.210.987-65", "fernanda@gmail.com")
        };

        for (Cliente c : clientes) {
            clienteController.inserir(c);
            System.out.println("Inserido! Novo id = " + c.getIdCliente());
        }
        */


    }
}
