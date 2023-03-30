public class EjemploStringTestRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            //c = c.concat(a).concat(b).concat("\n"); 500 =>1ms
            //c+= a + b + "\n"; 500 => 10ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("fin - inicio = " + (fin - inicio));
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }
}
