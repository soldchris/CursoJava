package test;
import static utileria.Archivo.*;
public class ManejoArchivo {
    public static void main(String[] args) {
        String nombrearchivo = "C:\\Users\\1598597\\Documents\\pruebajava\\archivoPruebaJava.txt";

        //creamos archivo vacio
        //crearArchivo(nombrearchivo);

        //Creamo el archivo y escribimos dentro del archivo
        //escribirArchivo(nombrearchivo);

        //leemos la informacion del archivo y la imprimimos en la consola
        //leerArchivo(nombrearchivo);

        //anexar información a un archivo ya con datos
        anexarArchivo(nombrearchivo);
        leerArchivo(nombrearchivo);
    }
}
