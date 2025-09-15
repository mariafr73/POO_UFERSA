package Q03;

public class Aluno {
    private String matricula;
    private String nome;
    private double p1;
    private double p2;
    private double t;

    public Aluno(String matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public double media() {
        return (2.5 * p1 + 2.5 * p2 + 2 * t) / 7.0;
    }

    public double provaFinal() {
        double mp = media();

        if (mp < 3.0 || mp >= 7.0) {
            return 0.0;
        }

        // Se chegou aqui, o aluno precisa de exame final.
        // Queremos MF >= 5.0
        // MF = (MP * 6 + EF * 4) / 10
        // Manipulando: EF >= (50 - MP * 6) / 4

        double notaNecessaria = (50 - mp * 6) / 4;

        if (notaNecessaria < 0) {
            notaNecessaria = 0;
        } else if (notaNecessaria > 10) {
            notaNecessaria = 10;
        }

        return notaNecessaria;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}