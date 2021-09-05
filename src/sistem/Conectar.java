/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;


import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Joel Velasco
 */
public class Conectar {
   /* Connection conectar;
    Statement sentencia;
    ResultSet rs = null;
  public void  Conectar(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conectar=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-C3IRJD9:1433;databaseName=agencia_vuelos;IntegratedSecurity=true");
            JOptionPane.showMessageDialog(null, "Conextado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }*/
        public static Connection getConexion(){
        String url="jdbc:sqlserver://localhost:1433;"
                + "database=agencia_vuelos;"
                + "user=sa;"
                + "password=18062014;"
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
