public class Questao13 {
    public static void main(String[] args) {
        int numero = 1;
        for (int linha = 1; linha <= 10; linha++) {
            for (int coluna = 1; coluna <= 6; coluna++) {
                System.out.printf("%2d ", numero);
                numero++;
            }
            System.out.println();
        }
    }
}