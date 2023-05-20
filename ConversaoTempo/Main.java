package ConversaoTempo;

/*
Conversão de Tempo:
Implemente uma função que converta um valor de tempo dado em segundos para o formato "horas:minutos:segundos".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.printf("Digite a quantidade de segundos ");
        int tempo = ler.nextInt();

        int horas = tempo / 3600;
        int minutos = (tempo - (horas * 3600)) / 60;
        int segundos = tempo - (horas * 3600) - (minutos * 60);

        System.out.printf("Horas " + horas + " :" + minutos + " :" + segundos);

    }
}
