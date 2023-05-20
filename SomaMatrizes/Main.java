package SomaMatrizes;

import java.util.Random;
import java.util.Scanner;

/*
Soma de Matrizes:
Escreva um programa que realize a soma de duas matrizes de mesma dimensão. As matrizes podem ser pré-definidas ou digitadas pelo usuário.
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        Random random = new Random(50);


        int[][] matrizX = new int[5][5];


        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {

                matrizX[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA.length; j++) {

                System.out.printf(matrizX[i][j] + " ");
            }
            System.out.printf("\n ");
        }
    }


}
