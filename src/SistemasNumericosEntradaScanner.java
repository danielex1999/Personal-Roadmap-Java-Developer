import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        String numeroStr = scanner.nextLine();
        int numDecimal= 0;

        try{
            numDecimal= Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "El numero binario de " + numDecimal + " = " + Integer.toBinaryString(numDecimal);
        String resultadoOctal = "El numero octal de " + numDecimal + " = " + Integer.toOctalString(numDecimal);
        String resultadoHex = "El numero hexagesimal de " + numDecimal + " = " + Integer.toHexString(numDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal ;
        mensaje += "\n"+ resultadoHex;

        System.out.println(mensaje);

    }
}
