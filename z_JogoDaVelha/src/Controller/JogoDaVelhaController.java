package Controller;

import Model.JogoDaVelhaModel;
import View.JogoDaVelhaView;

/*Responsavel por ligar a model e a view */
public class JogoDaVelhaController {
    private JogoDaVelhaView view;
    private JogoDaVelhaModel model;

    public JogoDaVelhaController(JogoDaVelhaModel model, JogoDaVelhaView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciarJogo() {
        while (true) {
            view.exibirTabuleiro(model.getTabuleiro());
            int[] jogada = view.capturarJogada();
            if (model.fazerJogada(jogada[0], jogada[1])) {
                char vencedor = model.verificadorVencedor();
                if (vencedor != ' ') {
                    view.exibirTabuleiro(model.getTabuleiro());
                    view.exibirMensagem("Jogador " + vencedor + " Venceu!");
                    break;
                }

                if (model.verificarEmpate()) {
                    view.exibirTabuleiro(model.getTabuleiro());
                    view.exibirMensagem("Empate!");
                    break;
                }
            }
            else {
                view.exibirMensagem("Jogada Inválida. Tente Novamente");
            }

        }
    }
}
