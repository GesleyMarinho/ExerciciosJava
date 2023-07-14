package TabelaCampeonato;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        List<Time> tabela = new ArrayList<>();

        String time[] = new String[4];
        time[0] = "AA";
        time[1] = "BB";
        time[2] = "CC";
        time[3] = "DD";

        int qtEquipes = time.length;

        tabela.add(new Time(time[0], 0, 0, 0, 0));
        tabela.add(new Time(time[1], 0, 0, 0, 0));
        tabela.add(new Time(time[2], 0, 0, 0, 0));
        tabela.add(new Time(time[3], 0, 0, 0, 0));

        for (int i = 0; i < qtEquipes; i++) {
            int x = random.nextInt(5);
            for (int j = 0; j < qtEquipes; j++) {
                int y = random.nextInt(5);

                if (i != j) {
                    System.out.printf(time[i] + " (" + x + ")" + " x " + "(" + y + ") " + time[j]);
                    tabela.get(i).setGols(tabela.get(i).getGols() + x);
                    tabela.get(j).setGols(tabela.get(j).getGols() + y);

                    if (x > y) {
                        tabela.get(i).setVitoria(tabela.get(i).getVitoria() + 1);
                        tabela.get(j).setDerrota(tabela.get(j).getDerrota() + 1);
                    } else if (x < y) {
                        tabela.get(j).setVitoria(tabela.get(j).getVitoria() + 1);
                        tabela.get(i).setDerrota(tabela.get(i).getDerrota() + 1);
                    } else {
                        tabela.get(i).setEmpate(tabela.get(i).getEmpate() + 1);
                        tabela.get(j).setEmpate(tabela.get(j).getEmpate() + 1);
                    }
                }
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");

        Collections.sort(tabela, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getVitoria() != o2.getVitoria()) {
                    return o2.getVitoria() - o1.getVitoria();
                } else {
                    return o2.getGols() - o1.getGols();
                }

            }
        });


        for (int i = 0; i < qtEquipes; i++) {
            System.out.printf("Nome do Time: " + tabela.get(i).getNomeTime() + " Vitorias: " + tabela.get(i).getVitoria() +
                    " Empates: " + tabela.get(i).getEmpate() + " Derrotas: " + tabela.get(i).getDerrota() + " Gols: " + tabela.get(i).getGols() + "\n");
        }

    }
}
