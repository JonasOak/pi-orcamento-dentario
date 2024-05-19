package model.view;

import java.util.List;
import javax.swing.JOptionPane;
import model.controller.OrcamentoController;
import model.dao.DaoFactory;
import model.entities.OrcamentoTableModel;

public class ListaOrcamento extends javax.swing.JInternalFrame {

    public OrcamentoTableModel ctm;
    /**
     * Creates new form ListaOrcamento
     */
    public ListaOrcamento() {
        initComponents();
        
        ctm = new OrcamentoTableModel();
        tabela.setModel(ctm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Data registro", "Data agendamento", "Plano", "Observação"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAtualizar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aoClicarAtualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAtualizar
        try {
            OrcamentoController ot = DaoFactory.criarOrcamentoController();
            
            List orcamentos = ot.buscarTodos();
        
            ctm.setOrcamentos(orcamentos);
            tabela.revalidate(); 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Houve um erro na atualização","Atualização",JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_aoClicarAtualizar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}