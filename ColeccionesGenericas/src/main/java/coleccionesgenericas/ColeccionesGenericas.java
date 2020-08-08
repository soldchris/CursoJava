package coleccionesgenericas;

import java.util.*;

public class ColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("Juan");
        miLista.add("Carla");
        miLista.add("Juan");
        imprimir(miLista);

        Set<String> miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap();
        miMapa.put("1", "Juan");
        miMapa.put("2", "Karla");
        miMapa.put("3","Carlos");
        miMapa.put("3", "Rosario");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        System.out.println("");
        System.out.println(miMapa.get("3"));


    }

    private static void imprimir(Collection<String> coleccion){
        for (String elemento: coleccion){
            System.out.println("El elemento es: " + elemento);
        }
    }
}
