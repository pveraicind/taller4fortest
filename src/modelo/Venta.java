/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class Venta {
    
    private int idventa;
    private String fechacontratacion;
    private String fechaterminopcional;
    private String fechaterminocontrato;
    private int tipoventa;
    private int valorventa;
    private String rut;
    private String nombretipo;
    private String nombreproducto;
    private int cantidad;
    private int precioUnitario;
    private int precioXcantidad;

    public Venta(int idventa, String fechacontratacion, String fechaterminopcional, String fechaterminocontrato, int tipoventa, int valorventa, String rut, String nombretipo, String nombreproducto, int cantidad, int precioUnitario, int precioXcantidad) {
        this.idventa = idventa;
        this.fechacontratacion = fechacontratacion;
        this.fechaterminopcional = fechaterminopcional;
        this.fechaterminocontrato = fechaterminocontrato;
        this.tipoventa = tipoventa;
        this.valorventa = valorventa;
        this.rut = rut;
        this.nombretipo = nombretipo;
        this.nombreproducto = nombreproducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioXcantidad = precioXcantidad;
    }

    
    
    
    
    
    
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setPrecioXcantidad(int precioXcantidad) {
        this.precioXcantidad = precioXcantidad;
    }

    
    
    
    
    
    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public int getPrecioXcantidad() {
        return precioXcantidad;
    }
    
    
    
    



    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getFechacontratacion() {
        return fechacontratacion;
    }

    public void setFechacontratacion(String fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }

    public String getFechaterminopcional() {
        return fechaterminopcional;
    }

    public void setFechaterminopcional(String fechaterminopcional) {
        this.fechaterminopcional = fechaterminopcional;
    }

    public String getFechaterminocontrato() {
        return fechaterminocontrato;
    }

    public void setFechaterminocontrato(String fechaterminocontrato) {
        this.fechaterminocontrato = fechaterminocontrato;
    }

    public int getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(int tipoventa) {
        this.tipoventa = tipoventa;
    }

    public int getValorventa() {
        return valorventa;
    }

    public void setValorventa(int valorventa) {
        this.valorventa = valorventa;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombretipo
     */
    public String getNombretipo() {
        return nombretipo;
    }

    /**
     * @param nombretipo the nombretipo to set
     */
    public void setNombretipo(String nombretipo) {
        this.nombretipo = nombretipo;
    }

    /**
     * @return the nombreproducto
     */
    public String getNombreproducto() {
        return nombreproducto;
    }

    /**
     * @param nombreproducto the nombreproducto to set
     */
    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }
  
    
    
    
}
