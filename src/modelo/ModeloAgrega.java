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
 * @author Gabriel
 */
public class ModeloAgrega {
    //private ArrayList<Curso> cursos;
    private Producto producto;
    
    public void agregaProducto(int codigo, int precio, int id_cat, String formato4k, String nombre) throws SQLException{
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into A_PELICULA (CODIGO, PRECIO, ID_CAT, FORMATO4K, NOMBRE) VALUES ("+codigo+", '"+precio+"', '"+id_cat+"', '"+formato4k+"', '"+nombre+"')";
        dec.executeUpdate(query1);
        
    }
    
    public void agregaCategoria(int id_cat, String descripcion) throws SQLException{
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into A_CATEGORIA (ID_CAT, DESCRIPCION) VALUES ("+id_cat+", '"+descripcion+"')";
        dec.executeUpdate(query1);
        
    }
    
}
