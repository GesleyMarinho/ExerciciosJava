package z_Hotel.HotelModel;

public class Quarto {
    private int numero;
    private int capacidade;
    private boolean disponivel;

    public Quarto(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void ocupar() {
        this.disponivel = false;
    }

    public void liberar() {
        this.disponivel = true;
    }
}
