package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;

import java.sql.Connection;
import java.sql.SQLException;

public class ManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuario = new UsuarioDAO(conexion);
            //Usuario usuarioNuevo = new Usuario();
            //usuarioNuevo.setUsario("soldchris");
            //usuarioNuevo.setPassword("12345");
            //usuario.insertar(usuarioNuevo);

            Usuario cambiarUsuario = new Usuario();
            cambiarUsuario.setUsario("avril");
            cambiarUsuario.setPassword("1234567");
            cambiarUsuario.setId_usuario(6);
            usuario.actualizar(cambiarUsuario);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transacción");
            conexion.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            System.out.println("Entramos en rollback");
            try {
                conexion.rollback();
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
