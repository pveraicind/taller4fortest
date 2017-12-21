/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private Integer precio;

    public Producto() {
    }

    public Producto(Integer id_producto, String nombre_producto, Integer precio) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    
}
