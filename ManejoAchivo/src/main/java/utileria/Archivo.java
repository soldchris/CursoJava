package utileria;

import java.io.*;


public class Archivo {

    //Se crea el archivo en blanco (vacio)

    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado con correctamente");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }


    //Se Crea y se escribe dentro del archivo
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            String contenido= "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin Escritura");
            System.out.println("Se ha escrito correctamente al archivo");
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    //Leer información de un archivo
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            String lectura = entrada.readLine();
            while (lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    //Anexar informacion a un archivo que ya contiene datos
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String cotenido = "Anexando informacion al archivo";
            salida.println(cotenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado la infomación al archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
