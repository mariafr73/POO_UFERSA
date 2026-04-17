public class Campeonato{
    public static void main(String[] args){
        Time time1 = new Time("Flamengo", "Rio de Janeiro", 10, 5, 2);
        Time time2 = new Time("Palmeiras", "São Paulo", 12, 3, 2);

        System.out.println(time1);
        System.out.println(time2);

        time1.vencer();
        time2.perder();

        System.out.println(time1);
        System.out.println(time2);
    }
}