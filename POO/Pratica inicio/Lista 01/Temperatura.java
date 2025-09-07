import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        double c;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\nInforme a temperatura em Celsius: ");
        c = leitor.nextDouble();

        double f = (c * 9/5) + 32;

        System.out.println("A temperatura em " + c +" °C em Fahrenheit é: " + f +" °F");
        
        leitor.close();
    } 
}