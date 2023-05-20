package JogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

/*
Jogo de Adivinhação:
Crie um jogo em que o programa gera um número aleatório entre 1 e 100, e o jogador tenta adivinhar o número.
 O programa deve fornecer dicas ao jogador, informando se o número é maior ou menor do que o valor inserido.
 O jogo deve continuar até que o jogador adivinhe corretamente.
*/

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Random random = new Random();
        String continuar = "S";

        //double numero = random.nextInt(100);
        int numero = 40;

        System.out.printf("\n Teste número aleatório " + numero);
        System.out.printf("\n Jogo Adivinhação");

        do {

            System.out.printf("\nDigite um valor e veja se vc vai acertar: ");
            int valor = ler.nextInt();

            if (valor == numero) {
                System.out.printf("Parabéns vc acertou o nùmero !!!");


            } else if (valor > numero) {
                System.out.printf("O valor digitado foi maior que o número sorteado ");

                double porcentagem = ((double) (valor * numero) / 100);
                System.out.printf("\nVocê está %.2f%% ACIMA do número sorteado.", porcentagem);


            } else if (valor < numero) {
                System.out.printf("O valor Digitado foi menor que o número randomizado");

                double porcentagem = ((double) (numero - valor) / numero) * 100;
                System.out.printf("\nVocê está %.2f%% ABAIXO do número sorteado.", porcentagem);
            }

            System.out.printf("\nDeseja Continuar S/N: ");
            continuar = ler.next();
        } while (continuar.equalsIgnoreCase("S"));
    }
}
