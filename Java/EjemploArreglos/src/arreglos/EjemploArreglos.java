package arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        //1.Declaramos una variale de tipo arrelgo de enteros
        int edades[];
        //2. Vamos a instancia el arreglo de tipo int
        edades =  new int[3];
        //3.Inicializamos los valores de los elementos del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        //4.Imprimimos los valores del arreglo.
        System.out.println("Arreglo entero indice 0: " + edades[0]);
        System.out.println("Arreglo entero indice 1: " + edades[1]);
        System.out.println("Arreglo entero indice 2: " + edades[2]);

        //5.Declaramos un arreglo de tipo Object
        Persona personas[];
        personas = new Persona[4];
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        System.out.println("Arreglo Personas en el indice 0: " + personas[0]);
        System.out.println("Arreglo Personas en el indice 1: " + personas[2]);

        //6.asingamos valores a un arreglo tipo String de manera simplificada
        String nombres[] = {"Carla", "Juan", "Andres", "Miguel"};
        for (int i=0; i < nombres.length; i++){
            System.out.println("Arreglo Nombres indice "+ i + ": " + nombres[i]);
        }
    }
}
