public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "texto.txt";
        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(i+1));
    }
}
