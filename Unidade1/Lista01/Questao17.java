public class Questao17 {
    public static void main(String[] args) {
        double cidadeA = 7000;
        double cidadeB = 20000;
        int anos = 0;

        while (cidadeA < cidadeB) {
            cidadeA *= 1.035;
            cidadeB *= 1.01;
            anos++;
        }

        System.out.println("Cidade A ultrapassa ou iguala a cidade B em " + anos + " anos.");
    }
}