package lista01.Q2;

public class Main {
    public static void main(String[] args) {

        Matriz2x2 matriz = new Matriz2x2(2, 3, 4, 5);

        matriz.imprimir();
        System.out.println("Determinante: " + matriz.determinante());
    }
}
