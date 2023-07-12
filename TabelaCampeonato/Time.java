package TabelaCampeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Time {

    int pontos = 0;
    String nomeTime;

    public Time() {
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public List<Time> adicionarTime() {

        Scanner ler = new Scanner(System.in);
        ArrayList<Time> nomeTimesList = new ArrayList<>();

        String cont = "S";

        do {

            Time times = new Time();

            System.out.printf("Qual o nome do time: ");
            times.setNomeTime(ler.next());

            nomeTimesList.add(times);


            System.out.printf("Deseja adicionar mais um TIME (S/N): ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("S"));

        return nomeTimesList;

    }

    public void listarTimes(List<Time> nomeTimeList) {

        if (nomeTimeList.isEmpty()) {
            System.out.printf("\nLista Vazia !!!");
        } else {
            for (Time times : nomeTimeList) {
                //for (int i = 0; i <= nomeTimeList.size(); i++) {
                System.out.printf("\nO nome do Time é:  " + times.getNomeTime());
            }
        }
    }

   /* public void editarTimes(List<Times> nomeTimeList, String nomeTime) { // pensar melhor essa ideia de cadastro de time

        for (int i=0; i< nomeTimeList.size();i++){
            if(nomeTimeList.get(i).getNomeTime().equalsIgnoreCase(nomeTime)){
                System.out.printf("Qual o nome do novo time ou sua correção ");

            }
        }
    }*/

    public void removerTimes(List<Time> nomeTimeList, String removerTime) {

        for (int i = 0; i < nomeTimeList.size(); i++) {
            if (nomeTimeList.get(i).getNomeTime().equalsIgnoreCase(removerTime)) {
                System.out.println(" Nome " + nomeTimeList.get(i).getNomeTime() + " Foi removido");
                nomeTimeList.remove(i);
                return;

            }
        }
    }

    public void adicionarPontos(int quantidade) {

        setPontos(pontos += quantidade);
    }

    public void adicionarVitoria() {
        System.out.printf("O time " + getNomeTime() + " Ganhou  3 PTS \n");
    }

    public void adicionarDerrota() {
        System.out.printf("O time " + getNomeTime() + " Perdeu \n");
    }

    public void adicionarEmpate() {
        System.out.printf("Ainda emplantar !!");
        // for (int i=0; i< nomeTimeList.size();i++) {
        // System.out.printf("OS Times " + nomeTimeList.get(i).getNomeTime() + " e " + nomeTimeList.get(i).getNomeTime() + " Empataram !!!\n");
        //}
    }


}
