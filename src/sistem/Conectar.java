package sistem;


import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conectar {
    /*
    Connection conectar;
    Statement sentencia;
    ResultSet rs = null;
    
  public void  Conectar(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connURL = ("jdbc:sqlserver://localhost:1433;databaseName=agencia_vuelos;IntegratedSecurity=true;"
                    + "user=admin5;"
                    + "password=12345678");
            Connection con = DriverManager.getConnection(connURL);
            JOptionPane.showMessageDialog(null, "Conectado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
*/
        public static Connection getConexion(){
        String url="jdbc:sqlserver://26.60.5.36:1433;"
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
