package test;

import ejemplosobreescritura.Empleado;
import ejemplosobreescritura.Gerente;

public class EjemploSobreEscritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",1000);
        Gerente gerente = new Gerente("Karla", 1500,"Contabilidad");
        System.out.println("empleado.ObetenerDetalle() = " + empleado.ObetenerDetalle());
        System.out.println("gerente.ObetenerDetalle() = " + gerente.ObetenerDetalle());
    }
}
