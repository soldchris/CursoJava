package paquete1;

public class Clase2 {

    public Clase2(){
        //Prueba de constructores de la Clase1

        new Clase1(); // Llamado al constructor publico
        new Clase1("Uno","Dos"); //Llamada al contructor protegido o protected
        new Clase1("uno", "Dos", "Tres"); //Llamada al constructor default o package
    }

    public void pruebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println("Atributo publico: " + c1.atributoPublico);
        System.out.println("Atributo protegido: " + c1.atributoProtegido);
        System.out.println("Atributo Default: " + c1.atributoDefault);

        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + c1.metodoProtegido());
        System.out.println("Metodo default: " + c1.metodoDefault());

    }

    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();

    }
}
