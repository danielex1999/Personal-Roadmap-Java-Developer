import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el primer nombre:");
        String nombre1 = scanner.nextLine();
        System.out.println("Proporciona el segundo nombre:");
        String nombre2 = scanner.nextLine();
        System.out.println("Proporciona el tercer nombre:");
        String nombre3 = scanner.nextLine();

        String result = "";
        StringBuilder sb = new StringBuilder(result);

        sb.append(Character.toUpperCase(nombre1.charAt(1)) + "." + nombre1.substring(nombre1.length() - 2) + "_");
        sb.append(Character.toUpperCase(nombre2.charAt(1)) + "." + nombre2.substring(nombre2.length() - 2) + "_");
        sb.append(Character.toUpperCase(nombre3.charAt(1)) + "." + nombre3.substring(nombre3.length() - 2));

        System.out.println(sb);
    }
}
