package For_repeticao.ex06;

import java.util.Scanner;

/*
Números primos: Escreva um programa que imprima os números primos de 1 a 100.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //int inicio = ler.nextInt();
        //int fim = ler.nextInt();

        int inicio = 1;
        int fim = 10;

        int primo = 0;
        if (inicio > fim) {
            System.out.println(" o valor de inicio não pode ser maior que o final ");
        } else {
            System.out.println("os numeoros primos de " + inicio + " até " + fim);
            for (int i = 2; i <= fim; i++) {
                boolean ehPrimo = true;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    System.out.println(i);
                }

            }


        }
    }
}
