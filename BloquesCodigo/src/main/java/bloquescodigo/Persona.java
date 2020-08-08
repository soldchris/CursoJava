package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion estatico
    static{
        contadorPersonas= 10;
        //No se pueden inicializar variables que no sean estaticas ejemplo:
        //idPersona = 2;
        System.out.println("Ejecución bloque estático");
    }

    //Bloque No estatico y anonimo
    {
        System.out.println("Ejecución bloque no estático");
        this.idPersona = ++contadorPersonas;
    }

    public Persona(){
        System.out.println("Ejecución del constructor de la clase");
    }

    public int getIdPersona(){
        return this.idPersona;
    }

}
