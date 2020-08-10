package datos;

import domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;

public class UsuarioDAO {
    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioDAO(){

    }

    public UsuarioDAO(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = conexionTransaccional!= null ? conexionTransaccional:getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                String user = rs.getString("usuario");
                String password = rs.getNString("password");
                usuario = new Usuario(id_usuario,user,password);
                usuarios.add(usuario);
            }
        }
        finally {

                close(rs);
                close(stmt);
                if (conexionTransaccional == null){
                    close(conn);
                }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        int registros = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexionTransaccional!= null ? conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,usuario.getUsario());
            stmt.setString(2,usuario.getPassword());
            registros = stmt.executeUpdate();
        }
        finally {
                close(stmt);
                if (conexionTransaccional == null){
                    close(conn);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        int registros = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexionTransaccional != null ? conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,usuario.getUsario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3,usuario.getId_usuario());
            registros = stmt.executeUpdate();
        }
        finally {
                close(stmt);
                if (conexionTransaccional == null){
                    close(conn);
                }
        }
        return registros;
    }

    public int Eliminar(Usuario usuario) throws SQLException {
        int registros = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexionTransaccional != null ? conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,usuario.getId_usuario());
            registros = stmt.executeUpdate();
        }
        finally {
                close(stmt);
                if (conexionTransaccional == null){
                    close(conn);
                }
        }
        return  registros;
    }
}
