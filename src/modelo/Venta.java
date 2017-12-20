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
  
    
    
    
}
