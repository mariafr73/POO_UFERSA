package lista02.Q2;

public class EventoDelegacao {
    private String evento;
    private DataHora dataHora;

    public EventoDelegacao(String evento, DataHora dataHora) {
        this.evento = evento;
        this.dataHora = dataHora;
    }

    public String toString() {
        return "Evento: " + evento + " | Data/Hora: " + dataHora;
    }
}