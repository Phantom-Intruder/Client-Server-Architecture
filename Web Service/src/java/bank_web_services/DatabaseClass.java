/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_web_services;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author userh
 */
public class DatabaseClass {
    private static DatabaseClass instanceOfObject;
    private static Connection databaseConnection = null;
    
    private DatabaseClass(){
        connectToDatabase();
    }
    
    static synchronized Connection getInstanceOfObject()
    {
        if (databaseConnection == null)
            instanceOfObject = new DatabaseClass();

        return databaseConnection;
    }
    
    Connection getDatabaseConnection(){
        return databaseConnection; 
    }
    
    void connectToDatabase(){
        try {
            String url="jdbc:mysql://localhost:3306/contactdb";
            Properties prop=new Properties();
            prop.setProperty("user","root");
            prop.setProperty("password","");
            Driver d=new com.mysql.jdbc.Driver();
            Connection con = d.connect(url,prop);
            databaseConnection = con;
            if(con==null)   {
                System.out.println("connection failed");
                return;
            }
            DatabaseMetaData dm =con.getMetaData();
            String dbversion=dm.getDatabaseProductVersion();
            String dbname=dm.getDatabaseProductName();
            System.out.println("name:"+dbname);
            System.out.println("version:"+dbversion);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
