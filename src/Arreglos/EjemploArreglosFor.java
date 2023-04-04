package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
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

        for (int i = 0; i < total; i++) {
            System.out.println("productos["+i+"] = " + productos[i]);
        }

        System.out.println("------------------------");
        for(String producto: productos){
            System.out.println("producto = " + producto);
        }

        System.out.println("------------------------");
        int i=0;
        while(i<total){
            System.out.println("productos["+i+"] = " + productos[i]);
            i++;
        }

        System.out.println("------------------------");
        int j=0;
        do{
            System.out.println("productos["+j+"] = " + productos[j]);
            j++;
        }while(j<total);

        System.out.println("------------------------");
        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k*3;
        }

        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros["+k+"] = " + numeros[k]);
        }

    }
}
