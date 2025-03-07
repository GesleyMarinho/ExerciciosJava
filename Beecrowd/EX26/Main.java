package Beecrowd.EX26;
/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido,
mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE).
 No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL),
 pois por definição zero é par, o seu programa deverá imprimir apenas NULL.

        Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, conforme o exemplo abaixo.
Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt(); // Quantidade de valores

        for (int i = 0; i < x; i++) {
            int num = ler.nextInt(); // Lê o número

            if (num == 0) {
                System.out.println("NULL"); // Se for zero
            } else {
                // Verifica se o número é par ou ímpar
                if (num % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }

                // Verifica se o número é positivo ou negativo
                if (num > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
    }
}