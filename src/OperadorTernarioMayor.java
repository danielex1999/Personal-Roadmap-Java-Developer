import java.util.Scanner;

public class OperadorTernarioMayor {
    public static void main(String[] args) {
        int max=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primero numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int num3 = entrada.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("El primer numero es: " + num1);
        System.out.println("El segundo numero es: " + num2);
        System.out.println("El tercer numero es: " + num3);

        System.out.println("El numero mayor es: " + max);
    }


}
