package TabelaCampeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Tabela {

    int golCasa;
    int golFora;
    //Tabela tabela = new Tabela();

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolFora() {
        return golFora;
    }

    public void setGolFora(int golFora) {
        this.golFora = golFora;
    }

    public void gerarTabelaCampeonato(List<Time> nomeTimeList) {
        Random placar1 = new Random();
        Random placar2 = new Random();
        int numEquipes = nomeTimeList.size();

        for (int i = 1; i < numEquipes; i++) {
            System.out.println("Rodada " + i);

            for (int j = 0; j < numEquipes; j++) {
                setGolCasa(placar1.nextInt(10));
                setGolCasa(placar2.nextInt(10));

                int casa = j;
                int fora = numEquipes - 1 - j;

                System.out.println(nomeTimeList.get(casa).getNomeTime() + " ( " + getGolCasa() + " ) " + "x" + " ( " + getGolFora() + " )" + nomeTimeList.get(fora).getNomeTime());
               // verificadorDeVitoria(golCasa, golFora, nomeTimeList);
            }

            // Realiza o rearranjo das equipes para a próxima rodada
            Time ultimaEquipe = nomeTimeList.remove(numEquipes - 1);
            nomeTimeList.add(1, ultimaEquipe);
        }
    }

    private void verificadorDeVitoria(int golCasa, int golFora, List<Time> nomeTimeList) {

        List<Tabela> resultados = new ArrayList<>(); // ainda vou ver acha ruma utilidade para essa lista;

        final int PONTOS_VITORIA = 3;
        final int PONTOS_EMPATE = 1;
        final int PONTOS_DERROTA = 0;

        Time timeCasa = nomeTimeList.get(0);
        Time timeFora = nomeTimeList.get(1);

        if (golCasa > golFora) {
            timeCasa.adicionarPontos(PONTOS_VITORIA);
            timeFora.adicionarPontos(PONTOS_DERROTA);
        } else if (golCasa < golFora) {
            timeCasa.adicionarPontos(PONTOS_DERROTA);
            timeFora.adicionarPontos(PONTOS_VITORIA);
        } else {
            timeCasa.adicionarPontos(PONTOS_EMPATE);
            timeFora.adicionarPontos(PONTOS_EMPATE);
        }

    }

    public void gerarDadosCampeonato() {
        // código para gerar a tabela com os dados do campeonato;

    }


}
