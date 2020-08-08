package matrices;

public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        //Declaración de una Matriz
        int edades [] [];
        //Instanciamos una matriz
        edades = new int[3][2];
        //Asignación de valores a una matriz
        edades [0][0] = 30;
        edades [0][1] = 10;
        edades [1][0] = 15;
        edades [1][1] = 25;
        edades [2][0] = 7;
        edades [2][1] = 55;

        //imprimir valores de la matriz
        System.out.println("Matriz de enteros en el indice 0:0 = " + edades[0] [0]);

        //Decalarion de una matriz de objetos
        Persona personas[][] = new Persona[1][2];

        //Como saber la cantidad de filas y columnas de una matriz
        System.out.println("Número de filas de la matriz: " + personas.length);
        System.out.println("Nmero de columnas de la matriz: " + personas[0].length);

        //Asignación de valores a la matriz
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("karla");


        System.out.println("Persona en el indice 0:0 =" + personas[0][0]);
        System.out.println("Persona en el indice 0:1 = " + personas[0][1]);


        //Ciclo for para recorrer la matriz
    for (int fila=0; fila < personas.length; fila++){
        for(int colu=0; colu < personas[fila].length;colu++){
            System.out.println("Valor de la Matriz en la fila "+ fila +"  y columna " + colu + " = "+ personas[fila][colu]);

        }
    }
    }
}
