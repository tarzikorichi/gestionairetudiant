/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionairetudiant;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Elias
 */
public class DBConnexion {
    static String username="root"; 
    static String password="";
    static String con_string="jdbc:mysql://localhost/tpdatabase";
    static Connection con=null;
    
    public  static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(con_string,username,password);
            System.out.println("Connected");
       
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }}

    PreparedStatement prepareStatement(String sql) {return (null);
 }
}
