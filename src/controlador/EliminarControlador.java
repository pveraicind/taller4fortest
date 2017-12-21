/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.EliminarRegistro;
import modelo.Producto;

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
    
    
    
    
}
