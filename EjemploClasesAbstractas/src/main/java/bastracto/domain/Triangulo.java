package bastracto.domain;

public class Triangulo extends FiguraGeometrica{

    public Triangulo(String tipoFigura){
        super(tipoFigura);

    }

    public void dibujar(){
        //Agregamos el comportamiento del método abstracto
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}

