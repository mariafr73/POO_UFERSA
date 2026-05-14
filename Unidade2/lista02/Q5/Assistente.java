package lista02.Q5;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return super.toString() +
               " | Matrícula: " + matricula;
    }
}