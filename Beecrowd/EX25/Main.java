package Beecrowd.EX25;
/*
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso,
 configure a precisão adequadamente para que isso não ocorra.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite um valor Inteiro: ");
        int x = ler.nextInt();

        for (int i = 1; i <= x; i++) {
            if(i%2==0){
                System.out.println(i+"^2 = " +  Math.pow(i,2));
            }
        }

    }
}
