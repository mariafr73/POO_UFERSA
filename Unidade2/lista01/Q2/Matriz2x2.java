package lista01.Q2;

public class Matriz2x2 {
    private float[][] m;

    public Matriz2x2(float a, float b, float c, float d) {
        m = new float[2][2];
        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }

    public float determinante() {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public void imprimir() {
        System.out.println(m[0][0] + " " + m[0][1]);
        System.out.println(m[1][0] + " " + m[1][1]);
    }
}
