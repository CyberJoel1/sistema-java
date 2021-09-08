
package cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sistem.Conectar;


public class Transferencias extends javax.swing.JInternalFrame {

    public Transferencias(int id) {
        initComponents();
    }

    public void cargarTransferencias(int id_user){
        try{
            int id_cliente=0;
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet rsCliente = sql.executeQuery("SELECT * FROM [26.37.14.200].[agencia_vuelos].[dbo].CLIENTE WHERE IDUSER="+id_user+"");
            if(rsCliente.next()){
                id_cliente=rsCliente.getInt(1);
            }
            ResultSet resultado = sql.executeQuery("SELECT cr.FECHA,tp.DESCRIPCIONTIPO,cr.TIPOCOMPRA,cr.VALIDEZ,cr.ABONO \n" +
                                                    "FROM [26.37.14.200].[agencia_vuelos].[dbo].COMPRA_RESERVA cr,[26.37.14.200].[agencia_vuelos].[dbo].TIPO_PAGO tp, [26.37.14.200].[agencia_vuelos].[dbo].BOLETO b\n" +
                                                    "WHERE IDCLIENTE="+id_cliente+" AND cr.IDBOLETO=b.IDBOLETO AND cr.IDPAGO=tp.IDTIPOPAGO ");
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
            tbl_transacciones.setModel(new javax.swing.table.DefaultTableModel(
                nombre_array,
                new String[]{"FECHA","TIPO PAGO","TIPO COMPRA", "VALIDEZ","ABONO"}
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
        tbl_transacciones = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE TRANSACCIONES");

        tbl_transacciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_transacciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_transacciones;
    // End of variables declaration//GEN-END:variables
}
