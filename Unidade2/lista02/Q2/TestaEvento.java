package lista02.Q2;

public class TestaEvento {
    public static void main(String[] args) {

        DataHora dataHora = new DataHora(20, 11, 2026, 19, 30);

        EventoDelegacao evento1 = new EventoDelegacao("Aniversário", dataHora);

        EventoHeranca evento2 = new EventoHeranca("Prova de POO", 15, 6, 2026, 8, 0);

        System.out.println("Evento com delegação:");
        System.out.println(evento1);

        System.out.println("\nEvento com herança:");
        System.out.println(evento2);
    }
}