public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObj = Integer.valueOf(intPrimitivo);
        Integer intObj2 = intPrimitivo;
        System.out.println("intObj = " + intObj);

        int num = intObj;
        System.out.println("num = " + num);
        int num2 = intObj.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObj = intObj.shortValue();
        System.out.println("shortObj = " + shortObj);

        Byte byteObj = intObj.byteValue();
        System.out.println("byteObj = " + byteObj);

        Long longObj = intObj.longValue();
        System.out.println("longObj = " + longObj);

    }
}
