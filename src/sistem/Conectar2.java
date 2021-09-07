/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joel Velasco
 */
public class Conectar2 {
                public static Connection getConexion(){
        String url="jdbc:sqlserver://26.37.14.200:1433;"
                + "database=agencia_vuelos;"
                + "user=sa;"
                + "password=12345678;"
                + "loginTimeout=30;";
        try{
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }catch(SQLException ex){
            System.out.print(ex.toString());
            return null;
        }
    }
}
