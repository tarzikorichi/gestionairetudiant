/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionairetudiant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Elias
 */
public class DBConnexion {
    Connection con = null;
    Statement stat = null;
    
    public DBConnexion(){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:dbEtudient.db");
            System.out.println("connection ok ... ");
        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
        }
    }
    
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
}


