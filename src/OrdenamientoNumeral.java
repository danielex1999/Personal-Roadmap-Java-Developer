import java.util.Scanner;

public class OrdenamientoNumeral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primero numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;

        System.out.println("El mayor es: " + max);
        System.out.println("El menor es: " + min);
    }
}
