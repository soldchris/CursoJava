package domain;

import excepciones.*;


public class ImplementacionMysql implements AccesoDatos{
    private boolean error;


    @Override
    public void simularError(boolean error) {
        this.error = error;
    }

    public boolean isError(){
        return this.error;
    }

    public void listar() throws LecturaExcepcion {
        if (this.error){
            throw new LecturaExcepcion("Error al momento de realizar la lectura a la base de datos MySql");
        }else{
            System.out.println("Se realiza la lectura a la base de datos MySql de manera exitosa!");
        }
    }

    public void insertar() throws EscrituraExcepcion {
        if (this.error){
            throw new EscrituraExcepcion("Error al momento de realizar la escritura a la base de datos MySql");
        }else{
            System.out.println("Se realiza la escritura a la base de datos MySqli de manera Exitosa!");
        }
    }
}
