package Lista03.Questao01;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 8);
    
        System.out.println(elevador);
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.sair();
        elevador.subir();
        elevador.subir();
        elevador.descer();
        System.out.println(elevador);
    }
}