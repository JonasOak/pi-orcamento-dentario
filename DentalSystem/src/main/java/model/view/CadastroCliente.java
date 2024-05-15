package model.view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.controller.ClienteController;
import model.dao.DaoFactory;
import model.entities.Cliente;
import model.entities.enums.Operacao;

public class CadastroCliente extends javax.swing.JInternalFrame {
    
    private Operacao operacao;

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfDocumento = new javax.swing.JTextField();
        tfUF = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfPesquisar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manter Cliente");

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Email:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        tfTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelActionPerformed(evt);
            }
        });

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Documento:");

        jLabel8.setText("UF:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfTel)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel7.setText("Digite o código:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarBuscar(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void aoClicarBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarBuscar
        try {
         ClienteController clienteController = DaoFactory.criarClienteController();
         Cliente cliente = clienteController.buscarPorId(Integer.parseInt(tfPesquisar.getText()));
         tfCodigo.setText(String.valueOf(cliente.getIdCliente()));
         tfDocumento.setText(cliente.getDocumento());
         tfNome.setText(cliente.getNomeCliente());
         tfEndereco.setText(cliente.getEndereco());
         tfUF.setText(cliente.getUf());
         tfTel.setText(cliente.getTelefone());
         tfEmail.setText(cliente.getEmail());
         
         btExcluir.setEnabled(true);
         btAlterar.setEnabled(true);
         btConfirmar.setEnabled(false);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao Pesquisar","Erro",JOptionPane.ERROR_MESSAGE);
            btExcluir.setEnabled(false);
            btAlterar.setEnabled(false);
        }
    }//GEN-LAST:event_aoClicarBuscar

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        btConfirmar.setEnabled(true);
        this.operacao = Operacao.ALTERAR;
    }//GEN-LAST:event_aoClicarAlterar

    private void mostrarLista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarLista
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarLista

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(null,"Deseja Excluir o Registro?","Exclusão de Registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        btExcluir.setEnabled(false);
        
        if (resp == 0) {
            this.operacao = Operacao.EXCLUIR;
            this.aoClicarConfirmar(evt);
            btAlterar.setEnabled(false);
        }
        else {
            tfPesquisar.requestFocus();
        }
    }//GEN-LAST:event_aoClicarExcluir

    
    private void aoClicarConfirmar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConfirmar
       switch (operacao) {
            case INSERIR:
                try {
                    ClienteController clienteController = DaoFactory.criarClienteController();
                    Cliente cliente = new Cliente(); 
                    cliente.setDocumento(tfDocumento.getText());
                    cliente.setNomeCliente(tfNome.getText());
                    cliente.setEndereco(tfEndereco.getText());
                    cliente.setUf(tfUF.getText());
                    cliente.setTelefone(tfTel.getText());
                    cliente.setEmail(tfEmail.getText());
                   
                    clienteController.inserir(cliente);
                    JOptionPane.showMessageDialog(null, "Operação Concluída com Sucesso", "Inserção", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Houve um erro na inserção","Inserção",JOptionPane.ERROR_MESSAGE);
                }
             break;
             
            case ALTERAR:
                try {
                    ClienteController clienteController = DaoFactory.criarClienteController();
                    Cliente cliente = new Cliente();
                    
                    cliente.setIdCliente(Integer.parseInt(tfCodigo.getText()));
                    cliente.setDocumento(tfDocumento.getText());
                    cliente.setNomeCliente(tfNome.getText());
                    cliente.setEndereco(tfEndereco.getText());
                    cliente.setUf(tfUF.getText());
                    cliente.setTelefone(tfTel.getText());
                    cliente.setEmail(tfEmail.getText());
                    
                    clienteController.atualizar(cliente);  
                    JOptionPane.showMessageDialog(null,"Operação Concluída com Sucesso","Alteração",JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Houve um erro na alteração","Alteração",JOptionPane.ERROR_MESSAGE);
                }
            break;
            
            case EXCLUIR:
                try {
                    ClienteController clienteController = DaoFactory.criarClienteController();
                    Cliente cliente = new Cliente();
                    
                    cliente.setIdCliente(Integer.parseInt(tfCodigo.getText()));
                    cliente.setDocumento(tfDocumento.getText());
                    cliente.setNomeCliente(tfNome.getText());
                    cliente.setEndereco(tfEndereco.getText());
                    cliente.setUf(tfUF.getText());
                    cliente.setTelefone(tfTel.getText());
                    cliente.setEmail(tfEmail.getText());
                    
                    clienteController.excluir(cliente);
                    JOptionPane.showMessageDialog(null,"Operação Concluída com Sucesso","Exclusão",JOptionPane.INFORMATION_MESSAGE);
                   
                    tfCodigo.setText("");
                    tfDocumento.setText("");
                    tfNome.setText("");
                    tfEndereco.setText("");
                    tfUF.setText("");
                    tfTel.setText("");
                    tfEmail.setText("");
                    tfPesquisar.setText("");
                    tfPesquisar.requestFocus();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Houve um erro na exclusão","Exclusão",JOptionPane.ERROR_MESSAGE);
                }
            break;
        } 
    }//GEN-LAST:event_aoClicarConfirmar

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
        tfCodigo.setText("");
        tfDocumento.setText("");
        tfNome.setText("");
        tfEndereco.setText("");
        tfUF.setText("");
        tfTel.setText("");
        tfEmail.setText("");
        btExcluir.setEnabled(false);
        btConfirmar.setEnabled(true);
        this.operacao = Operacao.INSERIR;
    }//GEN-LAST:event_aoClicarInserir
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btListar;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDocumento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfTel;
    private javax.swing.JTextField tfUF;
    // End of variables declaration//GEN-END:variables
}