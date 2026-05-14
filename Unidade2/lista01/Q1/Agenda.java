package lista01.Q1;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }

    public void adicionar(EntradaEmAgenda e) {
        lista.add(e);
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda e : lista) {
            if (e.ehNoDia(dia, mes, ano)) {
                System.out.println(e);
            }
        }
    }
}