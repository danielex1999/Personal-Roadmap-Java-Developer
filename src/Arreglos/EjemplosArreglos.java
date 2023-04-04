package Arreglos;

import java.util.Arrays;

public class EjemplosArreglos {
    public static void main(String[] args) {

        String[] nombres = new String[7];

        nombres[0] = "Juan";
        nombres[1] = "Karla";
        nombres[2] = "Ricardo";
        nombres[3] = "Maria";
        nombres[4] = "Jose";
        nombres[5] = "Luis";
        nombres[6] = "Pedro";

        Arrays.sort(nombres);

        System.out.println("nombres[0] = " + nombres[0]);
        System.out.println("nombres[1] = " + nombres[1]);
        System.out.println("nombres[2] = " + nombres[2]);
        System.out.println("nombres[3] = " + nombres[3]);
        System.out.println("nombres[4] = " + nombres[4]);
        System.out.println("nombres[5] = " + nombres[5]);
        System.out.println("nombres[6] = " + nombres[6]);

        int[] enteros = new int[4];

        enteros[0] = 1;
        enteros[1] = 2;
        enteros[2] = 3;
        enteros[3] = 4;

        int i = enteros[0];
        int j = enteros[1];
        int k = enteros[2];
        int l = enteros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
