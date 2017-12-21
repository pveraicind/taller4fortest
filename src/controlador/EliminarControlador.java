/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.EliminarRegistro;
import modelo.Producto;
import modelo.Venta;

/**
 *
 * @author USUARIO
 */
public class EliminarControlador {
    
    
    public Boolean eliminarprod (Producto producto){
    
        EliminarRegistro elimina = new EliminarRegistro();
       Boolean bolita = elimina.eliminarproducto(producto);
        return bolita;
    
    }
    
        public Boolean eliminarvemta (Venta venta){
    
        EliminarRegistro elimina = new EliminarRegistro();
       Boolean bolita = elimina.eliminarventa(venta);
        return bolita;
    
    }
    
           public Boolean eliminardet1(Producto venta){
    
        EliminarRegistro elimina = new EliminarRegistro();
       Boolean bolita = elimina.eliminarventadetalle1(venta);
        return bolita;
    
    }
    
           
                 public Boolean eliminardet2(Venta venta){
    
        EliminarRegistro elimina = new EliminarRegistro();
       Boolean bolita = elimina.eliminardetalle2(venta);
        return bolita;
    
    }
            
                 public Boolean eliminardet3(Venta venta, Producto producto){
    
        EliminarRegistro elimina = new EliminarRegistro();
       Boolean bolita = elimina.eliminardetalle3(venta,producto);
        return bolita;
    
    }           
}
