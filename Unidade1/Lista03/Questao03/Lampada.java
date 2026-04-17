package Lista03.Questao03;

public class Lampada {
    private boolean estadoDaLampada; // true = ligada, false = desligada
    private Contador contador;

    public Lampada() {
        this.estadoDaLampada = false;
        this.contador = new Contador();
    }

    public void acende() {
        if (!estadoDaLampada) {
            estadoDaLampada = true;
            contador.incrementar();
        }
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public int getNumeroDeVezesAcesa() {
        return contador.getValor();
    }
}
