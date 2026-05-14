package lista01.Q5;

public class Main {
    public static void main(String[] args) {
        SimuladorDados simulador = new SimuladorDados();

        simulador.simular(36000000); // 36 milhões de vezes

        simulador.mostrarResultados();
    }
}