package lista03.Q2;

public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.valorHora = 2.0;
    }

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public double calcularSalario(int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

    public String toString() {
        return "Nome: " + nome + " | Valor por hora: R$ " + valorHora;
    }
}