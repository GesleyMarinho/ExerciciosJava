import Controller.JogoDaVelhaController;
import Model.JogoDaVelhaModel;
import View.JogoDaVelhaView;

public class MainJogoDaVelha {
    public static void main(String[] args) {
        JogoDaVelhaModel model = new JogoDaVelhaModel();
        JogoDaVelhaView view = new JogoDaVelhaView();
        JogoDaVelhaController controller = new JogoDaVelhaController(model, view);

        controller.iniciarJogo();
    }
}