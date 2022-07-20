package Sobrecarga;

public class Main13 {
    public static void main(String[] args) {

        Lobo l = new Lobo();
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();


        /*m.emitirSom();
        l.setCorPelo("Amarelo");
        l.emitirSom();*/
        c.reagir(false);
        c.reagir("comida");
        c.reagir(11, 45);
        c.reagir(4,15);



    }
}
