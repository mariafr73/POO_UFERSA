package Lista03.Questao06;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("João");
        RegistroAcademico aluno2 = new RegistroAcademico("Maria");
        RegistroAcademico aluno3 = new RegistroAcademico("Pedro");

        aluno1.mostraRegistro();
        aluno2.mostraRegistro();
        aluno3.mostraRegistro();
    }
}
