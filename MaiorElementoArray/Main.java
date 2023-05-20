package MaiorElementoArray;

import java.util.Random;
import java.util.Scanner;

/*
Encontrar o Maior Elemento:
Crie uma função que receba um array de inteiros e retorne o maior elemento presente no array.
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int[][] matriz = new int[3][3];

        int maiorelemento = Integer.MIN_VALUE;

        Random random = new Random(50);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.printf(" " + matriz[i][j]);
            }
            System.out.printf("\n ");
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] > maiorelemento) {
                    maiorelemento = matriz[i][j];
                }
            }
        }
        System.out.printf("o Maior Elemento é:  " + maiorelemento);

    }
}
