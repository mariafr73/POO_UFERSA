package lista02.Q3;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String toString() {
        return "Título: " + titulo +
               " | Autor: " + autor +
               " | Ano: " + ano;
    }
}
