package LogicaProgramacao.ChatNivel01.ex07;

import java.util.Scanner;

/*
* 7. Fatorial
Descrição: Dado um número inteiro positivo, calcule o fatorial desse número.

O fatorial do número.
Entrada:
5

Saída:
120
* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int aux = 1;

        for (int i = x; i > 1; i--) {
            aux *= i;

        }

        System.out.println(aux);
    }
}
