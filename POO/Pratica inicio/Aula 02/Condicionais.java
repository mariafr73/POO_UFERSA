import java.util.Scanner;

public class Condicionais{
    public static void main(String[] args) {
        int d, m, a, qtdDeDias = 0;
        String data = "";
        Scanner leitor = new Scanner(System.in);

        System.out.print("Dia: ");
        d = leitor.nextInt();

        System.out.print("Mes: ");
        m = leitor.nextInt();

        System.out.print("Ano: ");
        a = leitor.nextInt();

        data += d + " de ";
        
        if(m == 1){
            data += "Janeiro";
        } else if (m == 2){
            data += "Fevereiro";
        }  else if (m == 3){
            data += "Março";
        } else if (m == 4){
            data += "Abril";
        } else if (m == 5){
            data += "Maio";
        } else if (m == 6){
            data += "Junho";
        } else if (m == 7){
            data += "Julho";
        } else if (m == 8){
            data += "Agosto";
        } else if (m == 9){
            data += "Setembro";
        } else if (m == 10){
            data += "Outubro";
        } else if (m == 11){
            data += "Novembro";
        } else if (m == 12){
            data += "Dezembro";
        }

        data += " de " + a;

        System.out.println("Data: "+ data);

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                qtdDeDias = 31;
                break;
            case 2:
                qtdDeDias = 28;
                break;  
            default:
                qtdDeDias = 30;
                break;
        }

        System.out.println("O mes da data inseriada possui "+qtdDeDias+" dias");

        leitor.close();
    }
}

/*
estrutura do if-else
if (true){
            
    } else if (true) {
            
    } else {

    }
}

switch(numero){
    case valor1:
    //comando
    break;
    case valor2:
    //comando
    break;
    ...
    default:
    //comando
    break;
}

*/