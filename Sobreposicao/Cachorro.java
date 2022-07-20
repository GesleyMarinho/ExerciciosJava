package Sobreposicao;

public class Cachorro extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Correndo !!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au ");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");

    }
}
