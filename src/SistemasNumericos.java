import javax.lang.model.SourceVersion;
import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingresar el numero entero");
        int numDecimal = 0;

        try {
            numDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numDecimal = " + numDecimal);

        String resultadoBinario = "El numero binario de " + numDecimal + " = " + Integer.toBinaryString(numDecimal);
        System.out.println(resultadoBinario);

        int numBinario = 0b111110100;

        System.out.println("numBinario = " + numBinario);

        String resultadoOctal = "El numero octal de " + numDecimal + " = " + Integer.toOctalString(numDecimal);
        System.out.println(resultadoOctal);

        int numOctal = 0764;

        System.out.println("numOctal = " + numOctal);

        String resultadoHex = "El numero hexagesimal de " + numDecimal + " = " + Integer.toHexString(numDecimal);
        System.out.println(resultadoHex);



        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal ;
        mensaje += "\n"+ resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);


    }
}
