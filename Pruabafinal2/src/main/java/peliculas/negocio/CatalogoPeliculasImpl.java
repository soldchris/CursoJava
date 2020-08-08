package negocio;

import datos.*;
import domain.*;
import excepciones.*;

import java.io.File;
import java.util.List;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    private final  AccesoDatos datos;

    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchvo)  {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try {
            if (datos.existe(nombreArchvo) && datos.buscar(nombreArchvo,pelicula.getNombre())== null){
                anexar = true;
                datos.escribir(pelicula,nombreArchvo,anexar);
            }
        } catch (AccesoDatosEx accesoDatosEx) {
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo)  {
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula: peliculas){
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (LecturaDatosEx lecturaDatosEx) {
            System.out.println("Error al tratat de listar peliculas");
            lecturaDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;

        try {
            resultado = datos.buscar(nombreArchivo,buscar);
            System.out.println(resultado);
        } catch (LecturaDatosEx lecturaDatosEx) {
            System.out.println("Error al tratar de buscar la pelicula");
            lecturaDatosEx.printStackTrace(System.out);
        }

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo)){
                datos.borar(nombreArchivo);
                datos.crear(nombreArchivo);
            }else{
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx accesoDatosEx) {
            accesoDatosEx.printStackTrace();
        }

    }
}
