
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class dataBank {
    Connection connection;
    Statement statement;
    
    String Nama, NIM, Saldo;
    int PIN;
    
    void getData(String nim){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_sederhana", "Diky", "Dikypass123");
            statement = (Statement) connection.createStatement();
            String NM = "SELECT * FROM `data` WHERE NIM='"+nim+"'";
            ResultSet resultSet = statement.executeQuery(NM);
            
            while (resultSet.next()){
                Nama = resultSet.getString("Nama");
                NIM = resultSet.getString("NIM");
                Saldo = resultSet.getString("Saldo");
                PIN = resultSet.getInt("PIN");
            }
        }
        catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }
    
    void updatePINtoDatabase(String ab, String nim){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_sederhana", "Diky", "Dikypass123");
            statement = (Statement) connection.createStatement();
            String NM = "UPDATE `data` SET `PIN`='"+ab+"' WHERE NIM='"+nim+"'";
            statement.execute(NM);
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    void addDataToDatabase(String pn, String nama, String nim){
        String newPin = new String(pn);
        int pin = Integer.parseInt(newPin);
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_sederhana", "Diky", "Dikypass123");
            statement = (Statement) connection.createStatement();
            String NM = "INSERT INTO data VALUES (0,'"+nama+"','"+nim+"','"+pin+"', 0)";
            statement.execute(NM);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void cekIfNimExist(String nm){
        Register reg = new Register();
        String nim = new String(nm);
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_sederhana", "Diky", "Dikypass123");//Crating connection with database
            statement = (Statement) connection.createStatement();//crating statement object
            String NM = "SELECT * FROM `data` WHERE NIM='"+nm+"'";//Storing MySQL query in A string variable
            ResultSet resultSet = statement.executeQuery(NM);
            
            while (resultSet.next()) {
                String NIM = resultSet.getString("NIM");
                if(nim.equalsIgnoreCase(NIM)){
                    JOptionPane.showMessageDialog(null, "NIM Sudah Terdaftar");//When invalid username is entered
                    reg.refresh();
                }
            }
            if (resultSet == null) {
                reg.comparePassword();
            }
        } 
        catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
