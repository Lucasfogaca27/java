package pkApresentacao;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fluca
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setTitle("Tela Principal");
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemCadastro1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemConsultarContato = new javax.swing.JMenuItem();
        itemFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dPaneLayout = new javax.swing.GroupLayout(dPane);
        dPane.setLayout(dPaneLayout);
        dPaneLayout.setHorizontalGroup(
            dPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        dPaneLayout.setVerticalGroup(
            dPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");

        itemCadastro1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemCadastro1.setText("Cadastrar Contato");
        itemCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastro1ActionPerformed(evt);
            }
        });
        menuArquivo.add(itemCadastro1);
        menuArquivo.add(jSeparator1);

        itemConsultarContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemConsultarContato.setText("Consultar Contato");
        itemConsultarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarContatoActionPerformed(evt);
            }
        });
        menuArquivo.add(itemConsultarContato);

        itemFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemFechar.setText("Fechar");
        itemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharActionPerformed(evt);
            }
        });
        menuArquivo.add(itemFechar);

        jMenuBar1.add(menuArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastro1ActionPerformed
        CadastrarContato cadastrar = new CadastrarContato();
        cadastrar.setVisible(true);
        dPane.add(cadastrar);
    }//GEN-LAST:event_itemCadastro1ActionPerformed

    private void itemConsultarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarContatoActionPerformed
        ConsultarContato consultar = new ConsultarContato();
        consultar.setVisible(true);
        dPane.add(consultar);
    }//GEN-LAST:event_itemConsultarContatoActionPerformed

    private void itemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharActionPerformed
       Object[] opcoes = {"Sim", "Não"};
       int retorno = JOptionPane.showOptionDialog(null,
               "Tem certeza que deseja fechar?",
               "Fechar", JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE, null, 
               opcoes, opcoes[0]);
       if(retorno == 0){
           dispose();
       }
    }//GEN-LAST:event_itemFecharActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JDesktopPane dPane;
    private javax.swing.JMenuItem itemCadastro1;
    private javax.swing.JMenuItem itemConsultarContato;
    private javax.swing.JMenuItem itemFechar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArquivo;
    // End of variables declaration//GEN-END:variables
}
