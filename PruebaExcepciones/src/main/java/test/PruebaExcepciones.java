package test;

import domain.*;
import excepciones.*;


public class PruebaExcepciones {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.simularError(false);
        ejecutar(datos, "listar");

    }

    private static void ejecutar(AccesoDatos datos, String accion){
        if (accion.equals("listar")){
            try {
                datos.listar();
            } catch (LecturaExcepcion ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }catch (AccesoDatosEx ex){
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("Se ejecuta proceso Finally de Lectura");
            }
        }else if(accion.equals("insertar")){
            try {
                datos.insertar();
            } catch (EscrituraExcepcion ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }catch (AccesoDatosEx ex){
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("Se ejecuta proceso Finally de Insertar");
            }
        }else {
            System.out.println("No ha ingresado una acción valida");
        }

    }

}
