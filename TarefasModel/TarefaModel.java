package TarefasModel;

import java.util.ArrayList;
import java.util.List;

public class TarefaModel {
    private List<Tarefa> tarefas;

    public TarefaModel() {
        tarefas = new ArrayList<>();
    }

    //Criar tarefa
    public void criarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));

    }

    // Listar todas as tarefas;
    public List<Tarefa> listarTarefa() {
        return tarefas;
    }

    // Remover Tarefa
    public boolean removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            return true;
        }
        return false;
    }

    // Marca uma tarefa como concluída
    public boolean marcarTarefaConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).setConcluido(true);
            return true;
        }
        return false; // Índice inválido
    }
}
