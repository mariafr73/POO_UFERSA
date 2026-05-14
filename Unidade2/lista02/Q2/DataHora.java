package lista02.Q2;

public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano + " às " + hora + ":" + minuto;
    }
}