package LogicaProgramacao.ChatNivel01.ex04;

import java.util.Random;
import java.util.Scanner;

/*
4. Contagem de Números Pares
Descrição: Faça um programa que leia uma sequência de 10 números e conte quantos deles são pares.

Entrada:
Dez números inteiros.

Saída:
A quantidade de números pares.

Exemplo:
Entrada:
1 2 3 4 5 6 7 8 9 10

Saída:
5
 */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        Random gerador = new Random();
        int N = ler.nextInt();
        int totalPar = 0;

        for (int i = 1; i <= N; i++) {
            int par = gerador.nextInt(100);

            System.out.println("posicão " + i + " número gerado " + par);
            if (par % 2 == 0) {
                totalPar++;
            }
        }
        System.out.println(totalPar);

    }
}
