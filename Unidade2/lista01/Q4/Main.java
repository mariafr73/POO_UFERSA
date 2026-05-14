package lista01.Q4;

public class Main {
    public static void main(String[] args) {
        CalculadoraProduto calc = new CalculadoraProduto();

        System.out.println("Produto de 2 e 3: " + calc.produto(2, 3));
        System.out.println("Produto de 2, 3 e 4: " + calc.produto(2, 3, 4));
        System.out.println("Produto de 5, 2, 2 e 3: " + calc.produto(5, 2, 2, 3));
        System.out.println("Produto de 10: " + calc.produto(10));
    }
}