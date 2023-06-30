package CalculadoraIMC;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);

        Dados dados = new Dados();

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.printf("Digite sua altura: ");
        dados.setAltura(ler.nextDouble());

        System.out.printf("Digite seu Peso: ");
        dados.setPeso(ler.nextDouble());

        dados.setMedia(dados.calculoImc(dados.getAltura(), dados.getPeso()));
        System.out.printf(" Media foi de: " + decimalFormat.format(dados.getMedia()));
        System.out.printf("\n");

        dados.infoIMC(dados.getMedia());

    }
}
