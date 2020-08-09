package test;

import datos.PersonaDAO;
import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;

import java.util.*;

public class TestManejoJDBC {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //INSERTAR UN REGISTRO EN LA BASE DE DATOS persona
            // Persona personaNueva = new Persona("Christian","Machado","cmachado@mail.com","3138406719");
            //personaDao.insertar(personaNueva);

        //ACTUALIZAR UN REGISTRO DE LA BASE DE DATOS persona
            //Persona personaActualizar = new Persona(4,"Christian","Machado","christianjoliver85@gmail.com","3138406719");
            //int registros= personaDao.actualizar(personaActualizar);
            //System.out.println("Cantidad de registros actualizados: " + registros);
            //System.out.println("");

        //ELIMINAR UN REGISTRO DE LA BASE DE DATOS persona
            //Persona personaEliminar = new Persona(4);
            //int registros = personaDao.eliminar(personaEliminar);
            //System.out.println("Registros Eliminados: " + registros);



        //INSERTAR USUARIOS EN LA TABLA usuario
            //Usuario usuarioNuevo = new Usuario("Christian","123456");
            //int registros = 0;
            //registros = usuarioDAO.insertar(usuarioNuevo);

        //ACTUALIZAR USUARIO EN LA TABLA usuario
            //Usuario usuarioActualizar = new Usuario(1,"Christian","123456");
            //int registros = 0;
            //registros = usuarioDAO.actualizar(usuarioActualizar);
            //System.out.println("Usuario Actualizados: " + registros);

        //ELIMINAR REGISTRO DE LA BASE DE DATOS usuario
            //Usuario usuarioEliminar  = new Usuario(2);
            //int registros = 0;
            //registros = usuarioDAO.Eliminar(usuarioEliminar);
            //System.out.println("Cantidad de Registros Eliminados: " + registros);
            //System.out.println("");

        //CONSULTA A LA BASE DE DATOS
            //List<Usuario> usuarios= usuarioDAO.seleccionar();
        //for(Persona persona: personas){ System.out.println(persona);}
            //usuarios.forEach(System.out::println);




    }
}
