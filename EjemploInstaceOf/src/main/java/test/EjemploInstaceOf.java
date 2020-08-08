package test;

import ejemploinstaceof.Empleado;
import ejemploinstaceof.Gerente;

public class EjemploInstaceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",1000);
        determinaTipo(empleado);
        Gerente gerente = new Gerente("Karla", 1500,"Contabilidad");
        determinaTipo(gerente);

    }

    public static void determinaTipo(Empleado empleado){
         if (empleado instanceof Gerente){
            // realizamos un casteo o conversion  de Empleado a Gerente para acceder al metedo
            // getdepartamento de la clase Gerente
            Gerente gerente = (Gerente) empleado;
            System.out.println("Departamento del Gerente: " + gerente.getDepartamento());
            // coneversion directa al momento de imprimir //
            //System.out.println(((Gerente) empleado).getDepartamento());
        }
        else if (empleado instanceof Empleado){
            System.out.println("Nombre de Empleado: " +empleado.getNombre());
        }
    }
}
