package test;

import java.util.*;

public class ManejoColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        Set miSet = new HashSet();
        Map miMap = new HashMap();

        //miLista.add(1);
        //miLista.add("2");
        //miLista.add("2"); //dato dublipacado para ver el compaortamiento
        //miLista.add(3);
        //imprimir(miLista);
        //System.out.println(" ");

        //miSet.add(1);
        //miSet.add(2);
        //miSet.add(3);
        //miLista.add("3");  //dato repetidos pero el set valida que exite y no los agregará
        //miSet.add(3);
        //imprimir(miSet);
        //System.out.println(" ");

        miMap.put("valor1", "Juan");
        miMap.put("Valor2", "Karla");
        miMap.put("Valor3", "Carlos");
        miMap.put("Valor3", "Rosario");  // el dato duplicado en Map reemplaza al que ya exitía
        //imprimir(miMap.keySet());
        //imprimir(miMap.values());
        System.out.println(miMap.get("Valor2"));

    }

    public static void imprimir(Collection coleccion){
        for (Object elemento : coleccion){
            System.out.println("Elemeno: " + elemento);
        }
    }
}
