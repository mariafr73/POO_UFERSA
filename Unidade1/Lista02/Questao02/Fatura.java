public class Fatura{
    private int id;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(int id, String descricao, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        if (preco < 0) {
            preco = 0.0;
        }
        this.preco = preco;
    }

    public double CalculaTotal(){
        return quantidade * preco;
    }

    public String toString(){
        return "Fatura: \nId = " + id + "\nDescricao = " + descricao + "\nQuantidade = " + quantidade + "\nPreco = " + preco;
    }
}