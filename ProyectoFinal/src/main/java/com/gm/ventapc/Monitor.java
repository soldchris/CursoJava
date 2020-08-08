package com.gm.ventapc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
