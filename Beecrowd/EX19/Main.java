package Beecrowd.EX19;

import java.util.Scanner;

/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

    Exemplo de Entrada
7
-5
6
-4
12
	Exemplo de Saída
3 valores pares
 */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double[] list = new double[5];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            double x;
            x = ler.nextDouble();
            list[i] = x;

            if (list[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count+" valores pares");

    }
}
