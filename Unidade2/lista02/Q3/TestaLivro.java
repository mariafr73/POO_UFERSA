package lista02.Q3;

public class TestaLivro {
    public static void main(String[] args) {

        LivroLivraria livroVenda = new LivroLivraria("Java Como Programar", "Deitel", 2017, 250.00, 10);

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca( "Introdução à POO", "Rogério Santos", 2013, "BIB-001", false);

        System.out.println("Livro de Livraria:");
        System.out.println(livroVenda);

        System.out.println("\nLivro de Biblioteca:");
        System.out.println(livroBiblioteca);
    }
}