public class MegaSena {
    public static void main(String[] args) {
        int numero = 1;
        for (int l = 1; l <= 6; l++) {
            for (int c = 1; c <= 10; c++) {
                System.out.printf("%02d ", numero);
                numero++;
            }
            System.out.println();
        }
    }
}