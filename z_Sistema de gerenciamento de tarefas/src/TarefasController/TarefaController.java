package TarefasController;

import TarefasModel.TarefaModel;
import TarefasView.TarefaView;

public class TarefaController {

    private TarefaView view;
    private TarefaModel model;

    public TarefaController(TarefaView view, TarefaModel model) {
        this.view = view;
        this.model = model;
    }

    public void menu() {
        int opcao;

        do {
            opcao = view.exibirMenu();

            switch (opcao) {
                case 1:
                    String descricao = view.capturarDescricaoTarefa();
                    model.criarTarefa(descricao);
                    view.mensagem("Tarefa Adicionada com Sucesso");
                    break;
                case 2:
                    view.exibirTarefas(model.listarTarefa());
                    break;
                case 3:
                    int indiceConcluir = view.capturarIndiceTarefa();
                    if (model.marcarTarefaConcluida(indiceConcluir)) {
                        view.mensagem("Tarefa marcada como Concluída");
                    } else {
                        view.mensagem("Indice inválido");
                    }
                    break;
                case 4:
                    int indiceRemover = view.capturarIndiceTarefa();
                    if (model.removerTarefa(indiceRemover)) {
                        view.mensagem("Tarefa Removida com sucesso !");
                    } else {
                        view.mensagem("indice inválido");
                    }
                    break;
                case 5:
                    view.mensagem("Obrigado por usar o Gerenciador de tarefas!");
                    break;
                default:
                    view.mensagem("Opção invalida. tente novamente");
            }
        } while (opcao != 5);
    }


}
