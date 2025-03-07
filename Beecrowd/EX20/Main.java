package Beecrowd.EX20;

import java.util.Scanner;

/*
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.

Exemplo de Entrada
-5
0
-3
-4
12
Exemplo de Saída

3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
 */


public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int[] list = new int[5];
        int countPares = 0, countImpares = 0, counPositivos = 0, countnegativos = 0;
        for (int i = 0; i < list.length; i++) {
            int x;
            x = ler.nextInt();
            list[i] = x;

            if (list[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }

            if (list[i] > 0) {
                counPositivos++;
            } else if (list[i] < 0) {
                countnegativos++;
            }
        }

        System.out.println(countPares + " valor(es) par(es)");
        System.out.println(countImpares + " valor(es) impar(es)");
        System.out.println(counPositivos + " valor(es) positivo(s)");
        System.out.println(countnegativos + " valor(es) negativo(s)");
    }
}
