public class CuboSoma{
    public static void main(String[] args){
        int centena, dezena, unidade; 
        for(int n = 100; n <= 999; n++){
            centena = n / 100;
            dezena = (n / 10) % 10;
            unidade = n % 10;

            int somaCubos = (int)(Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3));

            if(somaCubos == n){
                System.out.println(n + " = " + centena + "³ + " + dezena + "³ + " + unidade + "³");
            }
        }
    }
}