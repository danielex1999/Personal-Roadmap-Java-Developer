public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Perez";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numerob = 5;

        System.out.println("detalle = " + detalle + " " + (numeroA + numerob));

        String detalle2 = curso.concat(" con el instructor ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
