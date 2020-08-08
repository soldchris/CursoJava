package negocio;

import excepciones.EscrituraDatosEx;

public interface CatalogoPeliculas {
    public void agregarPelicula(String nombrePelicula, String nombreArchvo) ;
    public void listarPeliculas(String nombreArchivo);
    public void buscarPelicula(String nombreArchivo, String buscar);
    public void iniciarArchivo(String nombreArchivo);
}
