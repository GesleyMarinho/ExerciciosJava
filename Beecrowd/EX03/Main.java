package Beecrowd.EX03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.


Exemplo de Entrada
7 21 -14

Exemplo de Saída
-14
7
21

7
21
-14
 */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int x = 0;

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            x = ler.nextInt();
            list.add(x);
            list2.add(x);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}
