package paquete;

public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersona;
    private int idPersona;

    private Persona(){
        this.idPersona = ++contadorPersona;
    }

    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public static int getContadorPersona(){
        return contadorPersona;
    }

    public int getIdPersona(){
        return  this.idPersona;
    }

    @Override
    public String toString(){
        return "Persona:" + this.nombre + ", Edad: " + edad + ", Id persona: " + idPersona;
    }


}
