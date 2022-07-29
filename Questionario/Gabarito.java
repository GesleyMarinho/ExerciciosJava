package Questionario;

import java.util.Arrays;
import java.util.List;

public class Gabarito {

    List<Character> gabarito = Arrays.asList('A','B');

    public char respostaQuestao(int numeroQuestao) {
        char resposta;
        resposta = gabarito.get(numeroQuestao-1);
        return resposta;
    }

}
