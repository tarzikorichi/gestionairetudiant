/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionairetudiant;

import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Elias
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lgemail = new javax.swing.JTextField();
        LgPwd = new javax.swing.JTextField();
        LoginBnt = new javax.swing.JButton();
        InscrirLabel = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lgemail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Lgemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LgemailActionPerformed(evt);
            }
        });
        getContentPane().add(Lgemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 310, 50));

        LgPwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(LgPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 310, 40));

        LoginBnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionairetudiant/images/ConnectBn.png"))); // NOI18N
        LoginBnt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoginBnt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoginBnt.setPreferredSize(new java.awt.Dimension(379, 66));
        LoginBnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBntMouseClicked(evt);
            }
        });
        LoginBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBntActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 379, 66));

        InscrirLabel.setBackground(new java.awt.Color(102, 102, 0));
        InscrirLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InscrirLabel.setForeground(new java.awt.Color(102, 102, 255));
        InscrirLabel.setText("Créer un compte");
        InscrirLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InscrirLabelMouseClicked(evt);
            }
        });
        getContentPane().add(InscrirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 303, 120, 40));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionairetudiant/images/LoginBg.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LgemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LgemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LgemailActionPerformed

    private void LoginBntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBntMouseClicked

    }//GEN-LAST:event_LoginBntMouseClicked

     public static Connection cnx=DBConnexion.ConnectDB();
     PreparedStatement prepared = null;
     ResultSet rs = null;
    private void LoginBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBntActionPerformed
        String email= Lgemail.getText();
        String Password = LgPwd.getText();
       
    }//GEN-LAST:event_LoginBntActionPerformed

    private void InscrirLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InscrirLabelMouseClicked
        Register Reg = new Register();
        Reg.setVisible(true);
    }//GEN-LAST:event_InscrirLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel InscrirLabel;
    private javax.swing.JTextField LgPwd;
    private javax.swing.JTextField Lgemail;
    private javax.swing.JButton LoginBnt;
    // End of variables declaration//GEN-END:variables
}
