package z_SistemaDeFilas;

import z_SistemaDeFilas.FilaController.FilaController;
import z_SistemaDeFilas.FilaModel.FilaModel;
import z_SistemaDeFilas.FilaView.FilaView;

public class MainFila {
    public static void main(String[] args) {
        FilaView filaView = new FilaView();
        FilaModel filaModel = new FilaModel(filaView);
        FilaController filaController = new FilaController(filaModel, filaView);

        filaController.inciar();
    }
}
