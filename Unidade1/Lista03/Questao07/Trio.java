package Lista03.Questao07;

public class Trio<T> {
    private T a;
    private T b;
    private T c;

    public Trio(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int quantosIguais() {
        int iguais = 0;
        if (a.equals(b)) iguais++;
        if (a.equals(c)) iguais++;
        if (b.equals(c)) iguais++;
        return iguais; 
    }

    public void imprime() {
        System.out.println("Valores: " + a + ", " + b + ", " + c);
    }
}
