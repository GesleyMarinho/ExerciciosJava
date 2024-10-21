package LogicaProgramacao.Chat.ex05;

import java.util.Scanner;

/*
* 5. Números em Ordem Decrescente
Descrição: Dado três números, escreva um programa que imprima esses números em ordem decrescente.

Entrada:
Três números inteiros.
*
Saída:
Os três números em ordem decrescente.

Exemplo:
Entrada:
10 5 20
Saída:
20 10 5
* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();


        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }

        }
    }
}
