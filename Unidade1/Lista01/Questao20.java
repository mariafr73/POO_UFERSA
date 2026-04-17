public class Questao20 {
    public static int mdc(int m, int n) {
        if (n > m) return mdc(n, m);
        if (n == 0) return m;
        return mdc(n, m % n);
    }

    public static void main(String[] args) {
        System.out.println("MDC(48, 18) = " + mdc(48, 18));
    }
}