package com.gm.ventas;

import java.util.Date;

public class Orden {
    private int idOrden;
    Date fechaOrden = new Date();
    private static int contadorOrden;
    Producto productos[];
    private int contadorProductos;
    private static final int MAX_PRODUCTOS= 10;

    public Orden(){
        this.idOrden = ++contadorOrden;
        this.productos = new Producto[this.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
       if (this.contadorProductos<this.MAX_PRODUCTOS){
           this.productos[this.contadorProductos++] = producto;
       }
        else{
           System.out.println("Se alcanzo el maximo de productos " + this.MAX_PRODUCTOS);
       }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i=0; i<this.contadorProductos; i++){
            Producto producto;
            producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Fecha de la Orden: " + this.fechaOrden);
        System.out.println("Numero de la Orden: " + this.idOrden);
        System.out.println("Total de la orden: $"+ this.calcularTotal());
        System.out.println("****** Lista de productos: ******");
        for(int i=0; i<this.contadorProductos; i++){
            System.out.println(productos[i]);
        }
        System.out.println("*********************************");
    }
}
