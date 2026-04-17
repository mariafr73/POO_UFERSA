public class Media{
    public static void main(String[] args) {
        Aluno a1 = new Aluno("2023001", "Maria", 5.0, 4.0, 6.0);

        System.out.println(a1);
        System.out.println("Média Final: " + a1.mediaFinal(6.0));
        System.out.println("Situação: " + a1.situacao(6.0));
    }
}