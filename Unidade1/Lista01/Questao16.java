public class Questao16 {
    public static void main(String[] args) {
        for (int n = 100; n <= 999; n++) {
            int c = n / 100;
            int d = (n / 10) % 10;
            int u = n % 10;

            int somaCubos = (c*c*c) + (d*d*d) + (u*u*u);

            if (somaCubos == n) {
                System.out.println(n + " = " + c + "³ + " + d + "³ + " + u + "³");
            }
        }
    }
}