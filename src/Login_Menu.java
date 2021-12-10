import java.awt.Font;
import java.awt.font.TextAttribute;
import javax.swing.*;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diky
 */
public class Login_Menu extends javax.swing.JFrame {

    int flag = 0;
    int PIN, click = 0;
    Font defaultreg;
    String Nama, NIM, Saldo;
    
    /**
     * Creates new form Form_Masuk
     */
    public Login_Menu() {
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

        showPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textPIN = new javax.swing.JPasswordField();
        textNIM = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK DIGITAL");
        getContentPane().setLayout(null);

        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword.setIcon(new javax.swing.ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\visibility_1.jpg")); // NOI18N
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(showPassword);
        showPassword.setBounds(270, 310, 40, 40);

        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\btn-login.png")); // NOI18N
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(20, 400, 310, 80);

        register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        register.setForeground(new java.awt.Color(0, 0, 0));
        register.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        register.setText("Register");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(210, 380, 50, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Don't have an account ?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 380, 130, 16);

        jPanel1.setOpaque(false);

        textPIN.setBackground(new java.awt.Color(255, 255, 255));
        textPIN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textPIN.setBorder(null);

        textNIM.setBackground(new java.awt.Color(255, 255, 255));
        textNIM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNIM.setBorder(null);
        textNIM.setMargin(new java.awt.Insets(2, 0, 2, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(textPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 210, 280, 160);

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\inputes_1.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 350, 500);

        setBounds(1550, 200, 366, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        // TODO add your handling code here:
        ImageIcon vis_1 = new ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\visibility_1.jpg");
        ImageIcon vis_2 = new ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\visibility_2.jpg");
        if(click==0){
            textPIN.setEchoChar((char)0);
            showPassword.setIcon(vis_2);
            click = 1;
        }
        else{
            textPIN.setEchoChar('*');
            showPassword.setIcon(vis_1);
            click = 0;
        }
    }//GEN-LAST:event_showPasswordMouseClicked

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        ImageIcon login = new ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\btn-login-2.png");
        btnLogin.setIcon(login);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        ImageIcon login = new ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\btn-login.png");
        btnLogin.setIcon(login);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        getDatabase();
    }//GEN-LAST:event_btnLoginMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        Register rgs = new Register();
        rgs.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        // TODO add your handling code here:
        defaultreg = register.getFont();
        Font font = register.getFont();
        Map attributes = font.getAttributes(); 
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        register.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        // TODO add your handling code here:
        register.setFont(defaultreg);
    }//GEN-LAST:event_registerMouseExited

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
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Menu().setVisible(true);
            }
        });
    }
    
    
    void getDatabase(){
        dataBank data = new dataBank();
        data.getData(textNIM.getText());
        if(data.NIM==null){
            JOptionPane.showMessageDialog(null, "Akun tidak ada..");
        }
        else{
            String stringPIN = new String(textPIN.getPassword());
            int registerPIN = Integer.parseInt(stringPIN);
            if(registerPIN==data.PIN){
                sendData();
            }
            else{
                if(textPIN.getPassword().length<6 || textPIN.getPassword().length>6){
                    JOptionPane.showMessageDialog(null, "PIN harus 6 Angka");
                }
                else {
                    JOptionPane.showMessageDialog(null, "PIN anda Salah");
                }
            }
        }
    }
     
    void sendData(){
        Home home = new Home();
        home.setData(textNIM.getText());
        home.setVisible(true);
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel register;
    private javax.swing.JLabel showPassword;
    private javax.swing.JTextField textNIM;
    private javax.swing.JPasswordField textPIN;
    // End of variables declaration//GEN-END:variables
}