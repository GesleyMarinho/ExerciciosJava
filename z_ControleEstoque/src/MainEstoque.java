package z_ControleEstoque.src;

import ControleEstoqueController.ControleEstoqueController;
import ControleEstoqueModel.ControleEstoqueModel;
import ControleEstoqueView.ControleEstoqueView;

public class MainEstoque {
    public static void main(String[] args) {


        ControleEstoqueModel model = new ControleEstoqueModel();
        ControleEstoqueView view = new ControleEstoqueView();
        ControleEstoqueController controller = new ControleEstoqueController(model, view);

        controller.iniciar();
    }
}