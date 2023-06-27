package JogoDaVelha;

import java.util.Random;
import java.util.Scanner;
/*
Jogo da Velha:
Crie um programa que permita que dois jogadores joguem o famoso jogo da velha. O programa deve exibir o tabuleiro e solicitar
aos jogadores que façam suas jogadas alternadamente. O programa deve verificar se houve um vencedor ou se houve um empate e exibir o resultado final.
Você pode implementar as seguintes funcionalidades:

Exibir o tabuleiro: O programa deve exibir o tabuleiro do jogo da velha com as posições numeradas.
Fazer uma jogada: O programa deve solicitar ao jogador que faça sua jogada, informando a posição desejada no tabuleiro.
Verificar o resultado: O programa deve verificar se houve um vencedor ou um empate após cada jogada.
Você pode usar uma matriz para representar o tabuleiro e implementar as funcionalidades usando classes, métodos e estruturas de controle de fluxo.

Exemplo de interação do programa:
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        Jogador jogador = new Jogador();
        Velha velha = new Velha();

        while (true) {
            int valor = 1;

            String[][] matriz = new String[3][3];

            String nome1 = "Gesley";
            String nome2 = "Dumar";

            jogador.setJogador1(nome1);
            System.out.printf("\nQual o nome do Primeiro jogador: " + jogador.getJogador1());
            //jogador.setJogador1(ler.next());

            jogador.setValor1((int) (Math.random() * 10));

            System.out.printf("\nNúmero gerado para o jogador 1: " + jogador.getValor1());

            jogador.setJogador2(nome2);
            System.out.printf("\nQual o nome do Segundo Jogador: " + jogador.getJogador2());
            //jogador.setJogador1(ler.next());

            jogador.setValor2((int) (Math.random() * 10));
            System.out.printf("\nNúmero gerado para o jogador 2: " + jogador.getValor2());

            int jogadorVencedor = velha.primieroJogador(jogador.getValor1(), jogador.getValor2());

            String simbolo1 = "X";
            String simbolo2 = "O";
            if (jogadorVencedor == 1) {
                System.out.printf("\nJogador 1 Ganhou e irá começar !");
            }
            if (jogadorVencedor == 2) {
                System.out.printf("\nJogador  2 Ganhou e irá começar !");

            } else {
                System.out.printf("\nEmpate !");
                matriz = new String[3][3];
                continue;
            }

            velha.tabuleiro(matriz);

            boolean jogoEmAndamento = true;
            int numeroJogador = jogadorVencedor;


            while (true) {

                System.out.printf("\nJogador " + numeroJogador);
                System.out.printf("\nFaça sua jogada (1-9) : ");
                int jogada = ler.nextInt();


                if (!velha.fazerJogada(matriz, jogada, simbolo1, simbolo2, numeroJogador)) {
                    System.out.printf("Jogada Inválida. Tente Novamente ");
                } else {
                    numeroJogador = (numeroJogador == 1) ? 2 : 1;
                }


                velha.mostrarTabuleiro(matriz);
                int resultado = velha.verificarGanhador(matriz);

                if (resultado == 1) {
                    System.out.println("\nJogador 1 venceu!");
                    jogoEmAndamento = false;
                    break;
                } else if (resultado == 2) {
                    System.out.println("\nJogador 2 venceu!");
                    jogoEmAndamento = false;
                    break;
                } else if (resultado == 3) {
                    System.out.println("\nEmpate! O jogo terminou sem vencedor.");
                    jogoEmAndamento = false;
                    break;
                }
            }

        }
    }
}
