/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Mainframe;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import business.EcoSystem;

/**
 *
 * @author shah0
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
     private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() {
        initComponents();
        
        system = dB4OUtil.retrieveSystem();
        this.setSize(1080, 680);
        this.setExtendedState(MainJFrame.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        NamejLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SignupjButton = new javax.swing.JButton();
        SigninjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopPanel.setBackground(new java.awt.Color(255, 204, 153));
        TopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NamejLabel.setFont(new java.awt.Font("Monaco", 1, 48)); // NOI18N
        NamejLabel.setForeground(new java.awt.Color(51, 102, 255));
        NamejLabel.setText("Women Abuse Reporting System");
        TopPanel.add(NamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 780, 50));

        getContentPane().add(TopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1410, 90));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -270, 1070, 830));

        SignupjButton.setBackground(new java.awt.Color(255, 255, 255));
        SignupjButton.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        SignupjButton.setForeground(new java.awt.Color(230, 126, 34));
        SignupjButton.setText("Sign Up");
        SignupjButton.setBorderPainted(false);
        SignupjButton.setContentAreaFilled(false);
        SignupjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupjButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupjButtonMouseEntered(evt);
            }
        });
        SignupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignupjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        SigninjButton.setBackground(new java.awt.Color(255, 255, 255));
        SigninjButton.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        SigninjButton.setForeground(new java.awt.Color(230, 126, 34));
        SigninjButton.setText("Sign In");
        SigninjButton.setBorderPainted(false);
        SigninjButton.setContentAreaFilled(false);
        SigninjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SigninjButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SigninjButtonMouseEntered(evt);
            }
        });
        SigninjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SigninjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 93, 1410, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SigninjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninjButtonMouseExited
        SigninjButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_SigninjButtonMouseExited

    private void SigninjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninjButtonMouseEntered
        SigninjButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_SigninjButtonMouseEntered

    private void SigninjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninjButtonActionPerformed
        this.dispose();
        SignInJFrame eng = new SignInJFrame();
        eng.setVisible(true);
    }//GEN-LAST:event_SigninjButtonActionPerformed

    private void SignupjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupjButtonMouseExited
        SignupjButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_SignupjButtonMouseExited

    private void SignupjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupjButtonMouseEntered
        SignupjButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_SignupjButtonMouseEntered

    private void SignupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupjButtonActionPerformed
        this.dispose();
        SignUpJFrame eng = new SignUpJFrame();
        eng.setVisible(true);
    }//GEN-LAST:event_SignupjButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Daksh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NamejLabel;
    private javax.swing.JButton SigninjButton;
    private javax.swing.JButton SignupjButton;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
