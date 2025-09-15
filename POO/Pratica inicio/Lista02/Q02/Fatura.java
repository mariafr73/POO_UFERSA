package Q02;

public final class Fatura {
    private String numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(String numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    public double calculaTotal() {
        return quantidade * precoUnitario;
    }

    public void mostrar() {
        System.out.println("\nNúmero de identificação: " + numeroIdentificacao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$" + precoUnitario);
        System.out.println("Valor total: R$" + calculaTotal());
    }
}