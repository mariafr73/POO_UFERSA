package lista02.Q1;

public class Computador extends Equipamento {
    private String processador;
    private int memoria;

    public Computador(String nome, double preco, String processador, int memoria) {
        super(nome, preco);
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String toString() {
        return super.toString() +
               " | Processador: " + processador +
               " | Memória: " + memoria + "GB";
    }
}