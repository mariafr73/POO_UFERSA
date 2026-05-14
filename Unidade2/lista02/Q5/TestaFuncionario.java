package lista02.Q5;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Carlos", 2000.00);

        Assistente assistente = new Assistente("Ana", 2200.00, 101);

        Tecnico tecnico = new Tecnico("Pedro", 2500.00, 202, 300.00);

        Administrativo administrativo = new Administrativo("Maria", 2400.00, 303, "noite", 200.00);

        System.out.println("Funcionário:");
        System.out.println(funcionario);

        System.out.println("\nAssistente:");
        System.out.println(assistente);

        System.out.println("\nTécnico:");
        System.out.println(tecnico);

        System.out.println("\nAdministrativo:");
        System.out.println(administrativo);
    }
}