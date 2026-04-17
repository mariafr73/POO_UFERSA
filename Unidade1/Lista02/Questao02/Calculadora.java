public class Calculadora{
    public static void main(String[] args) {
        Fatura fatura = new Fatura(1, "Caneta", 10, 2.5);
        double total = fatura.CalculaTotal();

        System.out.println(fatura);
        System.out.println("Total da fatura: " + total);
        
    }
}