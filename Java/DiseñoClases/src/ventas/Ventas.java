package ventas;

import com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 100);
        Producto producto2 = new Producto("Camisa",50);
        Producto producto3 = new Producto("Medias",10);
        Producto producto4 = new Producto("Boxer",15);
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        System.out.println();

        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();


    }
}
