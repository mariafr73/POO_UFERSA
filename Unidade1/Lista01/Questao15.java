public class Questao15 {
    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 2;

        while (encontrados < 4) {
            int soma = 0;
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) soma += i;
            }
            if (soma == numero) {
                System.out.println(numero + " é número perfeito.");
                encontrados++;
            }
            numero++;
        }
    }
}