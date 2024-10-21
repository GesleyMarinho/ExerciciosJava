package LogicaProgramacao.Chat.ex10;

import java.util.Scanner;
/*
* 10. Fibonacci
Descrição: Dado um número n, imprima os primeiros n números da sequência de Fibonacci.

Entrada:

Um número inteiro n.
Saída:

Os primeiros n números da sequência de Fibonacci.

Entrada:
6

Saída:
0 1 1 2 3 5
* */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print(fibo(i)+ " " );
        }

    }

    static int fibo(int n) {
        int f = 0;
        int ant = 0;

        for (int i = 0; i <= n; i++) {
            if (i == 1) {
                f = 1;
                ant = 0;
            } else {
                f += ant;
                ant = f - ant;
            }
        }
        return f;
    }


}


