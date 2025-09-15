package Q01;

public class Campeonato {
    private String nomeDoCampeonato;
    private int faixaEtaria;
    private String corDaFaixa;
    private double peso;

    public Campeonato(int faixaEtaria, String corDaFaixa, double peso) {
        nomeDoCampeonato = "Campeonato de Jiu-Jitsu";
        this.faixaEtaria = faixaEtaria;
        this.corDaFaixa = corDaFaixa;
        this.peso = peso;
    }

    void inscricao() {
        System.out.println("===== Inscrição =====");
        System.out.println("Nome do Campeonato: " + nomeDoCampeonato);
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Cor da Faixa: " + corDaFaixa);
        System.out.println("Peso: " + peso);

        // Categoria por faixa etária
        if (faixaEtaria <= 10) {
            System.out.println("Categoria: Infantil");
        } else if (faixaEtaria <= 17) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Categoria: Adulto");
        }

        // Categoria por cor da faixa
        if (corDaFaixa.equals("Branca") || corDaFaixa.equals("Cinza") || corDaFaixa.equals("Amarela")) {
            System.out.println("Nível: Iniciante");
        } else if (corDaFaixa.equals("Laranja") || corDaFaixa.equals("Verde")) {
            System.out.println("Nível: Intermediário");
        } else if (corDaFaixa.equals("Azul") || corDaFaixa.equals("Roxa") || corDaFaixa.equals("Marrom") || corDaFaixa.equals("Preta")) {
            System.out.println("Nível: Avançado");
        }

        // Categoria por peso
        if (peso < 70) {
            System.out.println("Categoria de Peso: Leve");
        } else if (peso <= 85) {
            System.out.println("Categoria de Peso: Médio");
        } else {
            System.out.println("Categoria de Peso: Pesado");
        }

        System.out.println("Inscrição realizada com sucesso!");
        System.out.println("======================\n");
    }
}