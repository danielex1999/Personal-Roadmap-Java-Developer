import java.util.Scanner;

public class AreaDeCirculo {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.println("Digite el radio del circulo: ");
        double radio = st.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("La area del circulo es: " + area);

    }
}
