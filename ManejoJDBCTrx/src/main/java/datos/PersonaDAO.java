package datos;

import domain.Persona;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static datos.Conexion.*;

public class PersonaDAO {
    private Connection conexonTransaccional;
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, mail, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO  persona (nombre, apellido, mail, telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET  nombre = ?, apellido = ?, mail = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public  PersonaDAO(){

    }


    public PersonaDAO(Connection conexonTransaccional){

        this.conexonTransaccional = conexonTransaccional;
    }

    public List<Persona> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = this.conexonTransaccional != null ? this.conexonTransaccional :  getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String mail = rs.getString("mail");
                String telefono = rs.getString("telefono");
                persona = new Persona(idPersona,nombre,apellido,mail,telefono);
                personas.add(persona);
            }
        }
        finally {
                close(rs);
                close(stmt);
                if (conexonTransaccional == null){
                    close(conn);
                }
        }
        return personas;
    }

    public int insertar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexonTransaccional != null ? this.conexonTransaccional :  getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,persona.getNombre());
            stmt.setString(2,persona.getApellido());
            stmt.setString(3,persona.getEmail());
            stmt.setString(4,persona.getTelefono());
            registros = stmt.executeUpdate();
        }
        finally {
                close(stmt);
                if (conexonTransaccional == null){
                    close(conn);
                }
        }
        return registros;
    }

    public int actualizar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexonTransaccional != null ? this.conexonTransaccional :  getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,persona.getNombre());
            stmt.setString(2,persona.getApellido());
            stmt.setString(3,persona.getEmail());
            stmt.setString(4,persona.getTelefono());
            stmt.setInt(5,persona.getIdPersona());
            registros= stmt.executeUpdate();

        }
        finally {
                close(stmt);
                if (conexonTransaccional == null){
                    close(conn);
                }
            }

        return registros;
    }

    public int eliminar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexonTransaccional != null ? this.conexonTransaccional :  getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,persona.getIdPersona());
            registros = stmt.executeUpdate();

        }finally {
            close(stmt);
            close(conn);

        }
        return registros;
    }

}
