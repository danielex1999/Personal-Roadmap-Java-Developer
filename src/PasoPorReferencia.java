public class PasoPorReferencia {
    public static void main(String[] args) {
        int edad[] = {10, 11, 12};

        System.out.println("iniciamos el método main ");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Antes de llamar el metodo test");
        test(edad);
        System.out.println("Despues de llamar el metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos de arreglo modificados");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el método test ");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el método test ");
    }
}
