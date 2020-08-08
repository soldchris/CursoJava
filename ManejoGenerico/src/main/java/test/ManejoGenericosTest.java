package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objectoInt = new ClaseGenerica(15);
        objectoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("Prueba");
        objetoString.obtenerTipo();

        //No es posible utilizar variables de tipos primitivos con clases genericas
        //ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(1);
    }
}
