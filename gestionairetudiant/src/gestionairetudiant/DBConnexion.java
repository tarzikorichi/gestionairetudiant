/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionairetudiant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Elias
 */
public class DBConnexion {
    Connection con = null;
    Statement stat = null;
    // ----- Hamza
    static JOptionPane Mssg =  new JOptionPane();
    static Connection ConnctDB = null;
    static PreparedStatement PstLog = null;
    static ResultSet ResSetLog = null;
    // -----    
    final static String dir = System.getProperty("user.dir");
    public static String url = dir+"\\dbEtudient.db";
    
    public static Connection DBConnexion(){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:" + url);
            return con;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
        }
        return null;
    }
    
    public static String Login(String Nom  , String Paswd, Login L_intr) {
        ConnctDB = DBConnexion.DBConnexion();
        String Resultat  = "False";
        String query = "select * from Admin where nom=? and password=? ";
        try {
            PstLog = ConnctDB.prepareStatement(query);
            PstLog.setString(1, Nom);
            PstLog.setString(2, Paswd);
            ResSetLog = PstLog.executeQuery();
            if (ResSetLog.next()) {
                String DbNom = ResSetLog.getString("nom");
                String DbPsw = ResSetLog.getString("password");
                if ((DbNom.equals(Nom))&&(DbPsw.equals(Paswd))) {
                    MainIntr Main = new MainIntr();
                    Main.setVisible(true);
                    L_intr.dispose();
                    Resultat = "true";
                    
                }
            } else{
                
            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Resultat;
    }
    
    public static void InsertChef(String nom, String dept, String dept) {
       String sql = "INSERT INTO depChef (nomEtPrenom, Departement) values ('" + nom + "',"+ dept + "')";
       
    }admin
    
    public void closeConnection(){
        try{
            this.con.close();
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
        }
    }
    
    // select all from table, use where argement where="id = 1"

    public String SelectAdmin(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT  FROM admin "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getString("nom")+","+rs.getString("password")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
    public String SelectEtudients(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT  FROM Etudients "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getString("nomEtPrenom")+","+rs.getString("email")+","+rs.getString("niveau")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
    public String SelectdepChef(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM depChef "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getString("nomEtPrenom")+","+rs.getString("Departement")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
    public String SelectGroup(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM group "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getString("nomGr")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
    public String SelectModule(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM module "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getString("nom")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
    public String SelectNote(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM note "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getInt("valuer")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
    public String SelectUnity(String where){
        String res = "";
        try{
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM unity "+where);
            while(rs.next()){
                res += rs.getInt("id")+","+rs.getString("nom")+"-";
            }
            return res;
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
            return res;
        }
    }
     
    public static void main(String[] args) {
        DBConnexion.DBConnexion();
    }
}


