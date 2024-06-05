package model.view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.controller.UsuarioController;
import model.dao.DaoFactory;
import model.entities.Usuario;
import model.entities.enums.Operacao;

public class ManterUsuario extends javax.swing.JInternalFrame {
    
    private Operacao operacao;

    /**
     * Creates new form ManterUsuario
     */
    public ManterUsuario() {
        initComponents();
    }

    public JButton getBtAlterar() {
        return btAlterar;
    }

    public JButton getBtConfirmar() {
        return btConfirmar;
    }

    public JButton getBtExcluir() {
        return btExcluir;
    }

    public JTextField getTfOperacao() {
        return tfOperacao;
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
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manter Usuario");

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
                .addComponent(tfOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel1.setText("Codigo:*");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:*");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Login:*");

        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });

        jLabel4.setText("Cargo:*");

        jLabel5.setText("Senha:*");

        jLabel6.setText("Email:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSenha)
                                    .addComponent(tfLogin)))
                            .addComponent(tfNome)
                            .addComponent(tfEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aoClicarBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarBuscar
        try {
            UsuarioController usuarioController = DaoFactory.criarUsuarioController();
            Usuario usuario = usuarioController.buscarPorId(Integer.parseInt(tfPesquisar.getText()));
            tfCodigo.setText(String.valueOf(usuario.getIdUsuario()));
            tfNome.setText(usuario.getNome());
            tfCargo.setText(usuario.getCargo());
            tfLogin.setText(usuario.getLogin());
            tfSenha.setText(usuario.getSenha());
            tfEmail.setText(usuario.getEmail());
            tfPesquisar.requestFocus();

            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
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

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        btConfirmar.setEnabled(true);
        this.operacao = Operacao.ALTERAR;
        tfOperacao.setText(this.operacao.name());
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(null,"Deseja Excluir o Registro?","Exclusão de Registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        String login = tfLogin.getText();
        
        if (!login.equals("admin")) {
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
        }
        else {
            JOptionPane.showMessageDialog(null,"Você não pode deletar o ADMINISTRADOR!","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aoClicarExcluir

    private void mostrarLista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarLista
        ListaUsuario form = new ListaUsuario();
        Operacao operacao = Operacao.INATIVO;
        getDesktopPane().add(form);
        form.setVisible(true);
    }//GEN-LAST:event_mostrarLista

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
        tfCodigo.setText("");
        tfNome.setText("");
        tfCargo.setText("");
        tfLogin.setText("");
        tfSenha.setText("");
        tfEmail.setText("");
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
                UsuarioController usuarioController = DaoFactory.criarUsuarioController();
                Usuario usuario = new Usuario();
                usuario.setNome(tfNome.getText());
                usuario.setCargo(tfCargo.getText());
                usuario.setLogin(tfLogin.getText());
                usuario.setSenha(tfSenha.getText());
                usuario.setEmail(tfEmail.getText());

                usuarioController.inserir(usuario);
                JOptionPane.showMessageDialog(null, "Operação Concluída com Sucesso", "Inserção", JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                btConfirmar.setEnabled(false);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Inserção",JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            break;

            case ALTERAR:
            try {
                UsuarioController usuarioController = DaoFactory.criarUsuarioController();
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(Integer.parseInt(tfCodigo.getText()));
                usuario.setNome(tfNome.getText());
                usuario.setCargo(tfCargo.getText());
                usuario.setLogin(tfLogin.getText());
                usuario.setSenha(tfSenha.getText());
                usuario.setEmail(tfEmail.getText());

                usuarioController.atualizar(usuario);
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
                UsuarioController usuarioController = DaoFactory.criarUsuarioController();
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(Integer.parseInt(tfCodigo.getText()));
                usuario.setNome(tfNome.getText());
                usuario.setCargo(tfCargo.getText());
                usuario.setLogin(tfLogin.getText());
                usuario.setSenha(tfSenha.getText());
                usuario.setEmail(tfEmail.getText());

                usuarioController.deletarPorId(usuario.getIdUsuario());
                JOptionPane.showMessageDialog(null,"Operação Concluída com Sucesso","Exclusão",JOptionPane.INFORMATION_MESSAGE);
                this.operacao = Operacao.INATIVO;
                tfOperacao.setText(this.operacao.name());
                btConfirmar.setEnabled(false);

                tfCodigo.setText("");
                tfNome.setText("");
                tfCargo.setText("");
                tfLogin.setText("");
                tfSenha.setText("");
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

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginActionPerformed


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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfOperacao;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
}
