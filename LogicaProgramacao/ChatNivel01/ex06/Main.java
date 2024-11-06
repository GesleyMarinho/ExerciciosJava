package LogicaProgramacao.ChatNivel01.ex06;

import java.util.Scanner;

/*
* Descrição: Escreva um programa que, dado um número inteiro, imprima a tabuada desse número de 1 a 10.

Entrada:
Um número inteiro.
Saída:
A tabuada do número.
Exemplo:

Entrada:
4

Saída:
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
...
4 x 10 = 40
* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();

        if (x < 0) {
            System.out.println("Fim do programa ");
        } else {
            for (int i = 1; i <= 10; i++) {

                System.out.println(x + " x " + i + " = " + x * i);
            }
        }
    }
}
