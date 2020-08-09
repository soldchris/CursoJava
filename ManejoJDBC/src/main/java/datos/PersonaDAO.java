package datos;

import domain.Persona;


import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static datos.Conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, mail, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO  persona (nombre, apellido, mail, telefono) VALUES(?,?,?,?)";

    public List<Persona> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = getConnection();
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
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,persona.getNombre());
            stmt.setString(2,persona.getApellido());
            stmt.setString(3,persona.getEmail());
            stmt.setString(4,persona.getTelefono());
            registros = stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registros;
    }

}
