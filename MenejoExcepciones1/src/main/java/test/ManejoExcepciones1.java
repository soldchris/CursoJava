package test;

import domain.Division;
import domain.OperacionExcepcion;

public class ManejoExcepciones1 {
    public static void main(String[] args)  {
        try {
            Division division = new Division(10,2);
        } catch (OperacionExcepcion operacionExcepcion) {
            operacionExcepcion.printStackTrace();
            System.out.println(operacionExcepcion.getMessage());
        }
        System.out.println("El Programa continua");

    }
}
