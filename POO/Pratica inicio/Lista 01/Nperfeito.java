public class Nperfeito {
    public static void main(String[] args) {
        int num = 2;
        int encontrado = 0;

        while(encontrado < 4){
            int soma = 0;
        
            for(int i = 1; i <= num / 2; i++) {
                if(num % i == 0 ){
                    soma += i;
                }
            }
            
            if(soma == num){
                System.out.println(num + " é um número perfeito.");
                encontrado++;
            }
             num++;
        }
    }
}