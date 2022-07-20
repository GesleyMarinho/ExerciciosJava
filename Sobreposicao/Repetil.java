package Sobreposicao;


public class Repetil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public Repetil() {
        super();
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Repetil");
    }
}


