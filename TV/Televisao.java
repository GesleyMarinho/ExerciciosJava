package TV;

import java.util.Scanner;

public class Televisao {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        String cont = "S";
        int op, i;

        Televisao tv = new Televisao();

        controleRemoto controle = new controleRemoto();

        do {

            System.out.print("MENU \n" +
                    "1- Aumentar o Volume \n" +
                    "2- Diminuir Volume \n" +

                    "3- Escolher canal Direto \n" +
                    "4- Em qual canal estou e qual é o VOLUME ? \n" +
                    "5- Trocar canal para Cima \n" +
                    "6- Trocar Canal Baixo \n" +
                    "Qual a opção Desejada : ");
            op = ler.nextInt();
            if (op == 1) {
                controle.aumentarVolume();
            } else if (op == 2) {
                controle.diminuirVolume();
            }  else if (op == 3) {
                System.out.print("Para qual canal deseja ALTERAR ? ");
                i = ler.nextInt();
                controle.escolherCanal(i);
            } else if (op == 4) {
                controle.canalAgora();
            } else if (op == 5) {
                controle.trocarCima();
            } else if (op == 6) {
                controle.trocarBaixo();
            }

            System.out.print("Deseja Continuar no Menu S/N : ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("S"));


    }

}
