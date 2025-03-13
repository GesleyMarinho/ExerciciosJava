package z_Estacionamento.src;



import EstacionamentoView.EstacionamentoView;
import z_Estacionamento.src.EstacionamentoController.EstacionamentoController;
import z_Estacionamento.src.EstacionamentoModel.EstacionamentoModel;

public class MainEstacionamento {
    public static void main(String[] args) {


        EstacionamentoModel estacionamentoModel = new EstacionamentoModel();
        EstacionamentoView estacionamentoView = new EstacionamentoView();
        EstacionamentoController estacionamentoController = new EstacionamentoController(estacionamentoView, estacionamentoModel);

        estacionamentoController.iniciar();

    }
}