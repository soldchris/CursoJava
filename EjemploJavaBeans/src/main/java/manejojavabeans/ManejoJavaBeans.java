package manejojavabeans;

import beans.PersonaBean;

public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(20);
        System.out.println("Nombre= " +  bean.getNombre());
        System.out.println("Edad= "+ bean.getEdad());

        PersonaBean bean2 = new PersonaBean("Karla", 33);
        System.out.println(bean2);


    }
}
