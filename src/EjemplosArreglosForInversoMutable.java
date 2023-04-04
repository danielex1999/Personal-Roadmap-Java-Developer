import java.util.Arrays;
import java.util.Collections;

public class EjemplosArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo) {

        int total = arreglo.length;
        int total2 = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1];
            arreglo[i] = inverso;
            arreglo[total - 1] = actual;
            total--;
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta Generacion", "Bicicleta Oxford", "HP Notebook",
                "Micaela Flores", "Monitor Samsung Curvo", "Apple Watch 4", "Beats Headphones", "Laptop Dell",
                "Audifonos JBL", "Ipad 6ta Generacion", "Reloj Apple", "Macbook Pro Retina"};

        int total = productos.length;

        Arrays.sort(productos);
        //arregloInverso(productos);
        Collections.reverse(Arrays.asList(productos));

        System.out.println("------------------------");

        for (int i = 0; i < total; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
    }
}
