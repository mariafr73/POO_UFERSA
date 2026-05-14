package lista03.Q4;

public class Principal {
    public static void main(String[] args) {
        Desenho d1 = new Desenho(
                new Circulo(), 2, 3,
                new Quadrado(), 5, 6
        );

        Desenho d2 = new Desenho(
                new Quadrado(), 1, 1,
                new Triangulo(), 4, 8
        );

        System.out.println("Desenho 1:");
        d1.apresenta();

        System.out.println("\nDesenho 2:");
        d2.apresenta();
    }
}