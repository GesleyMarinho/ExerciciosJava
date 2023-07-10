package TabelaCampeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tabela {


    public void gerarTabelaCampeonato(List<Time> nomeTimeList) {
        Random random = new Random();
        int numEquipes = nomeTimeList.size();

        for (int i = 1; i < numEquipes; i++) {
            System.out.println("Rodada " + i);

            for (int j = 0; j < numEquipes; j++) {

                int casa = j;
                int fora = numEquipes - 1 - j;

                System.out.println(nomeTimeList.get(casa).getNomeTime() + " x " + nomeTimeList.get(fora).getNomeTime());
            }

            // Realiza o rearranjo das equipes para a próxima rodada
            Time ultimaEquipe = nomeTimeList.remove(numEquipes - 1);
            nomeTimeList.add(1, ultimaEquipe);
        }
    }


}
