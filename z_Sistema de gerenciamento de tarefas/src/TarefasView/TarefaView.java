package TarefasView;

import TarefasModel.Tarefa;

import java.util.List;
import java.util.Scanner;

public class TarefaView {

    private Scanner scanner;

    public TarefaView() {
        scanner = new Scanner(System.in);
    }

    // Exibe o menu e retorna a opção escolhida
    public int exibirMenu() {
        System.out.println("\n--- Gerenciador de Tarefas ---");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Marcar Tarefa como Concluída");
        System.out.println("4. Remover Tarefa");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    // Captura a descrição de uma nova tarefa
    public String capturarDescricaoTarefa() {
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite a descrição da tarefa: ");
        return scanner.nextLine();
    }

    public int capturarIndiceTarefa() {
        System.out.print("Digite o Indice: ");
        return scanner.nextInt();
    }

    public void exibirTarefas(List<Tarefa> tarefas) {
        System.out.println("\n--- Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.printf("%d - %s | Status: %s%n",
                    i,
                    tarefa.getDescricao(),
                    tarefa.isConcluido() ? "Concluída" : "Pendente");
        }
    }

    public void mensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
