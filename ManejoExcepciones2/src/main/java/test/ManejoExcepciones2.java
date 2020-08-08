package test;

import datos.*;
import excepciones.*;

public class ManejoExcepciones2 {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(true);
        ejecutar(datos, "insertar");

        //AccesoDatos datos2 = new ImplementacionOracle();
        //datos2.simularError(false);
        //ejecutar(datos2, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals(accion)){
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }catch (AccesoDatosEx ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }catch (Exception ex){
                System.out.println("Error general");
                ex.printStackTrace();
            }
            finally {
                System.out.println("Procesar finally es opcional pero siempre se va a ejecutar");
            }
        }
        else if("insertar".equals(accion)){
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
            finally {
                System.out.println("Procesar finaly es opcional");
            }
        }
        else{
            System.out.println("No se proporcionao ninguna accion conocida");
        }

    }
}
