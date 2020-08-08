package paquete;

public class EjemploEstatico {
    public static void main(String[] args) {
        Persona p1 = new Persona("Christian");
        System.out.println(p1);
        Persona p2 = new Persona("Avril");
        System.out.println(p2);
        Persona p3 = new Persona("Mathias");
        System.out.println(p3);
        System.out.println("Contador Personas: " + Persona.getContadorPersona());
    }
}
