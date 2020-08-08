package paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido ="Valor atributo protegido";
    String atributoDefault ="Valor atributo default o package";
    private String atributoPrivado ="Atributo provado";

    public Clase1(){
        System.out.println("Constructor vacio publico");
    }

    public Clase1(String texto){
        System.out.println("Constructor tambien es publico con un argumento: " + texto);
    }
    protected  Clase1(String texto1, String texto2){
        System.out.println("Constructor protected con 2 argumentos = " + texto1 + " " + texto2);
    }

    Clase1(String texto1, String texto2, String texto3){
        System.out.println("Constructor Default o Package con 3 argumentos = " + texto1 + " " + texto2 + " " + texto3);
    }
    private Clase1(String texto1, String texto2, String texto3, String texto4){
        System.out.println("COnstructor privado");
    }

    //Metodos de nuestras clases

    public String metodoPublico(){
        return "Metodo publico";
    }

    protected String metodoProtegido(){
        return "Metodo protegido";
    }

    String metodoDefault(){
        return "Metodo Default o Package";
    }

    private String metodoPrivado(){
        return "Metodo privado";
    }



}
