package test;


import enumeraciones.Continentes;
import enumeraciones.Dias;

import java.util.Date;

public class EjemploEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);

        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Paises del continente no. 4: " + Continentes.AMERICA.getPaises());
        indicarDia(Dias.DOMINGO);
    }

    private static void indicarDia(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}

