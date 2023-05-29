package GerenciadorTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    ArrayList<Dados> listTarefas = new ArrayList<>();
    ArrayList<Dados> listAux = new ArrayList<>();

    public ArrayList<Dados> preencherLista() {
        Scanner ler = new Scanner(System.in);


        String cont = "S";

        do {

            Dados dados = new Dados();

            System.out.printf("Qual o compromisso: ");
            dados.setCompromisso(ler.next());

            System.out.printf("Compromisso Atendido: ");
            dados.setAtendido(ler.next().charAt(0));

            listTarefas.add(dados);

            System.out.printf("Deseja continuar a preencher a lista: S/N ");
            cont = ler.next();


        } while (cont.equalsIgnoreCase("S"));
        return listTarefas;
    }

    public List<Dados> listaConcluido(List<Dados> listTarefas, List<Dados> listAux) {
        //criar uma lista auxiliar para receber os compromissos feitos;

        for (int i = 0; i < listTarefas.size(); i++) {
            if (listTarefas.get(i).getAtendido() == 'S' || listTarefas.get(i).getAtendido() == 's') {
                listAux.add(listTarefas.get(i));
            }
        }
        return listAux;

    }

    public void listarListaNova(List<Dados> listAux) {
        for (int i = 0; i < listAux.size(); i++) {
            System.out.printf("\n" + "Compromisso: " + " ( " + listAux.get(i).getCompromisso() + " )" + " foi Executado !!! ");
        }
    }

    public void listaTarefas(List<Dados> listTarefas) {


        for (int i = 0; i < listTarefas.size(); i++) {
            System.out.printf("\n" + "Compromisso: " + (i + 1) + " ( " + listTarefas.get(i).getCompromisso() + " )" + " Atendido: " + listTarefas.get(i).getAtendido());
        }

    }

    public void removerTarefas(String id, List<Dados> listTarefas) {

        if (listTarefas.isEmpty()) {
            System.out.printf("Nenhum Compromisso na Lista");
        } else {

            for (int i = 0; i < listTarefas.size(); i++) {
                if (listTarefas.get(i).getCompromisso().equalsIgnoreCase(id)) {

                    System.out.printf("Compromisso " + listTarefas.get(i).getCompromisso() + " removido com sucesso !!!");
                    listTarefas.remove(i);
                    return;
                }
            }
            System.out.printf("Compromisso com ID não encontrado na lista. " + id);
        }

    }
}
