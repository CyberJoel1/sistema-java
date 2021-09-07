
package cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sistem.Conectar;

public class Vuelos extends javax.swing.JInternalFrame {

    public Vuelos(int id) {
        initComponents();
        this.cargarVuelos(id);
    }

    public void cargarVuelos(int id_user){
        try{
            int id_cliente=0;
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet rsCliente = sql.executeQuery("SELECT * FROM CLIENTE WHERE IDUSER="+id_user+"");
            if(rsCliente.next()){
                id_cliente=rsCliente.getInt(1);
            }
            ResultSet resultado = sql.executeQuery("SELECT b.CLASE,tp.DESCRIPCIONTIPO,cr.FECHA,cr.TIPOCOMPRA,cr.VALIDEZ,cr.ABONO \n" +
                                        "FROM dbo.COMPRA_RESERVA cr,dbo.TIPO_PAGO tp, dbo.BOLETO b \n" +
                                        "WHERE IDCLIENTE="+id_cliente+" AND cr.IDBOLETO=b.IDBOLETO AND cr.IDPAGO=tp.IDTIPOPAGO ");
            int columna=6;
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
            tbl_vuelos.setModel(new javax.swing.table.DefaultTableModel(
                nombre_array,
                new String[]{"CLASE", "TIPO PAGO","FECHA", "TIPO COMPRA","VALIDEZ","ABONO"}
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
        tbl_vuelos = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE VUELOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        tbl_vuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_vuelos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 500, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 530, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_vuelos;
    // End of variables declaration//GEN-END:variables
}
