package Agenda;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {


    public ArrayList<Agenda> preencherLista() {

        ArrayList<Agenda> agendaList = new ArrayList<>();

        Scanner ler = new Scanner(System.in);
        String cont = "S";

        do {

            Agenda agenda = new Agenda();

            System.out.print("Qual o seu NOME : ");
            agenda.setNome(ler.next());

            System.out.print("Qual a sua IDADE : ");
            agenda.setIdade(ler.nextInt());

            System.out.print("Qual a sua ALTURA : ");
            agenda.setAltura(ler.nextDouble());

            agendaList.add(agenda);

            System.out.print("Deseja Continuar Preenchimento a AGENDA S/N :");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));
        return agendaList;
    }

    public void listaAgenda(List<Agenda> agendaList) {


        for (Agenda agenda : agendaList) {
            System.out.println(" Nome " + agenda.getNome() + " Idade = " + agenda.getIdade() + " Altura = " + agenda.getAltura());
        }
    }

    public void remover(List<Agenda> agendaList, String nome) {
        for (int i = 0; i < agendaList.size(); i++) {
            if (agendaList.get(i).getNome().equalsIgnoreCase(nome)) {

                System.out.println(" Nome " + agendaList.get(i).getNome() + " Foi removido");
                agendaList.remove(i);
                return;
            }
        }
        System.out.println("O Nome " + nome + " não está na lista ");
    }



    public void pesquisaAgenda(List<Agenda> agendaList, String nome) {


        for (int i = 0; i < agendaList.size(); i++) {

            if (agendaList.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("O Nome " + agendaList.get(i).getNome() + " está na lista");
                return;
            }

        }
        System.out.println("O Nome " + nome + " não está na lista ");

    }

}
