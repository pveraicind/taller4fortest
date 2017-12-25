/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ModeloAgrega {
    //private ArrayList<>

    
    public void agregaProducto(Integer idproducto, String nombreproducto, Integer precio) {
    
                    
        try {
            Connection test=Conexion.conectar();
            Statement s=test.createStatement();
            String query23="insert into PRODUCTO(ID_PRODUCTO, NOMBRE_PRODUTO, PRECIO) VALUES ("+idproducto+", '"+nombreproducto+"', '"+precio+"')";
            s.executeUpdate(query23);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAgrega.class.getName()).log(Level.SEVERE, null, ex);
        }

  



    }
    
    public void agregaVenta(Integer idventa,String fechacontratacion,String fechaterminopcional,String fechaterminocontrato,Integer tipoventa, Integer valorventa,Integer rut  ) throws SQLException{
        System.out.println("Agregar Venta...");
        Statement dec;
       
        String query1="insert into VENTA (IDVENTA, FECHACONTRATACION, FECHATERMINOOPCIONAL, FECHATERMINOCONTRATO, TIPOVENTA,VALORVENTA, RUT ) VALUES ("+idventa+", '"+fechacontratacion+"', '"+fechaterminopcional+"', '"+fechaterminocontrato+"', '"+tipoventa+"', '"+rut+"')";
       
     
        
    }
}
