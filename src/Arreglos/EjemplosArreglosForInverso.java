package Arreglos;

import java.util.Arrays;

public class EjemplosArreglosForInverso {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("Usando For");
        for (int i = 0; i < total; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

        System.out.println("------------------------");
        System.out.println("Usando For Inverso");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
    }
}
