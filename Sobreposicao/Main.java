package Sobreposicao;

import Sobreposicao.Cachorro;
import Sobreposicao.Canguru;

public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Repetil r = new Repetil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c= new Canguru();
        Cachorro k = new Cachorro();

        c.locomover();
        c.usarBolsa();

        k.locomover();
        k.abanarRabo();
        k.emitirSom();

    }
}
