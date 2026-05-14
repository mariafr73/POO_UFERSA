package lista02.Q4;

public class TestePolitico {
    public static void main(String[] args) {

        Prefeito prefeito = new Prefeito(
                "João Silva",
                50,
                "ABC",
                "São Miguel"
        );

        Governador governador = new Governador(
                "Maria Souza",
                55,
                "XYZ",
                "Rio Grande do Norte"
        );

        System.out.println("Prefeito:");
        System.out.println(prefeito);

        System.out.println("\nGovernador:");
        System.out.println(governador);
    }
}