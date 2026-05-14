package lista03.Q2;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maria");
        Funcionario f2 = new Funcionario("João", 15.0);

        System.out.println(f1);
        System.out.println("Salário: R$ " + f1.calcularSalario(40));

        System.out.println(f2);
        System.out.println("Salário: R$ " + f2.calcularSalario(40));
    }
}
