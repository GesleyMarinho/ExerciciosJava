package z_SistemaDeFilas.FilaModel;

import z_SistemaDeFilas.Fila.Fila;
import z_SistemaDeFilas.FilaView.FilaView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilaModel {
    private Scanner scanner;
    private FilaView view;
    private List<Fila> filaListPrioridade;
    private List<Fila> filaListNormal;

    public FilaModel(FilaView view) {
        this.scanner = new Scanner(System.in); // Inicializa o scanner
        this.filaListPrioridade = new ArrayList<>(); // Inicializa a lista de prioridade
        this.filaListNormal = new ArrayList<>(); // Inicializa a lista normal
        this.view = view;
    }

    public void inserirFila() {


        System.out.print("Qual o nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Ele tem Prioridade: ");
        String resposta = scanner.nextLine().trim().toUpperCase();
        boolean condicao = resposta.equals("S");

        if (condicao) {
            filaListPrioridade.add(new Fila(nome, condicao));
        } else {
            filaListNormal.add(new Fila(nome, condicao));
        }


    }

    public void listarFilas() {

        System.out.println("Lista da Fila PRIORIDADE ");
        for (int i = 0; i < filaListPrioridade.size(); i++) {
            view.mensagem("Nome: " + filaListPrioridade.get(i).getNome() + " Condicao: " + filaListPrioridade.get(i).isPrioridade());
        }
        System.out.println("------------------");

        System.out.println("Lista da Fila NORMAL");
        for (int i = 0; i < filaListNormal.size(); i++) {
            view.mensagem("Nome: " + filaListNormal.get(i).getNome() + " Condicao: " + filaListNormal.get(i).isPrioridade());
        }
        System.out.println("------------------");

    }

    public void consultar() {
        if (!filaListPrioridade.isEmpty()) {

            view.mensagem("O Paciente " + filaListPrioridade.get(0).getNome() + " Foi atendido,Próximo ");
            filaListPrioridade.remove(0);
            return;

        }
        if(!filaListNormal.isEmpty()){

            view.mensagem("O Paciente " + filaListNormal.get(0).getNome() + " Foi atendido,Próximo ");
            filaListNormal.remove(0);
            return;
        }
        view.mensagem("Não há mais pacientes na fila.");

    }
}
