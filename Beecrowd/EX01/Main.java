package Beecrowd.EX01;

import java.util.Scanner;

/*
* Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
*  Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ".
*  Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
* Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
* Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
*  Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média
* (some a pontuação do exame com a média anteriormente calculada e divida por 2).
*  e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
*  Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final:
* " seguido da média final para esse aluno.
* */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double a, b, c, d, mediaFinal;

        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        d = ler.nextDouble();

        // Cálculo da média com arredondamento explícito
        double media = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10.0;
        media = Math.floor(media * 10) / 10.0; // Arredonda para baixo até 1 casa decimal
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double notaExame = ler.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            mediaFinal = (media + notaExame) / 2;
            mediaFinal = Math.floor(mediaFinal * 10) / 10.0; // Arredonda para baixo até 1 casa decimal

            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        ler.close();
    }
}

