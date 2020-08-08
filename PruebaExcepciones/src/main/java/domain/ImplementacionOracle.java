package domain;
import excepciones.*;

public class ImplementacionOracle implements AccesoDatos{
    private boolean error;

    public void simularError(boolean error){
        this.error = error;
    }

    public boolean isError(){
        return this.error;
    }

    public void insertar() throws EscrituraExcepcion {
        if (error){
            throw new EscrituraExcepcion("Error al momento de realizar la escritura en l base de datos Oracle");
        }else{
            System.out.println("Se realiza la escritura a la base de datos Oracle de manera Exitosa!");
        }
    }

    public void listar() throws LecturaExcepcion {
        if (error){
            throw new LecturaExcepcion("Error al momento de realizar la lecutra a la base de datos Oracle");
        }else{
            System.out.println("Se realiza la lectura a la base de datos Oracle de manera exitosa!");
        }
    }
}
