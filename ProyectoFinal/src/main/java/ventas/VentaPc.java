package ventas;

import com.gm.ventapc.*;

public class VentaPc {
    public static void main(String[] args) {
        Raton ratonHp = new Raton("Bluetooth","HP");
        Teclado tecladoHp = new Teclado("USB","HP");
        Monitor monitorHp = new Monitor("HP",13);
        Raton ratonSan = new Raton("Bluetooth","Samsung");
        Teclado tecladoSan = new Teclado("Bluetooth","Samsung");
        Monitor monitorSan = new Monitor("Samsung",15);
        Raton ratonTo = new Raton("Bluetooth","Toshiba");
        Teclado tecladoTo = new Teclado("USB","Toshiba");
        Monitor monitorTo = new Monitor("Toshiba",17);
        Computadora computadora1 = new Computadora("HP,",monitorHp,tecladoHp,ratonHp);
        Computadora computadora2 = new Computadora("Samsung,",monitorSan,tecladoSan,ratonSan);
        Computadora computadora3 = new Computadora("Toshiba",monitorTo,tecladoTo,ratonTo);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        System.out.println("");

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora3);
        orden2.mostrarOrden();



    }
}
