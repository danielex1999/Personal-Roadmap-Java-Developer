public class ConversionDeTipos {
    public static void main(String[] args) {
        String numero = "24";

        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9478.34";
        Double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        otroNumeroString = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroString = " + otroNumeroString);

        double otroNumeroDouble = 1.23456e2;
        String otroDoubleString = Double.toString(otroNumeroDouble);
        System.out.println("otroDoubleString = " + otroDoubleString);

        otroDoubleString = String.valueOf(1.23456e2f);
        System.out.println("otroDoubleString = " + otroDoubleString);

        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = (long) i;
        System.out.println("l = " + l);
        char b = (char) i;
        System.out.println("b = " + b);
        float f= (float) i;
        System.out.println("f = " + f);
    }
}
