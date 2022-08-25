package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String pesquisa, continuar = "S";
        int op;

        ArrayList<Agenda> agendaList = new ArrayList<>();

        Agendas agendas = new Agendas();

        do {

            System.out.print("1- Listar Agenda \n" +
                    "2- Remover contato da Agenda \n" +
                    "3- Pesquisar Contato na Agenda \n" +
                    "4- Preencher Agenda \n" +
                    "O que vc deseja : ");
            op = ler.nextInt();

            if (op == 1) {
                agendas.listaAgenda(agendaList); // listar agenda

            } else if (op == 2) {
                System.out.printf("Qual o nome deseja Remover : ");
                pesquisa = ler.next();
                agendas.remover(agendaList, pesquisa); // remover a genda
            } else if (op == 3) {

                System.out.printf("Qual o nome deseja Pesquisar : ");
                pesquisa = ler.next();
                agendas.pesquisaAgenda(agendaList, pesquisa);
            } else if (op == 4) {
                agendaList = agendas.preencherLista();

            } else {
                System.out.println("Opção inválida ");
            }

            System.out.print("Deseja Continuar Menu PRINCIPAL S/N :");
            continuar = ler.next();

        } while (continuar.equalsIgnoreCase("S"));

    }
}
