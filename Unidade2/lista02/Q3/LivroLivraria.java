package lista.q3;

public class LivroLivraria extends Livro {
    private double preco;
    private int quantidadeEstoque;

    public LivroLivraria(String titulo, String autor, int ano, double preco, int quantidadeEstoque) {
        super(titulo, autor, ano);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString() {
        return super.toString() +
               " | Preço: R$ " + preco +
               " | Estoque: " + quantidadeEstoque;
    }
}
