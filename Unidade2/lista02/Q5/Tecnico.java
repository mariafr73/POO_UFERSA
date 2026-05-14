package lista02.Q5;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double ganhoAnual() {
        return (getSalario() + bonusSalarial) * 13;
    }

    public String toString() {
        return super.toString() +
               " | Bônus salarial: R$ " + bonusSalarial;
    }
}