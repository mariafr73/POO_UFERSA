package Lista03.Questao05;

public class DemoMaiorValor {
    public static void main(String[] args) {
        System.out.println("Maior entre 5 e 9 (int): " + MaiorValor.maior(5, 9));
        System.out.println("Maior entre 3.2 e 7.8 (double): " + MaiorValor.maior(3.2, 7.8));
        System.out.println("Maior entre 4, 10 e 7 (int): " + MaiorValor.maior(4, 10, 7));
        System.out.println("Maior entre 2.5, 8.1 e 6.3 (double): " + MaiorValor.maior(2.5, 8.1, 6.3));
        System.out.println("Maior entre 1, 4, 9, 3 (int): " + MaiorValor.maior(1, 4, 9, 3));
        System.out.println("Maior entre 1.1, 2.2, 3.3, 4.4 (double): " + MaiorValor.maior(1.1, 2.2, 3.3, 4.4));
        System.out.println("Maior entre 7, 2, 5, 9, 3 (int): " + MaiorValor.maior(7, 2, 5, 9, 3));
        System.out.println("Maior entre 0.5, 2.7, 1.9, 3.6, 2.8 (double): " + MaiorValor.maior(0.5, 2.7, 1.9, 3.6, 2.8));
    }
}
