import java.util.Scanner;

public class MenorMultipleNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[10];
        int menor = 10;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            num[i] = s.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] < menor) {
                menor = num[i];
            }
        }

        System.out.println("-------------------------------------");

        if (menor <= 10) {
            System.out.println("El número menor(" + menor + ") es menor que 10!");
        } else {
            System.out.println("El numero menor(\"+menor+\") es igual o mayor que 10!");
        }
    }
}
