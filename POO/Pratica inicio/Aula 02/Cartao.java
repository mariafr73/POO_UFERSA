import java.util.Scanner;
import java.util.Calendar;

public class Cartao{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome, numero, codigo;
        int mes, ano, mesAtual, anoAtual;
        Calendar c = Calendar.getInstance();
        boolean invalido = false;

        mesAtual = c.get(Calendar.MONTH) + 1;
        anoAtual = c.get(Calendar.YEAR);

        System.out.println("Hoje: "+ mesAtual + " / " + anoAtual);

        do{
            System.out.print("Nome: ");
            nome = leitor.nextLine();

            System.out.print("Número do cartão: ");
            numero = leitor.nextLine();

            System.out.print("Código de segurança: ");
            codigo = leitor.nextLine();

            System.out.print("Mês de validade: ");
            mes = leitor.nextInt();

            System.out.print("Ano de validade: ");
            ano = leitor.nextInt();

            invalido = ((mes<mesAtual) || (ano==anoAtual && mes<mesAtual));
            
            if(invalido) System.out.println("Cartão vencido. Insira dados novamente.");
            leitor.nextLine(); //limpar o buffer

        } while (invalido);

        System.out.println("Cartão Validado!");

        leitor.close();
    }
}