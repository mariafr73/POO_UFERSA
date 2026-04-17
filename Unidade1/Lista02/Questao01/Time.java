public class Time {
    private String nome;
    private String cidade;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time(String nome, String cidade, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.cidade = cidade;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public void vencer() {
        vitorias++;
    }

    public void empatar() {
        empates++;
    }

    public void perder() {
        derrotas++;
    }

    @Override
    public String toString() {
        return "Time: \nNome = " + nome + "\nCidade = " + cidade + "\nVitorias = " + vitorias + "\nEmpates = " + empates + "\nDerrotas = " + derrotas;
    }
}