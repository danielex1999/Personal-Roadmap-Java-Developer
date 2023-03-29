import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de la factura o descripción: ");
        String nomFactura = scanner.nextLine();

        System.out.println("Ingresar 2 precios de productos de tipo double");
        Double precioUno = scanner.nextDouble();
        Double precioDos = scanner.nextDouble();

        double bruto = precioUno + precioDos;
        double impuesto = 0.19 * bruto;
        double total = bruto + impuesto;

        System.out.println("La factura " + nomFactura + " tiene un total bruto de " + bruto + ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + total);


    }
}
