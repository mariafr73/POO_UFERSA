package Lista03.Questao03;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.mostraEstado();
        lampada.acende();
        lampada.mostraEstado();
        lampada.apaga();
        lampada.mostraEstado();
        lampada.acende();
        lampada.mostraEstado();

        System.out.println("A lâmpada foi acesa " + lampada.getNumeroDeVezesAcesa() + " vezes.");
    }
}
