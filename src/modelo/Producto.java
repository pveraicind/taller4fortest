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
    private Integer idproducto;
    private String nombreproducto;
    private Integer precio;

    public Producto() {
    }

    public Producto(Integer idproducto, String nombreproducto, Integer precio) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
    }

    public Integer getIdproducto() {
        return idproducto;
    }


    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}
 

 
