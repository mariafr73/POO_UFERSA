package Lista03.Questao04;

public class DemoNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo(2, 4);   // 2 + 4i
        NumeroComplexo n2 = new NumeroComplexo(5);      // 5 + 0i
        NumeroComplexo n3 = new NumeroComplexo();       // 0 + 0i
        NumeroComplexo n4 = new NumeroComplexo(3, -7);  // 3 - 7i

        System.out.println("Número 1: " + n1);
        System.out.println("Número 2: " + n2);
        System.out.println("Número 3: " + n3);
        System.out.println("Número 4: " + n4);
    }
}
