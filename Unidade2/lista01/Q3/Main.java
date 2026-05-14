package lista01.Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (id < 0) {
                break;
            }

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = sc.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        System.out.println("\n--- LISTA DE CLIENTES ---");

        for (Cliente c : clientes) {
            System.out.println(c);
        }

        sc.close();
    }
}
