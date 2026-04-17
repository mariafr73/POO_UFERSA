package Lista03.Questao06;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0; // contador global de matrículas
    private int matricula;
    private String nome;

    // Construtor
    public RegistroAcademico(String nome) {
        numeroDeMatriculas++;          // incrementa sempre que uma instância é criada
        this.matricula = numeroDeMatriculas; // atribui matrícula única
        this.nome = nome;
    }

    // Métodos de acesso
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    // Exibe informações do registro
    public void mostraRegistro() {
        System.out.println("Matrícula: " + matricula + " | Nome: " + nome);
    }
}
