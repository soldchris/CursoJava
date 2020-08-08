package test;

import ejemplopolimorfismo.Empleado;
import ejemplopolimorfismo.Gerente;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",1000);
        imprimirDetalles(empleado);
        Gerente gerente = new Gerente("Karla", 1500,"Contabilidad");
        imprimirDetalles(gerente);

    }

    public static void imprimirDetalles(Empleado empleado){
        System.out.println("empleado = " + empleado.ObetenerDetalle());
    }
}
