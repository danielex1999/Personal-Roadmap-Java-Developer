import javax.lang.model.SourceVersion;
import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr= JOptionPane.showInputDialog(null,"Ingresar el numero entero");
        int numDecimal=Integer.parseInt(numeroStr);
        System.out.println("numDecimal = " + numDecimal);

        System.out.println("numDecimal = " + numDecimal+ " = "+Integer.toBinaryString(numDecimal));

        int numBinario =0b111110100;

        System.out.println("numBinario = " + numBinario);

        System.out.println("numBinario = " + numDecimal+ " = "+Integer.toOctalString(numDecimal));

        int numOctal=0764;

        System.out.println("numOctal = " + numOctal);

        System.out.println("numero hexadecimal = " + numDecimal+ " = "+ Integer.toHexString(numDecimal));

        int numHex= 0x1f4;

        System.out.println("numHex = " + numHex);



    }
}
