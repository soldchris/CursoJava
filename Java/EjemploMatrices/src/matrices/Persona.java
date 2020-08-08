package matrices;

public class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre =nombre;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString(){
        return ("Nombre: " + this.nombre);
    }
}
