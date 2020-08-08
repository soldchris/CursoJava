package test;

import dominio.Empleado;

public class ClaseObject {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 2000);
        Empleado emp2 = new Empleado("Juan", 2000);

        System.out.println("Objetos igual: " + (emp1 == emp2));

        compararObjetos(emp1,emp2);

    }

    public static void compararObjetos(Empleado emp1, Empleado emp2){
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);

        //Revisamos la referencia en memoria
        if (emp1 == emp2){
            System.out.println("Los objetos tienen la misma dirección en memoria");
            System.out.println("Emp1"  + emp1.hashCode());
        }
        else{
            System.out.println("Los objetos tienen distinta dirección en memoria");
        }

        //Revisió del metodo equals
        if (emp1.equals(emp2)){
            System.out.println("Los objetos tiene el mismo contenido");
        }
        else{
            System.out.println("Los objetos No tienen los mismos contenido");
        }

        // Reivision del metodo HashCode

        if (emp1.hashCode() == emp2.hashCode()){
            System.out.println("Los Objetos tiene el mismo código hash");
            System.out.println("emp1 =" + emp1.hashCode());
            System.out.println("emp2 =" + emp2.hashCode());
        }else{
            System.out.println("Los Objetos No tienen el mismo codigo hash");
        }
    }
}
