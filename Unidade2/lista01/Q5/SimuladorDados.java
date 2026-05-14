package lista01.Q5;

import java.util.Random;

public class SimuladorDados {
    private int[] contagem;

    public SimuladorDados() {
        contagem = new int[13];
    }

    public void simular(int vezes) {
        Random random = new Random();

        for (int i = 0; i < vezes; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            int soma = dado1 + dado2;
            contagem[soma]++;
        }
    }

    public void mostrarResultados() {
        System.out.println("Soma\tQuantidade");

        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + contagem[i]);
        }
    }
}