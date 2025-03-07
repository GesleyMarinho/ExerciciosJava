import EstacionamentoController.EstacionamentoController;
import EstacionamentoModel.EstacionamentoModel;
import EstacionamentoView.EstacionamentoView;

public class MainEstacionamento {
    public static void main(String[] args) {


        EstacionamentoModel estacionamentoModel = new EstacionamentoModel();
        EstacionamentoView estacionamentoView = new EstacionamentoView();
        EstacionamentoController estacionamentoController = new EstacionamentoController(estacionamentoView, estacionamentoModel);

        estacionamentoController.iniciar();

    }
}