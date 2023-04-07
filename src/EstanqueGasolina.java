import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nivel de gasolina: ");
        int nivel = entrada.nextInt();

        if (nivel > 70) {
            System.out.println("El estanque solo tiene capacidad para 70 litros");
        }else if (nivel == 70) {
            System.out.println("Estanque lleno");
        }else if (nivel < 70 && nivel > 60) {
            System.out.println("Estanque casi lleno");
        } else if (nivel <= 60 && nivel > 40) {
            System.out.println("Estanque  3/4");
        } else if (nivel <= 40 && nivel > 35) {
            System.out.println("Medio Estanque");
        } else if (nivel <= 35 && nivel > 20) {
            System.out.println("Insuficiente");
        } else if (nivel <= 20 && nivel > 1) {
            System.out.println("Suficiente");
        } else {
            System.out.println("0 no es un nivel valido");
        }
    }
}
