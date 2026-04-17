public class Questao21 {
    public static boolean primoRec(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return primoRec(n, divisor - 1);
    }

    public static void main(String[] args) {
        int numero = 29;
        System.out.println(numero + " é primo? " + (primoRec(numero, numero - 1) ? "Sim" : "Não"));
    }
}