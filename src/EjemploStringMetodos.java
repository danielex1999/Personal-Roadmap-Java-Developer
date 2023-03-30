import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre = " + nombre.length());
        System.out.println("nombre = " + nombre.toLowerCase());
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt() = " + nombre.charAt(0));
        System.out.println("nombre.charAt() = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(1) = " + nombre.substring(nombre.length()-2));

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace() = " + trabalengua.replace('a','.'));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf() = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf() = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.startsWith() = " + trabalengua.startsWith("tr"));
        System.out.println("trabalengua.endsWith() = " + trabalengua.endsWith("as"));
        System.out.println("trabalengua.contains() = " + trabalengua.contains("lengua"));
        System.out.println("  trabalengua.trim() = " + trabalengua.trim());


    }
}
