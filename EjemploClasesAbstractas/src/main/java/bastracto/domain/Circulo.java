package bastracto.domain;

public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura){
        super(tipoFigura);

    }

    public void dibujar(){
        //Agregamos el comportamiento del método abstracto
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}
