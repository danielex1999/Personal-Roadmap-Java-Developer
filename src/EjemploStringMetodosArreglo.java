public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo= arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
             System.out.println("arreglo = " + arreglo[i]);
        }

    }
}
