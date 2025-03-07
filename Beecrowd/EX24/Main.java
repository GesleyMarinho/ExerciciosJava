package Beecrowd.EX24;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite a quantidade de valores: ");
        int n = ler.nextInt();


        int countIn = 0;
        int countOut = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Digite um valor de X: ");
            int x = ler.nextInt();;

            if (x >= 10 && x<= 20) {
                countIn++;
            } else {
                countOut++;
            }
        }


        System.out.println(countIn + " in");
        System.out.println(countOut + " out");
    }
}
