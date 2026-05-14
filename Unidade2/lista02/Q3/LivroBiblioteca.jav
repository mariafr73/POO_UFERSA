package lista02.Q3;

public class LivroBiblioteca extends Livro {
    private String codigoPatrimonio;
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, int ano, String codigoPatrimonio, boolean emprestado) {
        super(titulo, autor, ano);
        this.codigoPatrimonio = codigoPatrimonio;
        this.emprestado = emprestado;
    }

    public String toString() {
        return super.toString() +
               " | Código: " + codigoPatrimonio +
               " | Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}