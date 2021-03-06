package acesso;

import java.sql.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jean.zimmermann
 */
public class TelaAdm extends javax.swing.JFrame {

    final void buscaDeDados() {

        try {
            String un = "Adm";
            String pw = "1234";
            String url = "jdbc:mysql://localhost:3306/new_schema";
            Connection conn = DriverManager.getConnection(url, un, pw);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM dep";
            ResultSet rs = stmt.executeQuery(Query);
            DefaultListModel DLM = new DefaultListModel();
            while (rs.next()) {
                DLM.addElement(rs.getString(1));
            }
            Lista.setModel(DLM);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public TelaAdm() {
        initComponents();
        buscaDeDados();
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
        Lista = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        depId = new javax.swing.JTextField();
        Departamento = new javax.swing.JTextField();
        AcessoCode = new javax.swing.JTextField();
        Fechamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 290));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dep ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Departamento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Acesso Code");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Fechamento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 30));
        getContentPane().add(depId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 170, 30));
        getContentPane().add(Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 170, 30));
        getContentPane().add(AcessoCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, 30));
        getContentPane().add(Fechamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged
            try {
            String un = "Adm";
            String pw = "1234";
            String url = "jdbc:mysql://localhost:3306/new_schema";
            Connection conn = DriverManager.getConnection(url, un, pw);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM dep WHERE dep_id = '"+Lista.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
            
            while (rs.next()) {
                depId.setText(rs.getString(1));
                Departamento.setText(rs.getString(2));
                AcessoCode.setText(rs.getString(3));
                Fechamento.setText(rs.getString(4));
                
            }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ListaValueChanged

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
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdm().setVisible(true);
                
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcessoCode;
    private javax.swing.JTextField Departamento;
    private javax.swing.JTextField Fechamento;
    private javax.swing.JList<String> Lista;
    private javax.swing.JTextField depId;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
