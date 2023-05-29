package GerenciadorTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Sistema de Gerenciamento de Tarefas:
Crie um sistema simples de gerenciamento de tarefas em linha de comando. O programa deve permitir ao usuário adicionar tarefas,
listar todas as tarefas, marcar uma tarefa como concluída e remover uma tarefa.

Você pode usar estruturas de dados como listas ou arrays para armazenar as tarefas e implementar as seguintes funcionalidades:

Adicionar uma tarefa: O usuário deve poder adicionar uma nova tarefa, informando seu nome ou descrição.
Listar todas as tarefas: O programa deve exibir todas as tarefas presentes na lista.
Marcar uma tarefa como concluída: O usuário deve poder marcar uma tarefa como concluída, fornecendo um identificador único da tarefa.
Remover uma tarefa: O usuário deve poder remover uma tarefa da lista, fornecendo um identificador único da tarefa.
Você pode implementar o programa usando classes, métodos e estruturas de controle de fluxo para manipular as tarefas.
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Dados> listTarefas = new ArrayList<>();
        ArrayList<Dados> listAux = new ArrayList<>();
        Tarefas tarefas = new Tarefas();

        String cont = "S";
        int op = 0;
        do {
            System.out.printf("1- Criar Lista de Tarefas \n" +
                    "2- Listar Lista de Tarefas \n" +
                    "3- Remover Tarefa da Lista \n" +
                    "4- Listar as Tarefas Concluidas\n" +
                    "O Que deseja fazer: ");
            op = ler.nextInt();


            if (op == 1) {

                listTarefas = tarefas.preencherLista();
            } else if (op==2) {
                tarefas.listaTarefas(listTarefas);
            } else if (op==3) {

                System.out.printf("Qual o Id Deseja remover: ");
                String id = ler.next();
                tarefas.removerTarefas(id, listTarefas);

            } else if (op==4) {
                tarefas.listaConcluido(listTarefas,listAux);
                tarefas.listarListaNova(listAux);

            } else{
                System.out.printf("Opção inválida !!!!");
            }

            System.out.printf("\nDeseja Continuar no Menu Principal S/N: ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("S"));

    }


}
