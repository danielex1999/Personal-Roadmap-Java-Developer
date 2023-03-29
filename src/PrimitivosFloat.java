public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat=2.12e3f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a "+ Float.BYTES);
        System.out.println("Float corresponde en bytes a "+ Float.SIZE);
        System.out.println("Valor mínimo para float "+ Float.MIN_VALUE);
        System.out.println("Valor máximo para float "+ Float.MAX_VALUE);

        double realDouble =3.40;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a "+ Double.BYTES);
        System.out.println("Double corresponde en bytes a "+ Double.SIZE);
        System.out.println("Valor mínimo para double "+ Double.MIN_VALUE);
        System.out.println("Valor máximo para double "+ Double.MAX_VALUE);
    }
}
