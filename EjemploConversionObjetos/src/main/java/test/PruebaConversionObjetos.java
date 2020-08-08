package test;

import ejemploconversionesobjetos.*;

import java.util.EnumMap;

public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        System.out.println(empleado.obtenerDetalles());
        // 1 forma de conversion de objeto de empleado a escritor mediante una variable
        Escritor escritor = (Escritor) empleado; // convertimos la variables empleado a escritor
        System.out.println("Tipo de escritura en texto:" + escritor.getTipoDeEscrituraEnTexto());
        //2 forma de conversion de objeto de empleado de manera directa
        System.out.println("Tipo de escritura en texto: " +((Escritor) empleado).getTipoDeEscrituraEnTexto());


        empleado = new Gerente("Laura",6000,"Sistemas");
        System.out.println(((Gerente) empleado).getDepartamento());
    }
}