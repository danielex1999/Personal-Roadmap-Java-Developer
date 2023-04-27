import java.util.Properties;

public class EjemploPropiedadesDeSistemas {

    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("El nombre de usuario es: " + username);

        String home = System.getProperty("user.home");
        System.out.println("El directorio home es: " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("El directorio de trabajo es: " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("La versión de Java es: " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();

        System.out.println("El separador de líneas es: " + lineSeparator2);

        Properties properties = System.getProperties();
        properties.list(System.out);


    }
}
