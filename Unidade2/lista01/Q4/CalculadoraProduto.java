package lista01.Q4;

public class CalculadoraProduto {
    public int produto(int... numeros) {
        int resultado = 1;

        for (int numero : numeros) {
            resultado *= numero;
        }

        return resultado;
    }
}