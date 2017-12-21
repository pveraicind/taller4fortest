/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.ListarModelo;

/**
 *
 * @author Gabriel
 */
public class ListarControlador {
    public ArrayList listar(){
        ListarModelo listarModelo = new ListarModelo();
        return listarModelo.listar();
    }  
    public ArrayList listarDetalleVenta(){
        ListarModelo listarModelo = new ListarModelo();
        return listarModelo.listarDetalleVenta();        
    }    
}