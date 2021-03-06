/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controlador.ListarControlador;
import modelo.BuscarRegistro;
import modelo.Venta;

/**
 *
 * @author Gabriel
 */
public class ListarVista extends javax.swing.JFrame {
    private DefaultTableModel defaultTableModel;
    private ListarControlador regCon;
    
    
    


    public ListarVista() {
        initComponents();
        setLocationRelativeTo(this);
        
        
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID_VENTA");
        defaultTableModel.addColumn("F_CONTRATACION");
        defaultTableModel.addColumn("F_TERMINO_OP");
        defaultTableModel.addColumn("F_TERM_CONTR");
        defaultTableModel.addColumn("TIPO_VENTA");
        defaultTableModel.addColumn("VALOR_VENTA");
        defaultTableModel.addColumn("RUT");
        jTable1.setModel(defaultTableModel);
        regCon= new ListarControlador();
        lista();
        
           
    }
    
     
    
    void lista(){
        Object[] fila = new Object [7];
        while(defaultTableModel.getRowCount()>0)defaultTableModel.removeRow(0);
        
        ArrayList <Venta> semis =regCon.listar();
        
        Iterator <Venta> xx = semis.iterator();
        while(xx.hasNext()){
            Venta se=xx.next();
            
                fila[0]= se.getIdventa();
                fila[1]= se.getFechacontratacion();
                fila[2]= se.getFechaterminopcional();
                fila[3]= se.getFechaterminocontrato();
                fila[4]= se.getNombretipo();
                fila[5]= se.getValorventa();
                fila[6]= se.getRut();           

                /*
                fila[7]= se.getNombreproducto();
                fila[8]= se.getPrecioUnitario();
                fila[9]= se.getCantidad();
                fila[10]= se.getPrecioXcantidad();*/
           

            defaultTableModel.addRow(fila);            
            
        }          
        jTable1.updateUI(); 
        
        
         
    }
    
    /*    void buscar(){
    
    try {
    Integer codigoBuscar = Integer.parseInt(jCodigoBuscar.getText());
    
    Object[] fila = new Object[5];
    while (defaultTableModel.getRowCount() > 0) {
    defaultTableModel.removeRow(0);
    }
    
    ArrayList<Pelicula> semis = regCon.listar(codigoBuscar);
    
    Iterator <Pelicula> xx = semis.iterator();
    while(xx.hasNext()){
    Pelicula se=xx.next();
    
    
    fila[0]= se.getCodigo();
    fila[1]= se.getPrecio();
    fila[2]= se.getCategoria();
    fila[3]= se.getCuatroK();
    fila[4]= se.getNombre();
    
    defaultTableModel.addRow(fila);
    
    }
    jTable1.updateUI();
    } catch (NumberFormatException numberFormatException) {
    JOptionPane.showMessageDialog(null, "Ingrese codigo numerico a buscar", "Error", 0);
    jCodigoBuscar.setText(null);
    
    }
    
    }*/   
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAzucar = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar / Modificar Pelicula - VideoBuster");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Mostrar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar detalle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lista();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DetalleVentaVista detalle = new DetalleVentaVista();
        detalle.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoAzucar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
