package domain;

public class Division {
    private int numerador;
    private  int denominador;

    public Division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0){
            throw new OperacionExcepcion("El denominador es igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void visualizarOperacion(){
        System.out.println("Laoperacion es igual a: " + this.numerador / this.denominador);
    }
}
