package paquete;

public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println("Resultado Operación #1--> " + Operaciones.sumar(4,7));
        System.out.println("Resultado Operación #2--> " + Operaciones.sumar(2d,5d));
        System.out.println("Resultado Operación #3-->" + Operaciones.sumar(3f,'A'));
        System.out.println("Resultado Operación #4-->" + Operaciones.sumar(15,35l));
    }
}
