package Lista03.Questao01;

public class Elevador{
    private int capacidade;
    private int andarAtual;
    private int totalAndares;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entrar(){
        if(pessoasPresentes < capacidade){
            pessoasPresentes++;
        }
    }

    public void sair(){
        if(pessoasPresentes > 0){
            pessoasPresentes--;
        }
    }

    public void subir(){
        if(andarAtual < totalAndares){
            andarAtual++;
        }
    }

    public void descer(){
        if(andarAtual > 0){
            andarAtual--;
        }
    }

    public String toString(){
        return "\nCapacidade = " + capacidade + "\nAndarAtual = " + andarAtual + "\nTotal de Andares = " + totalAndares + "\nPessoas Presentes = " + pessoasPresentes;
    }
}