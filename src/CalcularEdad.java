import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CalcularEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Introduce la fecha de nacimiento (yyyy-MM-dd): ");
        try {
            Date fecha = df.parse(scanner.next());

            Date fechaActual = new Date();

            long diferencia = fechaActual.getTime() - fecha.getTime();
            int year = (int) (diferencia / 1000 / 60 / 60 / 24 / 365);
            System.out.println("Tienes " + year + " años");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
