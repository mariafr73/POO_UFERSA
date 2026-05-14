package lista02.Q4;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade) {
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    public String toString() {
        return super.toString() +
               " | Cidade: " + cidade;
    }
}