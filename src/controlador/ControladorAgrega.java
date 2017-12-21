/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.ModeloAgrega;
import java.sql.SQLException;
/**
 *
 * @author Daniela
 */
public class ControladorAgrega {

    private ModeloAgrega modeloAgrega;
    
    public void agregaProducto(Integer idproducto, String nombreproducto, Integer precio) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaProducto(idproducto, nombreproducto, precio);
    }
    
    public void agregaVenta(Integer idventa,String fechacontratacion,String fechaterminopcional,String fechaterminocontrato,Integer tipoventa, Integer valorventa,Integer rut ) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaVenta(idventa,fechacontratacion,fechaterminopcional,fechaterminocontrato,tipoventa, valorventa,rut );
    }

    public void agregaVenta(Integer idventa, String fechacontratacion, String fechaterminopcional, String fechaterminocontrato, Integer tipoventa, Integer valorventa, String rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}  
    
    