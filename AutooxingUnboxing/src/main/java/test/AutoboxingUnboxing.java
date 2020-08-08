package test;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Autobxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        //Otra manera de asegurarnos que nos devuelve un entero
        System.out.println("enteroObj = " + enteroObj.intValue());

        //Unboxing (Extraemos el tipo primitivo de objeto envolvente)
        int entero = enteroObj;
        System.out.println("entero = " + entero);

        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj);
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        System.out.println("int a partir del float = " + floatObj.intValue());

    }
}
