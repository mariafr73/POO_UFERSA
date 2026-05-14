package lista01.Q1;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.adicionar(new EntradaEmAgenda(8, 20, 11, 2026, "Aniversário"));
        agenda.adicionar(new EntradaEmAgenda(14, 10, 5, 2026, "Prova"));

        agenda.listaDia(20, 11, 2026);
    }
}