/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import db.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniela
 */
public class ModeloAgrega {
    //private ArrayList<>
    private Producto producto;
    
    public void agregaProducto(Integer idproducto, String nombreproducto, Integer precio) throws SQLException{
        System.out.println("Insertar producto...");
        Statement dec;
        dec=db.Conexion.createStatement();
        String query1="insert into PRODUCTO (IDPRODUCTO, NOMBREPRODUCTO, PRECIO) VALUES ("+idproducto+", '"+nombreproducto+"', '"+precio+"')";
        dec.executeUpdate(query1);
        
    }
    
    public void agregaVenta(Integer idventa,String fechacontratacion,String fechaterminopcional,String fechaterminocontrato,Integer tipoventa, Integer valorventa,Integer rut  ) throws SQLException{
        System.out.println("Agregar Venta...");
        Statement dec;
        dec=db.Conexion.createStatement();
        String query1="insert into VENTA (IDVENTA, FECHACONTRATACION, FECHATERMINOOPCIONAL, FECHATERMINOCONTRATO, TIPOVENTA,VALORVENTA, RUT ) VALUES ("+idventa+", '"+fechacontratacion+"', '"+fechaterminopcional+"', '"+fechaterminocontrato+"', '"+tipoventa+"', '"+rut+"')";
        dec.executeUpdate(query1);
     
        
    }
}
