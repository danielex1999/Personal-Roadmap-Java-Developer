import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count1 = 0, count4 = 0, count5 = 0, countall = 0;
        double suma4 = 0, sum5 = 0;
        double[] numero_nota = new double[20];
        for (int i = 0; i < numero_nota.length; i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1) + ":");
            double nota = s.nextDouble();
            countall += nota;
            if (nota >= 1 && nota <= 7) {
                if (nota >= 1 && nota < 2)/*1 - 1.9*/ {
                    count1++;
                }
                if (nota >= 1 && nota < 4) /*1 - 3.9*/ {
                    count4++;
                    suma4 += nota;
                }
                if (nota >= 5 && nota <= 7)/*5 - 7*/ {
                    count5++;
                    sum5 += nota;
                }
            } else {
                System.out.println("Error finalizando el programa");
                s.close();
            }
        }
        System.out.println("La cantidad de notas entre 1 y 1.9 es: " + count1);
        System.out.println("El promedio de notas entre 1 y 3.9 es: " + (suma4 / count4));
        System.out.println("El promedio de notas entre 5 y 7 es: " + (sum5 / count5));
        System.out.println("El promedio general de notas es: " + (countall) / numero_nota.length);

    }
}
