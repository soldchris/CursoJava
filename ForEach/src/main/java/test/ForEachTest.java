package test;

import entidad.Persona;

public class ForEachTest {
    public static void main(String[] args) {
        int edades[] = {15,20,41,50};
        for (int edad : edades) {
            System.out.println(edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Karla")};
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
