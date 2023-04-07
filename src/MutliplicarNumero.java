import java.util.Scanner;

public class MutliplicarNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el número a multiplicar:");
        int num = s.nextInt();
        System.out.println("Ingrese el número de veces a multiplicar:");
        int veces = s.nextInt();
        int resultado = 0;
        int num_positivo = Math.abs(num);
        int veces_positivo = Math.abs(veces);

        for (int i = 0; i < veces_positivo; i++) {
            if (num < 0 && veces < 0 /*- -*/ || num > 0 && veces > 0/*+ +*/) {
                resultado += num_positivo;
            }
            if(num>0 && veces<0 /*+ -*/ || num<0 && veces>0 /*- +*/){
                resultado -= num_positivo;
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
