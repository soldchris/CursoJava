package com.gm.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto(){
        this.idProducto = ++contadorProductos;
    }

    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto(){
        return this.idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.getNombre();
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getContadorProductos(){
        return this.contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
