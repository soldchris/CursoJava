package test;

import java.io.*;

public class EntradaDatos1 {
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader brInput = new BufferedReader(input);
        System.out.println("Introduzca un dato: ");
        try {
            captura = brInput.readLine();
            System.out.println("Dato Introducido: "+ captura);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }
}
