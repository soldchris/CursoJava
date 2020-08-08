package ejemploinstaceof;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String ObetenerDetalle(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return this.sueldo;
    }
}
