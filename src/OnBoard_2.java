/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Diky
 */
public class OnBoard_2 extends javax.swing.JFrame {

    /**
     * Creates new form exam
     */
    
    public OnBoard_2() {
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

        btnSkip = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();
        Bakground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK DIGITAL");
        getContentPane().setLayout(null);

        btnSkip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSkip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSkipMouseClicked(evt);
            }
        });
        getContentPane().add(btnSkip);
        btnSkip.setBounds(10, 450, 40, 20);

        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(297, 450, 40, 20);

        Bakground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\2_1.jpg")); // NOI18N
        getContentPane().add(Bakground);
        Bakground.setBounds(0, 0, 350, 500);

        setBounds(1550, 200, 366, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        OnBoard_3 ob3 = new OnBoard_3();
        ob3.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnSkipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSkipMouseClicked
        // TODO add your handling code here:
        Login_Menu login = new Login_Menu();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSkipMouseClicked

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
            java.util.logging.Logger.getLogger(OnBoard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnBoard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnBoard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnBoard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnBoard_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bakground;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnSkip;
    // End of variables declaration//GEN-END:variables
}
