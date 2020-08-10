package test;

import datos.*;
import domain.Persona;

import java.sql.*;

public class ManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaDAO persona = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Lara");
            cambioPersona.setEmail("klara");
            cambioPersona.setTelefono("5566881122");
            persona.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            //nuevaPersona.setApellido("11111111111111111111111111111111111111111111111111");
            nuevaPersona.setApellido("Ramirez");
            persona.insertar(nuevaPersona);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transacción");
            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }




    }
}
