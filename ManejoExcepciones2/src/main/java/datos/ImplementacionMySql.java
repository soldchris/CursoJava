package datos;

import excepciones.*;

public class ImplementacionMySql implements AccesoDatos{

    private boolean simularError;

    @Override
    public void insertar() throws EscrituraDatosEx {
        if (this.simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }
        else{
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws LecturaDatosEx {
        if (this.simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }
        else{
            System.out.println("Listar desde MySql");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;

    }

    public boolean isSimularError(){
        return this.simularError;
    }
}
