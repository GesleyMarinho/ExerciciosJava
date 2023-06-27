package NumerosPrimos;

import java.util.Scanner;

//Faça um programa que leia uma sequência de números inteiros positivos e determine quantos números da sequência são primos.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Numero numero = new Numero();

        System.out.printf("Digite um valor para saber seus primos: ");
        numero.setNum(ler.nextInt());

        numero.calculeNumerosPrimos(numero.getNum());
        System.out.printf("\n");
        boolean primo = numero.Eprimo(numero.getNum());
        System.out.printf("\nO Número "+ numero.getNum() + " é primo ? "+ primo);


    }
}
