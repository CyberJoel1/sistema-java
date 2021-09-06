/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;
import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Joel Velasco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
//                String bases = "";
//        try{
//            Statement sql = Conectar.getConexion().createStatement();
//            String consulta = "SELECT * FROM USUARIOWEB";
//            ResultSet resultado = sql.executeQuery(consulta);
//            while(resultado.next()){
//                bases += resultado.getString(1)+"\n";
//            }
//            System.out.println(bases);
//        }catch(SQLException e){
//            System.out.println(e.toString());
//        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String conURL = "jdbc:sqlserver://localhost:1433;databaseName=agencia_vuelos;user=admin5;password=12345678;";
        
        
    }
    
}
