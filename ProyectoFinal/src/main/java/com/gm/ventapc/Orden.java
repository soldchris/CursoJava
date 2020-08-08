package com.gm.ventapc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se supero el maximo de producto: " + MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("Número de la orde: #" + this.idOrden);
        System.out.println("Lista de productos: ");
        for (int i=0; i < contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
}
