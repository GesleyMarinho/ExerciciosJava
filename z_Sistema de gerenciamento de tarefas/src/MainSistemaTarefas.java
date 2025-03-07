import TarefasController.TarefaController;
import TarefasModel.TarefaModel;
import TarefasView.TarefaView;

public class MainSistemaTarefas {
    public static void main(String[] args) {

        TarefaView tarefaView = new TarefaView();
        TarefaModel tarefaModel = new TarefaModel();

        TarefaController controller = new TarefaController(tarefaView, tarefaModel);
        controller.menu();
    }
}