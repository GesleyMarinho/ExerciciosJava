package ElevadorModel;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidadeMaxima;
    private int pessoasPresentes;


    public Elevador(int andarAtual) {
        this.andarAtual = 0;
        this.totalAndares = 5;
        this.capacidadeMaxima = 10;
        this.pessoasPresentes = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
