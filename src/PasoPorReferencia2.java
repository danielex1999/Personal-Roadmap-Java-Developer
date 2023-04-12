class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre() {
        return this.nombre;
    }
}

public class PasoPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Juan");

        System.out.println("iniciamos el método main ");

        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar el método test");
        test(persona);
        System.out.println("Después de llamar el método test");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de arreglo modificados");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test ");
        persona.modificarNombre("Pedro");
        System.out.println("Finaliza el método test ");
    }
}
