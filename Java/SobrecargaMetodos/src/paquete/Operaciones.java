package paquete;

public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("Método Sumar (int, int)");
        return a + b;
    }

    public static double sumar(double a, double b){
        System.out.println("Método Sumar (double, double)");
        return a + b;
    }

    public static double sumar(int a, double b){
        System.out.println("Método sumar (int, double)");
        return a + b;
    }

    public static double sumar(double a, int b){
        System.out.println("Método sumar (double, int)");
        return a + b;
    }
}
