package test;

/**
 * Esta clase es un ejemplo para probar una clase con argumentos variables
 * @author Christian Machado
 * @version 1.0
 */
public class EjemploVarArgs {

    /**
     * Este es el metodo principal
     * @param args es un arreglo de tipo String de la linea de comando
     */
    public static void main(String[] args) {

        //imprimimos varios numeros
        imprimirNumeros(15,1,4,6);
        System.out.println("");
        variosParametros("Juan",true, 14,2,5);

    }
    /**
     * Metodo para imprimir un argumento vaiable
     * @param numeros es un parametro o argumento variabe
     */
    private static void imprimirNumeros(int... numeros){
        //recorremos cada elemento del arreglo
        for (int i=0; i < numeros.length; i++){
            int elemento = numeros[i];
            System.out.println("Elemento = " + elemento);
        }
    }

    /**
     * Metodo con varios parametros de distintos tipo de datos
     * @param nombre parametro de tipo String
     * @param bandera parametros de tipo boolean
     * @param numeros parametros de tipo varArgs
     */

    public static void variosParametros(String nombre, boolean bandera , int... numeros){
        System.out.println("Nombre: " + nombre);
        System.out.println("Bandera: " + bandera);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento = " + numeros[i]);
        }
    }
}
