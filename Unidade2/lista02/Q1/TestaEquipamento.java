package lista02.Q1;

public class TestaEquipamento {
    public static void main(String[] args) {

        Equipamento e = new Equipamento("Mesa Digitalizadora", 800.0);

        Computador c = new Computador("Notebook", 3500.0, "i5", 8);

        System.out.println("Equipamento:");
        System.out.println(e);

        System.out.println("\nComputador:");
        System.out.println(c);
    }
}