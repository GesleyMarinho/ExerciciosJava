package JogodeCartas_Blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cartas cartas = new Cartas();
        List<Cartas> cartasList = new ArrayList<>();
        List<Cartas> maoJogadorList = new ArrayList<>();
        List<Cartas> maoDealerList = new ArrayList<>();


        String nomes[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String naipes[] = {"Copas", "Espadas", "Paus", "Ouros"};
        String baralho[] = new String[52];
        int cont = 0;
        boolean vendedor = false;


        cartas.criarBaralho(nomes, naipes, baralho, cont); // Criar o Baralho
        cartas.embaralharBaralho(baralho);// Embaralhar o baralho

        System.out.printf("\nVamos Jogar 21 ");

        cartas.distribuirCartas(baralho, maoJogadorList);
        cartas.distribuirCartas(baralho,maoDealerList);

        System.out.printf("\nMinha mão ");
        cartas.listarMaoJogador(maoJogadorList);
        System.out.printf("\nMão Dealer ");
        cartas.listarMaoJogador(maoDealerList);




        int pontosJogador = cartas.calcularPontos(maoJogadorList);
        System.out.printf("\nTotal de pontos do Jogador é: " + pontosJogador);

        int pontosDealer = cartas.calcularPontos(maoDealerList);
        System.out.printf("\nTotal de pontos do Dealer é: " + pontosDealer);

        cartas.validarResultado(baralho,maoJogadorList,maoDealerList ,pontosJogador, pontosDealer );

    }
}
