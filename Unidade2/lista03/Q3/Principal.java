package lista03.Q3;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Circulo();
        FiguraGeometrica f2 = new Quadrado();
        FiguraGeometrica f3 = new Triangulo();

        f1.descricao();
        f2.descricao();
        f3.descricao();
    }
}