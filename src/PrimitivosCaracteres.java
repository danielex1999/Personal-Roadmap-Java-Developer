public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal =64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);

        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == caracter " + (simbolo == caracter));

        char espacio ='\u0020';
        char retroceso='\b';
        char tabulador='\t';
        char nuevaLinea='\n';
        char retornoCarro='\r';

        System.out.println("Tipo de char corresponde en bite a "+ System.lineSeparator() +Character.BYTES);
        System.out.println("Tipo de char corresponde en bites a "+ Character.SIZE);
        System.out.println("Valor min en char "+ Character.MIN_VALUE);
        System.out.println("Valor max en char "+ Character.MAX_VALUE);


    }
}
