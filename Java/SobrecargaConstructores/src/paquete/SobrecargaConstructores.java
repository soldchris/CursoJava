package paquete;

public class SobrecargaConstructores {
    public static void main(String[] args) {

        Persona persona = new Persona("Rosalba", 37);
        System.out.println(persona);
      

        Empleado empleado = new Empleado("Christia", 35, 3000);
        System.out.println(empleado);
    }
}
