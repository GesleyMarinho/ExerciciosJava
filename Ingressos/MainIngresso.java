package Ingressos;

import java.util.Scanner;

public class MainIngresso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Ingresso ingresso = new Ingresso();
        IngressoVip ingressovip = new IngressoVip();

        System.out.print("Qual o valor do Ingresso simples : ");
        ingresso.setIngresso(ler.nextDouble());
        ingresso.imprimirIngresso();

        System.out.print("Qual o percentual de acrescimo para o ingresso vip ? ");
        double i = ler.nextDouble();

        ingressovip.ingressoVip(ingresso.getIngresso(),i);


    }
}
