import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Introduce una fecha (yyyy-MM-dd): ");
        try {
            Date fecha = df.parse(scanner.next());
            System.out.println("Fecha: " + fecha);
            System.out.println("df: " + df.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("La fecha es posterior a la actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha es anterior a la actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("La fecha es igual a la actual");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("La fecha es posterior a la actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("La fecha es anterior a la actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("La fecha es igual a la actual");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
