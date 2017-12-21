/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ModeloModificar;
import java.sql.SQLException;
/**
 *
 * @author USUARIO
 */
public class ControladorModificar {
     private ModeloModificar modeloModificar;
    
    public void modificaPelicula(Integer idproducto, String nombreproducto, Integer precio) throws SQLException{
        modeloModificar=new ModeloModificar();
        modeloModificar.modificaProducto(idproducto, nombreproducto, precio);
    }
    
    public void modificaVenta (Integer idventa,String fechacontratacion,String fechaterminopcional,String fechaterminocontrato,Integer tipoventa, Integer valorventa,Integer rut) throws SQLException{
        modeloModificar=new ModeloModificar();
        modeloModificar.modificaVenta(idventa,fechacontratacion,fechaterminopcional,fechaterminocontrato,tipoventa, valorventa,rut );
    }
}
