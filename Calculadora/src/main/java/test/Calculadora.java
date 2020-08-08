package test;

import java.util.Scanner;
import calculadora.Operaciones;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Proporcine el segundo número: ");
        int b = scanner.nextInt();
        int resultado =  Operaciones.sumar(a,b);
        System.out.println("El resultado de la suma es: " + resultado);

    }
}
