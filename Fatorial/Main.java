package Fatorial;

import java.util.Scanner;

/*
Fatorial:
Implemente uma função que calcule o fatorial de um número inteiro.
O fatorial de um número é o produto de todos os números inteiros positivos menores ou iguais a ele.
*/
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero ;
        int x =0; // Variavel para receber  a multiplicação, do fatorial vezes a repetição do (i) no for;

        System.out.printf("Digite um número para ser fatorial: ");
        numero = ler.nextInt();

        for (int i = 1; i <= numero; i++) {
          x = numero * i;
            System.out.printf("\nO fatorial de: " + numero +"*" + i + "=" + x);
        }

    }
}
