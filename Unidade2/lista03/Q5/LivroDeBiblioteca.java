package lista03.Q5;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas,
                             int anoDaEdicao, String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.emprestado = false;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void empresta() {
        emprestado = true;
    }

    public void devolve() {
        emprestado = false;
    }

    public String localizacao() {
        return localizacao;
    }

    public String descricao() {
        return "Livro de biblioteca: " + qualTitulo() + ", de " + qualAutor();
    }

    public String toString() {
        return super.toString() +
               " | Localização: " + localizacao +
               " | Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}