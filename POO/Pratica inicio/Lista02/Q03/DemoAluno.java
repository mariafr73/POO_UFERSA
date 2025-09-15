package Q03;

public class DemoAluno {
    public static void main(String[] args) {
        // Criando alguns alunos
        Aluno aluno1 = new Aluno("2023001", "João Silva", 8.0, 7.5, 9.0);
        Aluno aluno2 = new Aluno("2023002", "Maria Souza", 4.0, 5.0, 6.0);
        Aluno aluno3 = new Aluno("2023003", "Carlos Lima", 2.0, 2.5, 3.0);

        Aluno[] alunos = { aluno1, aluno2, aluno3 };

        for (Aluno aluno : alunos) {
            System.out.println("\nAluno: " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
            double mp = aluno.media();
            System.out.printf("Média Parcial: %.2f\n", mp);

            double ef = aluno.provaFinal();

            if (ef == 0.0) {
                if (mp >= 7.0) {
                    System.out.println("Situação: Aprovado por média.");
                } else {
                    System.out.println("Situação: Reprovado por média.");
                }
            } else {
                System.out.printf("Nota necessária na Prova Final: %.2f\n", ef);
                // Suponha que ele consiga tirar exatamente essa nota:
                double mf = (mp * 6 + ef * 4) / 10;
                System.out.printf("Média Final: %.2f\n", mf);

                if (mf >= 5.0) {
                    System.out.println("Situação: Aprovado após final.");
                } else {
                    System.out.println("Situação: Reprovado após final.");
                }
            }
        }
    }
}