package application;

import java.util.Date;
import java.util.List;
import model.controller.ClienteController;
import model.controller.OrcamentoController;
import model.dao.DaoFactory;
import model.entities.Cliente;
import model.entities.Orcamento;

public class Programa {
    
    public static void main(String[] args) {
        
        ClienteController clienteController = DaoFactory.criarClienteController();
        OrcamentoController orcamentoController = DaoFactory.criarOrcamentoController();
        List<Cliente> listC;
        List<Orcamento> listO;
        //Cliente cliente1 = new Cliente(4, "Maria", "Rua dAS fLORES, 321", "SP", "(11) 987654321", "12.345.678-90", "maria@gmail.com");
        //Cliente cliente2 = new Cliente(5, "Alberto", "Rua Ferdinando, 123", "BA", "(71) 940028922", "12.431.493-21", "albertao@gmail.com");
        //Orcamento orcamento = orcamentoController.buscarPorId(4);
        //System.out.println(orcamento.toString());
        
        // Teste busca de cliente por id
        //Cliente cliente = clienteController.buscarPorId(2);
        //System.out.println(cliente);
        

        // --------------------------------------------------------------------------------------------------------------
        
        // Teste inserir orçamento
        /*
        Orcamento[] orcamentos = {
                new Orcamento(null, new Date(), "Planserv", new Date(), "Ela é boba", cliente1),
                new Orcamento(null, new Date(), "Vitalmed", new Date(), "Ela é estranho", cliente2),
                //new Orcamento(3, new Date(), "Plano 3", new Date(), "Observação 3", cliente1),
        };

        for (Orcamento o : orcamentos) {
            orcamentoController.inserir(o);
            System.out.println("Inserido! Novo id = " + o.getIdOrcamento());
        }
        */
        
        // Teste deletar orçamento
        //orcamentoController.deletarPorId(6);
        //orcamentoController.deletarPorId(7);
        
        
        //Orcamento orcamento = orcamentoController.buscarPorId(4);
        //System.out.println(orcamento);
        
        
        // Teste buscar por cliente
        Cliente c = new Cliente(null, "ri", null, null, null, null, null);
        List<Orcamento> list = orcamentoController.buscarPorCliente(c);
        for (Orcamento obj : list) {
            System.out.println(obj.toStringBuscaCliente());
        }
        
        // --------------------------------------------------------------------------------------------------------------
        
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
        
        // Teste atualizar cliente
        /*
        Cliente cliente = clienteController.buscarPorId(2);
        System.out.println(cliente);
        
        cliente.setEmail("girafola@gmail.com");
        clienteController.atualizar(cliente);
        */
        
        // Teste deletar cliente
        //clienteController.deletarPorId(3);
        
        // Teste buscar todos os clientes
        
//        listO = orcamentoController.buscarTodos();
//        for (Orcamento o : listO) {
//            System.out.println(o);
//        }
        
    }
}
