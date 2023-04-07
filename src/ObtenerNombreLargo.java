import java.util.Scanner;

public class ObtenerNombreLargo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la primera persona: ");
        String nombre1 = entrada.nextLine();
        System.out.println("Ingrese el apellido de la primera persona: ");
        String apellido1 = entrada.nextLine();

        System.out.println("Ingrese el nombre de la segunda persona: ");
        String nombre2 = entrada.nextLine();
        System.out.println("Ingrese el apellido de la segunda persona: ");
        String apellido2 = entrada.nextLine();

        System.out.println("Ingrese el nombre de la tercera persona: ");
        String nombre3 = entrada.nextLine();
        System.out.println("Ingrese el apellido de la tercera persona: ");
        String apellido3 = entrada.nextLine();

        var fullname1 = nombre1 + " " + apellido1;
        var fullname2 = nombre2 + " " + apellido2;
        var fullname3 = nombre3 + " " + apellido3;

        ;

        if (fullname1.split("[a-zA-Z]").length > fullname2.split(" [a-zA-Z]").length && fullname1.split(" [a-zA-Z]").length > fullname3.split(" [a-zA-Z]").length) {
            System.out.println(fullname1 + " tiene el nombre más largo.");

        } else if (fullname2.split("[a-zA-Z] ").length > fullname1.split("[a-zA-Z]").length && fullname2.split("[a-zA-Z] ").length > fullname3.split("[a-zA-Z] ").length) {
            System.out.println(fullname2 + " tiene el nombre más largo.");

        } else if (fullname3.split("[a-zA-Z] ").length > fullname1.split("[a-zA-Z] ").length && fullname3.split("[a-zA-Z] ").length > fullname2.split(" [a-zA-Z]").length) {
            System.out.println(fullname3 + " tiene el nombre más largo.");
        }else {
            System.out.println("Los nombres son iguales de largos");
        }
    }
}
