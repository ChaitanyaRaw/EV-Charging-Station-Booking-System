/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evchargingstaionfinder;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBConecter {
        Connection conn=null;
     
    public static Connection java_db(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite://E:\\TY BcsCS\\project/evadmin.db");
        System.out.println("conectign...");
        return conn;
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }    
    }  
}
