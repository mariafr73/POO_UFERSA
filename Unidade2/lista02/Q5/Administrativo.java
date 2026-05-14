package lista02.Q5;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual() {
        if (turno.equalsIgnoreCase("noite")) {
            return (getSalario() * 13) + (adicionalNoturno * 12);
        }

        return getSalario() * 13;
    }

    public String toString() {
        return super.toString() +
               " | Turno: " + turno +
               " | Adicional noturno: R$ " + adicionalNoturno;
    }
}