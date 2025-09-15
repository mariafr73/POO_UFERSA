import java.util.Scanner;

public class Polinomio { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o grau do polinômio (n): ");
        int n = scanner.nextInt();
        
        double[] coeficientes = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }
        
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();
        
        // Exibe o polinômio formatado
        System.out.println("Polinômio: " + formatarPolinomio(coeficientes));
        
        double resultado = calcularPolinomio(n, coeficientes, x);
        System.out.println("Pn(" + x + ") = " + resultado);
        
        scanner.close();
    }
    
    public static double calcularPolinomio(int n, double[] coeficientes, double x) {
        if (n == 0) {
            return coeficientes[0];
        }
        return x * calcularPolinomio(n - 1, coeficientes, x) + coeficientes[n];
    }
    
    // Função auxiliar para formatar o polinômio
    public static String formatarPolinomio(double[] coeficientes) {
        StringBuilder polinomio = new StringBuilder();
        int n = coeficientes.length - 1;
        
        for (int i = 0; i <= n; i++) {
            if (coeficientes[i] != 0) {
                if (i > 0 && coeficientes[i] > 0) {
                    polinomio.append(" + ");
                } else if (i > 0 && coeficientes[i] < 0) {
                    polinomio.append(" - ");
                }
                
                double coeficienteAbs = Math.abs(coeficientes[i]);
                if (coeficienteAbs != 1 || i == n) {
                    polinomio.append(coeficienteAbs);
                }
                
                if (i < n) {
                    polinomio.append("x");
                    if (i < n - 1) {
                        polinomio.append("^").append(n - i);
                    }
                }
            }
        }
        
        return polinomio.toString();
    }
}