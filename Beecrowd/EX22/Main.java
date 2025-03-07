package Beecrowd.EX22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha,
 * inclusive o X ser for o caso.
 * <p>
 * Entrada
 * A entrada será um valor inteiro positivo.
 * EX: 8
 * <p>
 * Saída
 * A saída será uma sequência de seis números ímpares.
 * EX: 9,11,13,15,17,19
 */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        List<Integer> impares = new ArrayList<>();

        if (x % 2 != 1) {
            x++;
        }

        for (int i = 0; i < 6; i++) {
            impares.add(x);
            x += 2;

        }

        for (int i = 0; i < impares.size(); i++) {
            System.out.println("" + impares.get(i));
        }
    }
}
