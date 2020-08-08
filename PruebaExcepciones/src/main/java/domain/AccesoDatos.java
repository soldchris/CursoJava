package domain;

import excepciones.EscrituraExcepcion;
import excepciones.LecturaExcepcion;

public interface AccesoDatos {
    public static final int MAX_REGISTROS = 10;

    public abstract void insertar() throws EscrituraExcepcion;

    public abstract void listar() throws LecturaExcepcion;

    public abstract void simularError(boolean error);
}
