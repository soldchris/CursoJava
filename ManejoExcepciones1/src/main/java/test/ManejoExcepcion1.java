package test;

import domain.Division;
import domain.OperacionExcepcion;

public class ManejoExcepcion1 {
    public static void main(String[] args) {
        try {
            Division division = new Division(10, 0);
        } catch (OperacionExcepcion ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        System.out.println("El programa continua");
    }
}
