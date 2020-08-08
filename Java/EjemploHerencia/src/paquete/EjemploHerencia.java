package paquete;

import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Christian",  5000);
        emp1.setGenero('M');
        emp1.setEdad(35);
        emp1.setDireccion("Envigado, Medellín, Colombia");
        System.out.println(emp1);

        Cliente cliente = new Cliente(new Date(), true);
        cliente.setNombre("Rosalba");
        cliente.setGenero('F');
        cliente.setEdad(37);
        cliente.setDireccion("Alcala, Envigado #46-49");
        System.out.println(cliente);
    }
}
