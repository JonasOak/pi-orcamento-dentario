package model.view;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.controller.ItemDoOrcamentoController;
import model.controller.OrcamentoController;
import model.dao.DaoFactory;
import model.entities.Cliente;
import model.entities.ItemDoOrcamento;
import model.entities.Orcamento;
import model.entities.enums.Operacao;
import static model.entities.enums.Operacao.ALTERAR;
import static model.entities.enums.Operacao.EXCLUIR;
import static model.entities.enums.Operacao.INSERIR;

public class ManterItemDoOrcamento extends javax.swing.JInternalFrame {

    private Operacao operacao;
    
    String[] nomesDentes = {
        "Incisivo Central Superior Direito", "Incisivo Lateral Superior Direito", 
        "Canino Superior Direito", "Primeiro Pré-Molar Superior Direito", 
        "Segundo Pré-Molar Superior Direito", "Primeiro Molar Superior Direito", 
        "Segundo Molar Superior Direito", "Terceiro Molar Superior Direito",
        // Adicione todos os outros nomes de dentes aqui
    };
    
    /**
     * Creates new form ManterItemDoOrcamento
     */
    public ManterItemDoOrcamento() {
        initComponents();
        povoarCliente();
        povoarOrcamento();
        povoarDente();
    }
    
    public JButton getBtExcluir() {
        return btExcluir;
    }

    public JButton getBtAlterar() {
        return btAlterar;
    }
    
    public JButton getBtConfirmar() {
        return btConfirmar;
    }

    public JTextField getTfOperacao() {
        return tfOperacao;
    }
    
    private void povoarCliente() {
        try {
            OrcamentoController dao = DaoFactory.criarOrcamentoController();
            List<Cliente> lista = dao.buscarTodosClientes();
            for(Cliente c : lista){
                listaCliente.addItem(c);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }    
    }
    
    private void povoarOrcamento() {
        try {
            OrcamentoController dao = DaoFactory.criarOrcamentoController();
            List<Orcamento> lista = dao.buscarTodosOrcamentos();
            for(Orcamento o : lista){
                listaOrcamento.addItem(o);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    private void povoarDente() {
        for (String nome : nomesDentes) {
            listaDente.addItem(nome);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfOperacao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfServico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        listaCliente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        listaOrcamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        listaDente = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfValor = new javax.swing.JFormattedTextField();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Digite o código:");

        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarBuscar(evt);
            }
        });

        jLabel2.setText("Operação atual:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tfOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(tfOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Codigo:");

        tfCodigo.setEditable(false);

        jLabel4.setText("Serviço:");

        jLabel5.setText("Cliente:");

        jLabel6.setText("N° Orçamento:");

        listaOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaOrcamentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Dente:");

        jLabel8.setText("Valor:");

        tfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });

        btListar.setText("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarLista(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarInserir(evt);
            }
        });

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConfirmar(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(listaCliente, 0, 214, Short.MAX_VALUE)
                                    .addComponent(listaDente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfServico, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(listaOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(tfValor))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(listaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(listaOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(listaDente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        btConfirmar.setEnabled(true);
        this.operacao = Operacao.ALTERAR;
        tfOperacao.setText(this.operacao.name());
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(null,"Deseja Excluir o Registro?","Exclusão de Registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (resp == 0) {
            this.operacao = Operacao.EXCLUIR;
            tfOperacao.setText(this.operacao.name());
            this.aoClicarConfirmar(evt);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
        }
        else {
            tfPesquisar.requestFocus();
        }
    }//GEN-LAST:event_aoClicarExcluir

    private void mostrarLista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarLista
        ListaOrcamento form = new ListaOrcamento();
        Operacao operacao = Operacao.INATIVO;
        getDesktopPane().add(form);
        form.setVisible(true);
    }//GEN-LAST:event_mostrarLista

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
        tfCodigo.setText("");
        tfValor.setText("");
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btConfirmar.setEnabled(true);
        this.operacao = Operacao.INSERIR;
        tfOperacao.setText(this.operacao.name());
    }//GEN-LAST:event_aoClicarInserir
    
    private void aoClicarConfirmar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConfirmar
        switch (operacao) {
            case INSERIR:
            try {
                ItemDoOrcamentoController itemDoOrcamentoController = DaoFactory.criarItemDoOrcamentoController();
                ItemDoOrcamento itemDoOrcamento = new ItemDoOrcamento();

                itemDoOrcamento.setServico(tfServico.getText());
                itemDoOrcamento.setOrcamento((Orcamento)listaOrcamento.getSelectedItem());
                itemDoOrcamento.getOrcamento().setCliente((Cliente)listaCliente.getSelectedItem());
                itemDoOrcamento.setValor(new BigDecimal(tfValor.getText()));

                itemDoOrcamentoController.inserir(itemDoOrcamento);
                JOptionPane.showMessageDialog(null, "Operação Concluída com Sucesso", "Inserção", JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                btConfirmar.setEnabled(false);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Inserção",JOptionPane.ERROR_MESSAGE);
            }
            break;


            case ALTERAR:
            try {
                OrcamentoController orcamentoController = DaoFactory.criarOrcamentoController();
                Orcamento orcamento = new Orcamento();

                orcamento.setIdOrcamento(Integer.parseInt(tfCodigo.getText()));
                //Date dataRegistro = formatter.parse(tfRegistro.getText());
                //Date dataAgendamento = formatter.parse(tfAgendamento.getText());

                //orcamento.setDataRegistro(dataRegistro);
                //orcamento.setDataAgendamento(dataAgendamento);
                orcamento.setCliente((Cliente)listaCliente.getSelectedItem());
                //orcamento.setPlano(tfPlano.getText());
                //orcamento.setObservacao(tfObs.getText());

                orcamentoController.atualizar(orcamento);
                JOptionPane.showMessageDialog(null,"Operação Concluída com Sucesso","Alteração",JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                btConfirmar.setEnabled(false);

            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Houve um erro na alteração","Alteração",JOptionPane.ERROR_MESSAGE);
            }
            break;

            case EXCLUIR:
            try {
                OrcamentoController orcamentoController = DaoFactory.criarOrcamentoController();
                Orcamento orcamento = new Orcamento();
                //Date dataRegistro = formatter.parse(tfRegistro.getText());
                //Date dataAgendamento = formatter.parse(tfAgendamento.getText());

                orcamento.setIdOrcamento(Integer.parseInt(tfCodigo.getText()));
                //orcamento.setDataRegistro(dataRegistro);
                //orcamento.setDataAgendamento(dataAgendamento);
                orcamento.setCliente((Cliente)listaCliente.getSelectedItem());
                //orcamento.setPlano(tfPlano.getText());
                //orcamento.setObservacao(tfObs.getText());

                orcamentoController.deletarPorId(orcamento);
                JOptionPane.showMessageDialog(null,"Operação Concluída com Sucesso","Exclusão",JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                btConfirmar.setEnabled(false);

                tfCodigo.setText("");
                //tfRegistro.setText("");
                //tfAgendamento.setText("");
                //tfPlano.setText("");
                //tfObs.setText("");
                tfPesquisar.setText("");
                tfPesquisar.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Houve um erro na exclusão","Exclusão",JOptionPane.ERROR_MESSAGE);
            }
            break;
        }
    }//GEN-LAST:event_aoClicarConfirmar

    private void aoClicarBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarBuscar
        try {
            
            ItemDoOrcamentoController itemDoOrcamentoController = DaoFactory.criarItemDoOrcamentoController();
            ItemDoOrcamento itemDoOrcamento =  new ItemDoOrcamento();
            Orcamento orcamento = new Orcamento();
            Cliente cliente = new Cliente();
            
            itemDoOrcamento = itemDoOrcamentoController.buscarPorId(Integer.parseInt(tfPesquisar.getText()));
            tfCodigo.setText(String.valueOf(itemDoOrcamento.getIdItemDoOrcamento()));
            tfValor.setText(itemDoOrcamento.getValor().toString());
            tfServico.setText(itemDoOrcamento.getServico());
            
            cliente = orcamento.getCliente();
            listaCliente.setSelectedItem(cliente);
            orcamento.getIdOrcamento();
            listaOrcamento.setSelectedItem(orcamento);
            tfPesquisar.requestFocus();
            
            
            itemDoOrcamento.getDente();
            listaDente.setSelectedItem(itemDoOrcamento);
            //"Erro ao Pesquisar"

            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
            btConfirmar.setEnabled(false);
            this.operacao = Operacao.BUSCAR;
            tfOperacao.setText(this.operacao.name());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            tfPesquisar.requestFocus();
        }
    }//GEN-LAST:event_aoClicarBuscar

    private void listaOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaOrcamentoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<Cliente> listaCliente;
    private javax.swing.JComboBox<String> listaDente;
    private javax.swing.JComboBox<Orcamento> listaOrcamento;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfOperacao;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfServico;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}