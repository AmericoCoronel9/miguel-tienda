/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendasmiguelito;


public class caract extends producto{
    
    private String codigo;
    private String cantidad;
    
    private String precio;

    public caract(String codigo, String cantidad, String precio, String nombre, String talla, String color) {
        super(nombre, talla, color);
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public caract(String codigo, String cantidad, String precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public caract() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

   
    
        
   
}
