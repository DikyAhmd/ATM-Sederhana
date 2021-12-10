
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class Report extends javax.swing.JFrame {
    Connection connection;//Creating object of Connection class
    Statement statement;//Creating object of Statement class
    /**
     * Creates new form Payment
     */
    public Report() {
        initComponents();
    }
    
    String nim;
    
    void setData(String n){
        nim = n;
    }
    
    void loadDatabase(String name){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_sederhana", "Diky", "Dikypass123");
            statement = (Statement) connection.createStatement();
            String NM = "SELECT * FROM reports WHERE Sender='"+name+"' OR Recepient='"+name+"'";
            ResultSet resultSet = statement.executeQuery(NM);
            DefaultTableModel table = (DefaultTableModel)Table.getModel();
            while (resultSet.next()) {
                String sender = resultSet.getString("Sender");
                String recepient = resultSet.getString("Recepient");
                String amount = resultSet.getString("Amount");
                String tbData[] = {sender,recepient,amount};
                table.addRow(tbData);
            }           
        } 
        catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK DIGITAL");
        getContentPane().setLayout(null);

        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(20, 20, 20, 20);

        Table.setBackground(new java.awt.Color(245, 245, 245));
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Recepient", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setDoubleBuffered(true);
        Table.setEnabled(false);
        Table.setGridColor(new java.awt.Color(245, 245, 245));
        Table.setRowHeight(25);
        Table.setSelectionBackground(new java.awt.Color(245, 245, 245));
        Table.setSelectionForeground(new java.awt.Color(245, 245, 245));
        Table.setShowGrid(true);
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 310, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Irfan\\Documents\\NetBeansProjects\\Project_Kuliah\\img\\Report.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 500);

        setBounds(1550, 200, 366, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        Home home =  new Home();
        home.setData(nim);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}