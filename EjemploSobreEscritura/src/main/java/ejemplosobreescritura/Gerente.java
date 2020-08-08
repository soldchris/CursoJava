package ejemplosobreescritura;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    //Sobre escribimos el metodo del padre heredado
    public String ObetenerDetalle(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo
                + ", Departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
