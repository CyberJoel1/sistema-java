/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Joel Velasco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String bases = "";
        try{
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT * FROM USUARIOWEB";
            ResultSet resultado = sql.executeQuery(consulta);
            while(resultado.next()){
                bases += resultado.getString(1)+"\n";
            }
            System.out.println(bases);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
}
