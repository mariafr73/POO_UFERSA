import java.util.Scanner;

public class Promo {
    public static void main(String[] args){
        int s, n;
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.print("Informe o setor (111 - Cama, mesa e banho / 222 - Eletros / 0 - Sair): ");
            s = leitor.nextInt();
            
            if(s == 222){
                System.out.println("Setor Eletros: ");
            } else if(s == 111){
                System.out.println("Setor Cama, mesa e banho: ");
            }

            switch(s){
                case 222:
                    System.out.print("Informe o valor da peça: ");
                    n = leitor.nextInt();
                    if(n >= 500) {
                        System.out.println("Promoção: 10% de desconto");
                        System.out.println("Valor com desconto: " + (n * 0.9));
                    } else {
                        System.out.println("Valor sem desconto: " + n);
                    }
                    break;
                case 111:
                    System.out.print("Informe o valor da peça: ");
                    n = leitor.nextInt();
                    if(n > 100) {
                        System.out.println("Promoção: 40% de desconto");
                        System.out.println("Valor com desconto: " + (n * 0.6));
                    } else if(n >= 50 && n <= 100){
                        System.out.println("Promoção: 20% de desconto");
                        System.out.println("Valor com desconto: " + (n * 0.8));
                    } else if( n < 50){
                        System.out.println("Promoção: 10% de desconto");
                        System.out.println("Valor com desconto: " + (n * 0.9));
                    } else {
                        System.out.println("Valor sem desconto: " + n);
                    }
                    break;
                default:
                    System.out.println("Setor invalido.");
            }
        } while(s != 0);

        leitor.close();
    }
}