package paquete;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    public Persona (String nombre){
        this.idPersona = ++contadorPersona;
        this.nombre = nombre;
    }

    public int getIdPerona(){
        return this.idPersona;
    }

    //    public void setIdPerona(int idPersona){
    //       this.idPersona = idPersona;
    //    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public static int getContadorPersona (){
        return contadorPersona;
    }
    @Override
    public String toString(){
        return "Id Persona:" + idPersona + ", Nombre:" + nombre + ", Contador Peronsas: " + contadorPersona;
    }
}

