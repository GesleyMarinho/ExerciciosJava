package Beecrowd.EX18;

/*
* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

    Exemplo de Entrada
7
-5
6
-3.4
4.6
12
	Exemplo de Saída
4 valores positivos
7.4
*
* */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        Double[] listNumber = new Double[6];
        double media = 0;
        int count = 0;

        for (int i = 0; i < listNumber.length; i++) {
            double x;
            x = ler.nextDouble();
            listNumber[i] = x;

        }

        for (int i = 0; i < listNumber.length; i++) {

            if (listNumber[i] > 0) {
                media = media + listNumber[i];
                count++;
            }

        }

        media = media / count;
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
