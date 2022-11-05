//First run this code to create a database in your device!!!!
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcreate {
    public static Statement stmt;
    public static Connection conn;
    public static void connect()
    {       
       try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
           stmt = conn.createStatement();
           stmt.execute("CREATE DATABASE ebookshop");
           System.out.println("Done");
       }
       catch(SQLException e){
           System.out.println(e);
       } 
    }
    
    public static void main(String[] args) {
       DBcreate.connect();
    }
    
}
