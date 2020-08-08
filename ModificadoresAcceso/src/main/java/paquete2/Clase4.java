package paquete2;

import paquete1.Clase1;

public class Clase4 {

    public Clase4(){
        new Clase1(); // Llamado al constructor publico
        //new Clase1("Uno","Dos"); //Llamada al contructor protegido o protected
        //new Clase1("uno", "Dos", "Tres"); //Llamada al constructor default o Package
    }


    public void pruebaDesdeClase4() {
        Clase1 c1 = new Clase1();
        System.out.println("Atributo publico: " + c1.atributoPublico);
        //System.out.println("Atributo protegido: " + c1.atributoProtegido);
        //System.out.println("Atributo Default: " + c1.atributoDefault);

        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        //System.out.println("Metodo protegido: " + c1.metodoProtegido());
        //System.out.println("Metodo default: " + c1.metodoDefault());
    }

    public static void main(String[] args) {
        Clase4 c4 = new Clase4();
        c4.pruebaDesdeClase4();

    }
}
