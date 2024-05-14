package For_repeticao.ex01;

import java.util.Scanner;

/*
Contagem regressiva: Escreva um programa que imprima uma contagem regressiva de 10 até 1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int x = ler.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print(i);
        }
        System.out.print("------------");

        for (int i = x; i >= 1; i--) {
            System.out.print(i);
        }
    }
}
