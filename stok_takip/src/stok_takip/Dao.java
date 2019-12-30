/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok_takip;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MorCivciv
 */
public interface Dao {
    
    public void baglanti() throws ClassNotFoundException;
      public static Connection getConnection() throws ClassNotFoundException{
        Connection conn = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
       
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
        return conn;
    }
}
