public class Cidade {
    public static void main(String[] args){
        double A = 7000, B = 20000;
        int anos = 0;
        while (A < B){
            A += A * 0.035;
            B += B * 0.01;
            anos++;
        }
        System.out.println("Quantidade de anos: " + anos);
    }
}
