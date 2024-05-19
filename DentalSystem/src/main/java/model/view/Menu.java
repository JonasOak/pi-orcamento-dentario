package model.view;

import javax.swing.JDesktopPane;
import model.entities.enums.Operacao;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setSize(1200, 800);
        setLocation(350, 50);
    }

    public JDesktopPane getDesktop() {
        return desktop;
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
        desktop = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        barraUsuario = new javax.swing.JMenu();
        barraCliente = new javax.swing.JMenu();
        CadastrarCliente = new javax.swing.JMenuItem();
        barraOrcamento = new javax.swing.JMenu();
        ManterOrcamento = new javax.swing.JMenuItem();
        barraItemDoOrcamento = new javax.swing.JMenu();
        ManterItemOrcamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(1360, 768));

        desktop.setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        barraUsuario.setText("Usuario");
        menu.add(barraUsuario);

        barraCliente.setText("Cliente");

        CadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CadastrarCliente.setText("Manter Cliente");
        CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCliente(evt);
            }
        });
        barraCliente.add(CadastrarCliente);

        menu.add(barraCliente);

        barraOrcamento.setText("Orcamento");

        ManterOrcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ManterOrcamento.setText("Manter Orcamento");
        ManterOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirOrcamento(evt);
            }
        });
        barraOrcamento.add(ManterOrcamento);

        menu.add(barraOrcamento);

        barraItemDoOrcamento.setText("Item Orcamento");

        ManterItemOrcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ManterItemOrcamento.setText("Manter Item Orcamento");
        ManterItemOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirItemOrcamento(evt);
            }
        });
        barraItemDoOrcamento.add(ManterItemOrcamento);

        menu.add(barraItemDoOrcamento);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCliente

        ManterCliente tela = new ManterCliente();
        Operacao operacao = Operacao.INATIVO;
        desktop.add(tela);
        tela.setVisible(true);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtConfirmar().setEnabled(false);
        tela.getTfOperacao().setText(operacao.name());    
    }//GEN-LAST:event_abrirCliente

    private void abrirOrcamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirOrcamento
        ManterOrcamento tela = new ManterOrcamento();
        Operacao operacao = Operacao.INATIVO;
        desktop.add(tela);
        tela.setVisible(true);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtConfirmar().setEnabled(false);
        tela.getTfOperacao().setText(operacao.name());
    }//GEN-LAST:event_abrirOrcamento

    private void abrirItemOrcamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirItemOrcamento
        ManterItemDoOrcamento tela = new ManterItemDoOrcamento();
        Operacao operacao = Operacao.INATIVO;
        desktop.add(tela);
        tela.setVisible(true);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtConfirmar().setEnabled(false);
        tela.getTfOperacao().setText(operacao.name());
    }//GEN-LAST:event_abrirItemOrcamento

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarCliente;
    private javax.swing.JMenuItem ManterItemOrcamento;
    private javax.swing.JMenuItem ManterOrcamento;
    private javax.swing.JMenu barraCliente;
    private javax.swing.JMenu barraItemDoOrcamento;
    private javax.swing.JMenu barraOrcamento;
    private javax.swing.JMenu barraUsuario;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
