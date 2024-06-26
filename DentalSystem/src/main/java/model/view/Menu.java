package model.view;

import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.entities.enums.Operacao;

public class Menu extends javax.swing.JFrame {
    
    private String usuarioLogado;
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setSize(1366, 768);
        setLocation(300, 50);
    }
    
    public Menu(String usuarioLogado) {
        initComponents();
        this.usuarioLogado = usuarioLogado;
        autenticar();
        setSize(1366, 768);
        setLocation(350, 50);
    }
    
    private void autenticar() {
        if (!"admin".equals(usuarioLogado)) {
            barraUsuario.setVisible(false);
        }
    }
    
    public void centralizar(JDesktopPane pane) {
        int paneWidth = pane.getWidth();
        int paneHeigh = pane.getHeight();
        int width = this.getWidth();
        int height = this.getHeight();
        
        int x = (paneWidth - width) / 2;
        int y = (paneHeigh - height) / 2;
        
        this.setLocation(x, y);
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public JTextField getTfloginAtivo() {
        return tfloginAtivo;
    }

    public JMenuItem getManterUsuario() {
        return ManterUsuario;
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
        tfloginAtivo = new javax.swing.JTextField();
        btDesconectar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        barraUsuario = new javax.swing.JMenu();
        ManterUsuario = new javax.swing.JMenuItem();
        barraCliente = new javax.swing.JMenu();
        ManterCliente = new javax.swing.JMenuItem();
        barraOrcamento = new javax.swing.JMenu();
        ManterOrcamento = new javax.swing.JMenuItem();
        barraItemDoOrcamento = new javax.swing.JMenu();
        ManterItemOrcamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(1360, 768));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktop.setMaximumSize(new java.awt.Dimension(1360, 720));
        desktop.setPreferredSize(new java.awt.Dimension(1920, 1080));

        tfloginAtivo.setEditable(false);

        btDesconectar.setText("Desconectar");
        btDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesconectarActionPerformed(evt);
            }
        });

        desktop.setLayer(tfloginAtivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(btDesconectar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tfloginAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1086, Short.MAX_VALUE)
                .addComponent(btDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfloginAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(723, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 330, Short.MAX_VALUE))
        );

        barraUsuario.setText("Usuario");

        ManterUsuario.setText("Manter Usuario");
        ManterUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirUsuario(evt);
            }
        });
        barraUsuario.add(ManterUsuario);

        menu.add(barraUsuario);

        barraCliente.setText("Cliente");

        ManterCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ManterCliente.setText("Manter Cliente");
        ManterCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCliente(evt);
            }
        });
        barraCliente.add(ManterCliente);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        desktop.revalidate();
        desktop.repaint();
    }//GEN-LAST:event_abrirCliente

    private void abrirOrcamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirOrcamento
        ManterOrcamento tela = new ManterOrcamento();
        Operacao operacao = Operacao.INATIVO;
        desktop.add(tela);
        tela.setVisible(true);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtConfirmar().setEnabled(false);
        tela.getBtValorTotal().setEnabled(false);
        tela.getTfOperacao().setText(operacao.name());
        
        desktop.revalidate();
        desktop.repaint();
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
        
        desktop.revalidate();
        desktop.repaint();
    }//GEN-LAST:event_abrirItemOrcamento

    private void abrirUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirUsuario
        try {
            String usuario = this.usuarioLogado;
            
            if (usuario.equals("admin")) {
                ManterUsuario tela = new ManterUsuario();
                Operacao operacao = Operacao.INATIVO;
                desktop.add(tela);
                tela.setVisible(true);
                tela.getBtExcluir().setEnabled(false);
                tela.getBtAlterar().setEnabled(false);
                tela.getBtConfirmar().setEnabled(false);
                tela.getTfOperacao().setText(operacao.name()); 
            }
            else {
                JOptionPane.showMessageDialog(null,"Você não tem permissão para acessar essa área!","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo inesperado ocorreu. Acesso negado!","ERRO",JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_abrirUsuario

    private void btDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesconectarActionPerformed
        Login tela = new Login();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDesconectarActionPerformed
    
    // Responsável por setar o LAF como Nimbus
    public static void setNimbusLAF() {
        try {
          for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
              UIManager.setLookAndFeel(info.getClassName());
              break;
            }
          }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }
    }
    
    // Executável
    public static void main(String args[]) {
        setNimbusLAF();
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ManterCliente;
    private javax.swing.JMenuItem ManterItemOrcamento;
    private javax.swing.JMenuItem ManterOrcamento;
    private javax.swing.JMenuItem ManterUsuario;
    private javax.swing.JMenu barraCliente;
    private javax.swing.JMenu barraItemDoOrcamento;
    private javax.swing.JMenu barraOrcamento;
    private javax.swing.JMenu barraUsuario;
    private javax.swing.JButton btDesconectar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField tfloginAtivo;
    // End of variables declaration//GEN-END:variables
}
