import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da carta (1 a 13): ");
        int valor = leitor.nextInt();

        System.out.print("Digite o naipe (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        int naipe = leitor.nextInt();

        String nomeValor;
        String nomeNaipe;

        switch (valor) {
            case 1: 
                nomeValor = "Ás"; 
                break;
            case 11: 
                nomeValor = "Valete"; 
                break;
            case 12: 
                nomeValor = "Dama"; 
                break;
            case 13: 
                nomeValor = "Rei"; 
                break;
            default: 
                nomeValor = String.valueOf(valor); 
                break;
        }

        switch (naipe) {
            case 1: 
                nomeNaipe = "Ouros"; 
                break;
            case 2: 
                nomeNaipe = "Paus"; 
                break;
            case 3: 
                nomeNaipe = "Copas"; 
                break;
            case 4: 
                nomeNaipe = "Espadas"; 
                break;
            default: 
                nomeNaipe = null; 
                break;
        }

        if (nomeNaipe != null) {
            System.out.println("A carta é: " + nomeValor + " de " + nomeNaipe);
        } else {
            System.out.println("Naipe inválido");
        }

        leitor.close();
    }
}