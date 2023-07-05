package JogodeCartas_Blackjack;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cartas {

    String cartas;
    String naipes;

    public Cartas() {
    }

    public String getCartas() {
        return cartas;
    }

    public void setCartas(String cartas) {
        this.cartas = cartas;
    }

    public String getNaipes() {
        return naipes;
    }

    public void setNaipes(String naipes) {
        this.naipes = naipes;
    }

    public void criarBaralho(String[] nomes, String[] naipes, String[] baralho, int cont) {

        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < naipes.length; j++) {
                baralho[cont] = nomes[i] + " " + naipes[j];
                cont++;
            }
        }
    }

    public void listarBaralho(String[] baralho) {
        for (int i = 0; i < baralho.length; i++) {
            System.out.printf("\n Carta: " + baralho[i]);
        }
    }

    public void embaralharBaralho(String[] baralho) {
        Random random = new Random();
        for (int i = 0; i < baralho.length; i++) {

            int randomIndex = random.nextInt(baralho.length);
            String temp = baralho[i];
            baralho[i] = baralho[randomIndex];
            //baralho[randomIndex] = temp;
        }

    }


    public void distribuirCartas(String[] baralho, List<Cartas> maoJogadorList) {
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(baralho.length);
            String carta = baralho[randomIndex];
            String[] cartaSplit = carta.split(" ");
            Cartas cartaDistribuida = new Cartas();

            cartaDistribuida.setCartas(cartaSplit[0]);
            cartaDistribuida.setNaipes(cartaSplit[1]);
            maoJogadorList.add(cartaDistribuida);

            retirarDoBaralho(baralho, cartaDistribuida);
        }
    }

    public void retirarDoBaralho(String[] baralho, Cartas cartaJogador) {
        String valorCartaJogador = cartaJogador.getCartas();
        String naipeJogador = cartaJogador.getNaipes();

        for (int i = 0; i < baralho.length; i++) {
            String cartaBaralho = baralho[i];
            if (cartaBaralho != null) {
                String[] partesCartaBaralho = cartaBaralho.split(" ");
                String valorCartaBaralho = partesCartaBaralho[0];
                String naipeCartaBaralho = partesCartaBaralho[1];

                if (valorCartaBaralho.equals(valorCartaJogador) && naipeCartaBaralho.equals(naipeJogador)) {
                    // Remova a carta do baralho
                    baralho[i] = null;
                    break; // Saia do loop, já que a carta foi encontrada
                }
            }
        }
    }

    public void pedirUmaCarta(String[] baralho, List<Cartas> maoJogadorList) {
        Random random = new Random();
        boolean cartaValida = false;


        for (int i = 0; i < 1; i++) {

            int randomIndex = random.nextInt(baralho.length);
            String carta = baralho[randomIndex];

            if (carta != null) {
                String[] cartaSplit = carta.split(" ");
                Cartas cartaDistribuida = new Cartas();

                cartaDistribuida.setCartas(cartaSplit[0]);
                cartaDistribuida.setNaipes(cartaSplit[1]);
                maoJogadorList.add(cartaDistribuida);

                retirarDoBaralho(baralho, cartaDistribuida);
            }

        }
    }

    public int calcularPontos(List<Cartas> somaList) {
        int soma = 0;


        for (Cartas carta : somaList) {
            String valorCarta = carta.getCartas();

            if (valorCarta.equalsIgnoreCase("As")) {
                soma += 11;

            } else if (valorCarta.equalsIgnoreCase("Dama") || valorCarta.equalsIgnoreCase("Valete") || valorCarta.equalsIgnoreCase("Rei")) {
                soma += 10;

            } else {
                try {
                    int valorNumerico = Integer.parseInt(valorCarta);
                    soma += valorNumerico;
                } catch (NumberFormatException e) {
                    System.out.printf("\nValor Inválido para a carta " + valorCarta);
                }
            }
        }

        return soma;
    }


    public void listarMaoJogador(List<Cartas> maoJogadorList) {

        for (int i = 0; i < maoJogadorList.size(); i++) {
            System.out.printf("\nAs Carta são:  " + maoJogadorList.get(i).cartas + " " + maoJogadorList.get(i).naipes);
        }
    }

    public void validarResultado(String[] baralho, List<Cartas> maoJogadorList, List<Cartas> maoDealerList, int pontosDealer, int pontosJogador) {
        Scanner ler = new Scanner(System.in);

        Cartas cartas = new Cartas();

        boolean jogoEncerrado = false;

        while (!jogoEncerrado) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Pedir uma Carta");
            System.out.println("2. Parar");

            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:

                    cartas.pedirUmaCarta(baralho, maoJogadorList);
                    pontosJogador = cartas.calcularPontos(maoJogadorList);
                    System.out.println("Mão do Jogador Atual: ");
                    cartas.listarMaoJogador(maoJogadorList);
                    System.out.printf("\nPontos Jogador " + pontosJogador);
                    System.out.printf("\n--------------------------\n");
                    cartas.pedirUmaCarta(baralho, maoDealerList);
                    pontosDealer = cartas.calcularPontos(maoDealerList);
                    System.out.printf("Mão do Dealer Atual ");
                    cartas.listarMaoJogador(maoDealerList);
                    System.out.printf("\nPontos Dealer " + pontosDealer);

                    if (pontosJogador == 21) {
                        System.out.printf("Jogador Ganhou ");
                    } else if (pontosDealer == 21) {
                        System.out.printf("Dealer Ganhou !!");
                    } else if (pontosJogador == 21 && pontosDealer == 21) {
                        System.out.printf("Empate!!! ");
                    } else {

                        if (pontosJogador < pontosDealer) {
                            System.out.printf("\nVocê Ganhou !!!");
                            break;

                        } else if (pontosJogador > pontosDealer) {
                            System.out.printf("\nVocê Perdeu !!! ");
                            break;
                        } else {
                            System.out.printf("\nEmpate !!!");
                        }
                    }
                    break;
                case 2:
                    jogoEncerrado = true;
                    break;
                default:
                    System.out.println("Opção Inválida.");

            }
        }

    }

}