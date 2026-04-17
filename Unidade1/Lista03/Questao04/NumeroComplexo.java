package Lista03.Questao04;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo(double real) {
        this.real = real;
        this.imaginario = 0;
    }

    public NumeroComplexo() {
        this.real = 0;
        this.imaginario = 0;
    }

    public String toString() {
        if (imaginario >= 0) {
            return real + " + " + imaginario + "i";
        } else {
            return real + " - " + (-imaginario) + "i";
        }
    }
}
