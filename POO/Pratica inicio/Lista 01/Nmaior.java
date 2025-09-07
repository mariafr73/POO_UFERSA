import java.util.Scanner;

public class Nmaior{
    public static void main(String[] args){
        int n1, n2, n3;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.print("Informe o segundo número: ");
        n2 = leitor.nextInt();

        System.out.print("Informe o terceiro número: ");
        n3 = leitor.nextInt();

        if(n2 > n1 && n2 > n3){
            System.out.println("O segundo número é maior: " + n2);
        } else if(n1 > n2 && n1 > n3){
            System.out.println("O primeiro número é maior: " + n1);
        } else {
            System.out.println("O terceiro número é maior: " + n3);
        }

        leitor.close();
    }
}