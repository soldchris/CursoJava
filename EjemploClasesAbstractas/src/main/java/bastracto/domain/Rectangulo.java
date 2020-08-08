package bastracto.domain;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);

    }

    public void dibujar(){
        //Agregamos el comportamiento del método abstracto
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}

