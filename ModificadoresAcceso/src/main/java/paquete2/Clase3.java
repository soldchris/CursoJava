package paquete2;

import paquete1.Clase1;
import paquete1.Clase2;

public class Clase3 extends Clase1 {

    public Clase3(){
        super("Uno","Dos"); // Podemos hacer uso de los elementos marcados como protegidos
        new Clase1(); // Llamado al constructor publico
       //new Clase1("Uno","Dos"); //Llamada al contructor protegido o protected
       //new Clase1("uno", "Dos", "Tres"); //Llamada al constructor default o Package
    }

    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("Atributo publico: " + c1.atributoPublico);
        System.out.println("Atributo protegido: " + atributoProtegido);
        //System.out.println("Atributo Default: " + c1.atributoDefault);

        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + metodoProtegido());
        //System.out.println("Metodo default: " + c1.metodoDefault());

    }

    public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();

    }


}
