import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1, y1, x2, y2, dist;
        
        System.out.print("x1: ");
        x1 = leitor.nextDouble();
        System.out.print("y1: ");
        y1 = leitor.nextDouble();
        System.out.print("x2: ");
        x2 = leitor.nextDouble();
        System.out.print("y2: ");
        y2 = leitor.nextDouble();

        dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)); //raiz((x1-x2)² + (y1-y2)²)
        System.out.printf("Distancia entre (%g, %g) e (%g, %g) eh %g%n", x1, y1, x2, y2, dist);

        leitor.close();
    }
}

/* 
&& = E
|| = OU
! = NEGAÇÂO
*/
