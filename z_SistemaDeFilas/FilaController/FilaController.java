package z_SistemaDeFilas.FilaController;

import z_SistemaDeFilas.Fila.Fila;
import z_SistemaDeFilas.FilaModel.FilaModel;
import z_SistemaDeFilas.FilaView.FilaView;

public class FilaController {

    private FilaModel model;
    private FilaView view;

    public FilaController(FilaModel model, FilaView view) {
        this.model = model;
        this.view = view;
    }

    public void inciar() {
        int op;

        do {
            op = view.Menu();
            System.out.println();
            switch (op) {
                case 1:
                    model.inserirFila();
                    break;
                case 2:
                    model.listarFilas();
                    break;
                case 3:
                    model.consultar();
                    break;
                case 4:
                    view.mensagem("Encerrando o Programa");
                    break;
                default:
                    view.mensagem("Opção inválida");
            }

        } while (op != 4);
    }
}
