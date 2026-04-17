package Lista03.Questao07;

public class DemoTrio {
    public static void main(String[] args) {
        Trio<Integer> numeros = new Trio<>(5, 5, 7);
        numeros.imprime();
        System.out.println("Quantidade de iguais: " + numeros.quantosIguais());

        Trio<String> palavras = new Trio<>("casa", "casa", "carro");
        palavras.imprime();
        System.out.println("Quantidade de iguais: " + palavras.quantosIguais());

        Trio<Double> reais = new Trio<>(2.5, 2.5, 2.5);
        reais.imprime();
        System.out.println("Quantidade de iguais: " + reais.quantosIguais());
    }
}