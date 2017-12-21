/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class BuscarRegistro {
    
    public Boolean buscarventa(Venta venta){
     Boolean estado = false;
        try {
           
            ResultSet resultado = null;
            int eje = 0;
            
            String query3 = "select * from venta where id_venta ="+venta.getIdventa();
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query3);
            
            while (resultado.next() && eje ==0){
                int id2 = resultado.getInt("id_venta");
                if (id2 == venta.getIdventa()){
                    estado = true;
                    eje = 1;
                }
            
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(BuscarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }

        return estado;
    
    
    }
    
     public Boolean buscarproducto(Producto producto){
     Boolean estado = false;
        try {
           
            ResultSet resultado = null;
            int eje = 0;
            
            String query3 = "select idproducto from producto ";
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query3);
            
            while (resultado.next() && eje ==0){
                int id2 = resultado.getInt("idproducto");
                if (id2 == producto.getIdproducto()){
                    estado = true;
                    eje = 1;
                }
            
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(BuscarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }

        return estado;
    
    
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
