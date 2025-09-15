package Q01;

public class DemoCampeonato {
    public static void main(String[] args) {
        Campeonato c1 = new Campeonato(8, "Branca", 60.0);
        Campeonato c2 = new Campeonato(16, "Azul", 80.0);
        
        c1.inscricao();
        c2.inscricao();
    }
}