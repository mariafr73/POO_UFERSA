package lista02.Q2;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(String evento, int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    public String toString() {
        return "Evento: " + evento + " | Data/Hora: " + super.toString();
    }
}