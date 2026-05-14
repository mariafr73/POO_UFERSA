package lista03.Q5;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca(
                "Java Como Programar",
                "Deitel",
                968,
                2017,
                "Corredor 2, Prateleira D"
        );

        System.out.println(livro);
        System.out.println(livro.descricao());
        System.out.println("Localização: " + livro.localizacao());
        System.out.println("Máximo de dias: " + ItemDeBiblioteca.maximoDeDiasParaEmprestimo);

        livro.empresta();
        System.out.println("Está emprestado? " + livro.estaEmprestado());

        livro.devolve();
        System.out.println("Está emprestado? " + livro.estaEmprestado());
    }
}