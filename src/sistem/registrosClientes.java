
package sistem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iAmPocho
 */
public class registrosClientes extends javax.swing.JInternalFrame {

    public registrosClientes() {
        initComponents();
    }

    public void cargarClientes(){
        try{
            Statement sql = Conectar.getConexion().createStatement();
            
            ResultSet resultado = sql.executeQuery("SELECT [NOMBRE],[APELLIDO],[CEDULA],[FECHANACIMIENTO],[TELEFONO]\n" +
                                                    "  FROM [agencia_vuelos].[dbo].[CLIENTE]\n" +
                                                    "  UNION \n" +
                                                    "SELECT [NOMBRE],[APELLIDO],[CEDULA],[FECHANACIMIENTO],[TELEFONO]\n" +
                                                    "  FROM [agencia_vuelos].[dbo].[CLIENTE]");
            int columna=5;
            List<String> nom= new ArrayList<>();
            while(resultado.next()){
                for(int i=0;i<columna;i++){
                    nom.add(resultado.getString(i+1));
                }
            }
            int contador=0;
            String nombre_array[][] = new String[nom.size()/columna][columna];
            for(int j=0;j<(nom.size()/columna);j++){
                for(int k=0;k<(columna);k++){
                nombre_array[j][k] =nom.get(contador);
                    contador++;
                }
            }
            resultado.close();
            sql.close();
            tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
                nombre_array,
                new String[]{"NOMBRE", "APELLIDO","CEDULA", "FECHA NACIMIENTO","TELEFONO"}
            ));
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE CLIENTES SUCURSAL 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_clientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 630, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 660, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_clientes;
    // End of variables declaration//GEN-END:variables
}
