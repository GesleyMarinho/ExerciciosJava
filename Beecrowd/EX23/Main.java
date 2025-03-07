package Beecrowd.EX23;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 * <p>
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 * <p>
 * Saída
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores
 * ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        int y = ler.nextInt();
        int soma = 0;


        for (int i = y + 1; i < x; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

    }
}
