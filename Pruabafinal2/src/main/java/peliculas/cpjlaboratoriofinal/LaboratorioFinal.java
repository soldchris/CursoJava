package cpjlaboratoriofinal;

import excepciones.EscrituraDatosEx;
import negocio.*;

import java.util.Scanner;

public class LaboratorioFinal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String nombreArchivo = "C:\\Users\\1598597\\Documents\\CatalogoPeliculas\\pelicula.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
    private static int opcion = -1;

    public static void main(String[] args) {
        try {
            while (opcion!=0){
                System.out.println("Elige Opción: \n1.- Iniciar Catalogo Peliculas" +
                        "\n2.- Agregar Pelicula" +
                        "\n3.- Listar Peliculas" +
                        "\n4.- Buscar Pelicula" +
                        "\n0.- Salir");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion){
                    case 1:
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de la Pelicula: ");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre,nombreArchivo);
                        break;
                    case 3:
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Introduzca el nombre de la Pelicula a buscar: ");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo,buscar);
                        break;
                    case 0:
                        System.out.println("Hasta pronto!");
                    default:
                        System.out.println("Opción no reconocida!");
                        break;
                }
                System.out.println("\n");
            }

        }catch (Exception e){
            System.out.println("Error!");
        }



    }
}
