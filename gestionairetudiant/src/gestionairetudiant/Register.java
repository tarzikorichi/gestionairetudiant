/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionairetudiant;

/**
 *
 * @author Elias
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        NomPrenom = new javax.swing.JTextField();
        Depert = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Passwd = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomPrenom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(NomPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 110, 310, 40));

        Depert.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Depert, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 210, 310, 40));

        Email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 310, 310, 40));

        Passwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 410, 310, 40));

        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionairetudiant/images/RegisterBn.png"))); // NOI18N
        Register.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Register.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 470, 190, 60));

        Annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionairetudiant/images/annul.png"))); // NOI18N
        Annuler.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Annuler.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        getContentPane().add(Annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 470, 180, 60));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionairetudiant/images/RegisterBg.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnulerActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JLabel Bg;
    private javax.swing.JTextField Depert;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField NomPrenom;
    private javax.swing.JTextField Passwd;
    private javax.swing.JButton Register;
    // End of variables declaration//GEN-END:variables
}