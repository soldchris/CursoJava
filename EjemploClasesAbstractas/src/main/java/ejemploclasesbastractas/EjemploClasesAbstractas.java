package ejemploclasesbastractas;

import bastracto.domain.*;

public class EjemploClasesAbstractas {
    public static void main(String[] args) {
        //Creacion de Objetos
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Ciculo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();

    }
}
