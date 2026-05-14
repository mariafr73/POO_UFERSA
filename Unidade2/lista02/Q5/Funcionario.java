package lista02.Q5;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public double ganhoAnual() {
        return salario * 13;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Nome: " + nome +
               " | Salário: R$ " + salario +
               " | Ganho anual: R$ " + ganhoAnual();
    }
}