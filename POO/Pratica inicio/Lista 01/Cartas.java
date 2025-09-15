import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor da carta (1 a 13): ");
        int valor = leitor.nextInt();

        System.out.print("Informe o naipe (1 = Ouros, 2 = Paus, 3 = Copas, 4 = Espadas): ");
        int naipe = leitor.nextInt();

        String nomeCarta;
        switch (valor) {
            case 1: 
                nomeCarta = "Ás"; 
                break;
            case 11: 
                nomeCarta = "Valete"; 
                break;
            case 12: 
                nomeCarta = "Dama"; 
                break;
            case 13: 
                nomeCarta = "Rei"; 
                break;
            default: 
                nomeCarta = String.valueOf(valor);
        }

        String nomeNaipe;
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
                nomeNaipe = "Naipe inválido";
        }

        if (valor < 1 || valor > 13 || naipe < 1 || naipe > 4) {
            System.out.println("Valor ou naipe inválido!");
        } else {
            System.out.println(nomeCarta + " de " + nomeNaipe); 
        }
        leitor.close();
    }
    
}
