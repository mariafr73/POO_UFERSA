
import java.text.DecimalFormat;


public class Repeticao{
    public static void main(String[] args){
        float kph = 0.0F, mps, mph, pps;
        DecimalFormat df = new DecimalFormat();
        df.applyLocalizedPattern("00.0000");

        System.out.println("K/h\tm/s\tmph\tp/s");
        while(kph <= 50.0F){
            mps = kph*0.2778F;
            mph = kph*0.6214F;
            pps = kph*0.9113F;
            System.out.println(df.format(kph) + "\t" + df.format(mps) + "\t" + df.format(mph) + "\t" + df.format(pps));
            kph+=0.5;
        }
    }
}

/*
    while(condicao){
        //instrução a ser repetida
    }

    format decimal number java
*/