package Q02;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura fatura01 = new Fatura("001", "Produto A", 2, 50.0);
        Fatura fatura02 = new Fatura("002", "Produto B", -3, 20.0);
        Fatura fatura03 = new Fatura("003", "Produto C", 5, -30.0);

        fatura01.mostrar();
        fatura02.mostrar();
        fatura03.mostrar();
    }
}