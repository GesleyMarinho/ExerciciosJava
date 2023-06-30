package CalculadoraIMC;

public class Dados {

    double altura;

    double peso;

    double media;

    public Dados() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double calculoImc(double altura, double peso) {
        double result;

        result = peso / (altura * altura ) ;

        return result;
    }


    public void infoIMC(double media) {

        if (media <= 18.5) {
            System.out.printf("Magreza!");
        } else if (media > 18.5 && media <= 24.9) {
            System.out.printf(" Normal !");
        } else if (media > 25 && media <= 29.9) {
            System.out.printf("Sobre Peso !");
        } else if (media > 30 && media <= 39.9) {
            System.out.printf("Obesidade !");
        } else {
            System.out.printf("Obesidade Grave !!");
        }

    }
}
