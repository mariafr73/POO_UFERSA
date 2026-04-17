public class Aluno {
    private String matricula;
    private String nome;
    private double p1;
    private double p2;
    private double trabalho;

    public Aluno(String matricula, String nome, double p1, double p2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    public double media() {
        return (2.5 * p1 + 2.5 * p2 + 2 * trabalho) / 7.0;
    }

    public double mediaFinal(double ef) {
        return (media() * 6 + ef * 4) / 10;
    }

    public String situacao(double ef) {
        double mp = media();

        if (mp >= 7) {
            return "Aprovado";
        } else if (mp < 3) {
            return "Reprovado";
        } else {
            double mf = mediaFinal(ef);
            if (mf >= 5) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }
    }

    public String toString() {
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nP1: " + p1 + "\nP2: " + p2 + 
        "\nTrabalho: " + trabalho + "\nMédia Parcial: " + media();
    }
}