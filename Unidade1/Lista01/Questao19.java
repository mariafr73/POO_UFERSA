public class Questao19 {
    public static int fatorial(int n, String recuo) {
        if (n == 0) {
            System.out.println(recuo + "0! = 1");
            return 1;
        }
        int resultado = n * fatorial(n - 1, recuo + "\t");
        System.out.println(recuo + n + "! = " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        fatorial(5, "");
    }
}