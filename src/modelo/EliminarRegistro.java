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
public class EliminarRegistro {

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public Boolean eliminarventa(Venta venta){
      ResultSet resultado = null;
       Boolean bolita = false;
        try {
            String query1 = "delete from venta where id_venta="+venta.getIdventa();
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
            
        } catch (SQLException ex) {
            bolita = false;                        
            Logger.getLogger(EliminarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    } 
     
        public Boolean eliminarproducto(Producto producto){
      ResultSet resultado = null;
       Boolean bolita = false;
        try {
            String query1 = "delete from producto where id_producto="+producto.getIdproducto();
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
            
        } catch (SQLException ex) {
            bolita = false;                        
            Logger.getLogger(EliminarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    }  
            public Boolean eliminarventadetalle1(Producto producto){
      ResultSet resultado = null;
       Boolean bolita = false;
        try {
           Integer hola = producto.getIdproducto();
            String query1 = "delete from relation_2v1 where producto_id_producto="+hola;
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
            
        } catch (SQLException ex) {
            bolita = false;                        
            Logger.getLogger(EliminarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    }  
    
            
            public Boolean eliminardetalle2(Venta venta){
      ResultSet resultado = null;
       Boolean bolita = false;
        try {
            String query1 = "delete from relation_2v1 where venta_id_venta="+venta.getIdventa();
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
            
        } catch (SQLException ex) {
            bolita = false;                        
            Logger.getLogger(EliminarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    }         
              public Boolean eliminardetalle3(Venta venta, Producto producto){
      ResultSet resultado = null;
       Boolean bolita = false;
        try {
            String query1 = "delete from relation_2v1 where venta_id_venta="+venta.getIdventa()+" and producto_id_producto="+producto.getIdproducto();
            Connection test=Conexion.conectar();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
            
        } catch (SQLException ex) {
            bolita = false;                        
            Logger.getLogger(EliminarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    }            
            
}
