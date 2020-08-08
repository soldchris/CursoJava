package palabrafinal;

public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //modificar un atributo marcado como final

        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Mario");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
