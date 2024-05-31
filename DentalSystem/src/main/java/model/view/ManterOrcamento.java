package model.view;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.controller.OrcamentoController;
import model.dao.DaoFactory;
import model.entities.Cliente;
import model.entities.Orcamento;
import model.entities.enums.Operacao;
import static model.entities.enums.Operacao.ALTERAR;
import static model.entities.enums.Operacao.EXCLUIR;
import static model.entities.enums.Operacao.INSERIR;

public class ManterOrcamento extends javax.swing.JInternalFrame {

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Operacao operacao;
    
    /**
     * Creates new form ManterOrcamento
     */
    public ManterOrcamento() {
        initComponents();
        povoarCliente();
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

    public JButton getBtValorTotal() {
        return btValorTotal;
    }

    public JTextField getTfOperacao() {
        return tfOperacao;
    }
    
    private void povoarCliente(){
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tfPesquisar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfOperacao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfPlano = new javax.swing.JTextField();
        tfObs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        listaCliente = new javax.swing.JComboBox<>();
        tfRegistro = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        tfAgendamento = new javax.swing.JFormattedTextField();
        btValorTotal = new javax.swing.JButton();
        tfValorTotal = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Manter Orcamento");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(759, 332));

        jLabel7.setText("Digite o código:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarBuscar(evt);
            }
        });

        jLabel9.setText("Operação atual:");

        tfOperacao.setEditable(false);
        tfOperacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(123, 123, 123)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tfOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel1.setText("Codigo:");

        jLabel2.setText("Data registro:");

        jLabel3.setText("Plano:");

        jLabel4.setText("Observação:");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlanoActionPerformed(evt);
            }
        });

        tfObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfObsActionPerformed(evt);
            }
        });

        jLabel6.setText("Cliente:");

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarInserir(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });

        btListar.setText("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarLista(evt);
            }
        });

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConfirmar(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });

        listaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClienteActionPerformed(evt);
            }
        });

        tfRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        tfRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRegistroActionPerformed(evt);
            }
        });

        jLabel10.setText("Data agendamento:");

        tfAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        btValorTotal.setText("Valor total orçamento");
        btValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarValorTotal(evt);
            }
        });

        tfValorTotal.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfObs, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfAgendamento)
                                .addComponent(listaCliente, 0, 197, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfValorTotal)
                                    .addComponent(btValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(listaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(tfObs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void aoClicarBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarBuscar
        try {
            OrcamentoController orcamentoController = DaoFactory.criarOrcamentoController();
            
            Orcamento orcamento = orcamentoController.buscarPorId(Integer.parseInt(tfPesquisar.getText()));
            tfCodigo.setText(String.valueOf(orcamento.getIdOrcamento()));
            tfRegistro.setText(formatter.format(orcamento.getDataRegistro()));
            tfAgendamento.setText(formatter.format(orcamento.getDataAgendamento()));
            Cliente c = orcamento.getCliente();
            listaCliente.setSelectedItem(c);
            tfPlano.setText(orcamento.getPlano());
            tfObs.setText(orcamento.getObservacao());
            tfPesquisar.requestFocus();

            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
            btValorTotal.setEnabled(true);
            btConfirmar.setEnabled(false);
            this.operacao = Operacao.BUSCAR;
            tfOperacao.setText(this.operacao.name());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao Pesquisar","Erro",JOptionPane.ERROR_MESSAGE);
            tfPesquisar.requestFocus();
        }
    }//GEN-LAST:event_aoClicarBuscar

    private void listaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaClienteActionPerformed

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(null,"Deseja Excluir o Registro?","Exclusão de Registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (resp == 0) {
            this.operacao = Operacao.EXCLUIR;
            tfOperacao.setText(this.operacao.name());
            this.aoClicarConfirmar(evt);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btValorTotal.setEnabled(false);
        }
        else {
            tfPesquisar.requestFocus();
        }
    }//GEN-LAST:event_aoClicarExcluir

    private void aoClicarConfirmar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConfirmar
        switch (operacao) {
            case INSERIR:
            try {
                OrcamentoController orcamentoController = DaoFactory.criarOrcamentoController();
                Orcamento orcamento = new Orcamento();
                Date dataRegistro = formatter.parse(tfRegistro.getText());
                Date dataAgendamento = formatter.parse(tfAgendamento.getText());
                
                orcamento.setDataRegistro(dataRegistro);
                orcamento.setDataAgendamento(dataAgendamento);
                orcamento.setCliente((Cliente)listaCliente.getSelectedItem());
                orcamento.setPlano(tfPlano.getText());
                orcamento.setObservacao(tfObs.getText());

                orcamentoController.inserir(orcamento);
                JOptionPane.showMessageDialog(null, "Operação Concluída com Sucesso", "Inserção", JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                tfValorTotal.setText("");
                btValorTotal.setEnabled(false);
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
                Date dataRegistro = formatter.parse(tfRegistro.getText());
                Date dataAgendamento = formatter.parse(tfAgendamento.getText());
                
                orcamento.setDataRegistro(dataRegistro);
                orcamento.setDataAgendamento(dataAgendamento);
                orcamento.setCliente((Cliente)listaCliente.getSelectedItem());
                orcamento.setPlano(tfPlano.getText());
                orcamento.setObservacao(tfObs.getText());

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
                Date dataRegistro = formatter.parse(tfRegistro.getText());
                Date dataAgendamento = formatter.parse(tfAgendamento.getText());
                
                orcamento.setIdOrcamento(Integer.parseInt(tfCodigo.getText()));
                orcamento.setDataRegistro(dataRegistro);
                orcamento.setDataAgendamento(dataAgendamento);
                orcamento.setCliente((Cliente)listaCliente.getSelectedItem());
                orcamento.setPlano(tfPlano.getText());
                orcamento.setObservacao(tfObs.getText());

                orcamentoController.deletarPorId(orcamento.getIdOrcamento());
                JOptionPane.showMessageDialog(null,"Operação Concluída com Sucesso","Exclusão",JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                btConfirmar.setEnabled(false);

                tfCodigo.setText("");
                tfRegistro.setText("");
                tfAgendamento.setText("");
                tfPlano.setText("");
                tfObs.setText("");
                tfPesquisar.setText("");
                tfPesquisar.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Houve um erro na exclusão","Exclusão",JOptionPane.ERROR_MESSAGE);
            }
            break;
        }
    }//GEN-LAST:event_aoClicarConfirmar

    private void mostrarLista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarLista
        ListaOrcamento form = new ListaOrcamento();
        Operacao operacao = Operacao.INATIVO;
        getDesktopPane().add(form);
        form.setVisible(true);
    }//GEN-LAST:event_mostrarLista

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        btConfirmar.setEnabled(true);
        btValorTotal.setEnabled(false);
        this.operacao = Operacao.ALTERAR;
        tfOperacao.setText(this.operacao.name());
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
        tfCodigo.setText("");
        tfRegistro.setText("");
        tfAgendamento.setText("");
        tfPlano.setText("");
        tfObs.setText("");
        tfValorTotal.setText("");
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btValorTotal.setEnabled(false);
        btConfirmar.setEnabled(true);
        this.operacao = Operacao.INSERIR;
        tfOperacao.setText(this.operacao.name());
    }//GEN-LAST:event_aoClicarInserir

    private void tfObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfObsActionPerformed

    private void tfPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanoActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRegistroActionPerformed

    private void aoClicarValorTotal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarValorTotal
        try {
            OrcamentoController orcamentoController = DaoFactory.criarOrcamentoController();
            
            BigDecimal valorTotal = orcamentoController.exibirValorTotal(Integer.parseInt(tfPesquisar.getText()));
            tfValorTotal.setText(valorTotal.toString());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Não há itens neste orçamento!","Erro",JOptionPane.ERROR_MESSAGE);
            tfPesquisar.requestFocus();
        }
    }//GEN-LAST:event_aoClicarValorTotal

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btValorTotal;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<Cliente> listaCliente;
    private javax.swing.JFormattedTextField tfAgendamento;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfObs;
    private javax.swing.JTextField tfOperacao;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfPlano;
    private javax.swing.JFormattedTextField tfRegistro;
    private javax.swing.JTextField tfValorTotal;
    // End of variables declaration//GEN-END:variables

}
