import CaixaEletronicoController.CaixaEletronicoController;
import CaixaEletronicoModel.CaixaEletronicoModel;
import CaixaEletronicoView.CaixaEletronicoView;

public class Main {
    public static void main(String[] args) {

        CaixaEletronicoView view = new CaixaEletronicoView();
        CaixaEletronicoModel model = new CaixaEletronicoModel();
        CaixaEletronicoController controller = new CaixaEletronicoController(model, view);

        controller.iniciar();

    }
}