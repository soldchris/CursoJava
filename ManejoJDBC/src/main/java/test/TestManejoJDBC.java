package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoJDBC {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //insertando un nuevo objeto de tipo persona
        Persona personaNueva = new Persona("Christian","Machado","cmachado@mail.com","3138406719");
        personaDao.insertar(personaNueva);

        List<Persona> personas = personaDao.seleccionar();
        //for(Persona persona: personas){
        //    System.out.println(persona);
        //}
        personas.forEach(System.out::println);
    }
}
