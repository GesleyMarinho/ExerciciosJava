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

            System.out.print("1- Aumentar o Volume \n" +
                    "2- Diminuir Volume \n"+
                    "3- Consultar Volume \n"+
                    "4- Escolher canal Direto \n"+
                    "5- Em qual canal estou ? \n"+
                    "Qual a opção Desejada : ");
            op = ler.nextInt();
            if (op == 1) {

                controle.aumentarVolume();
            } else if (op==2) {
                controle.diminuirVolume();
            } else if (op==3) {
                controle.consultaVolume();
            } else if (op==4) {
                System.out.print("Para qual canal deseja ALTERAR ?");
                i=ler.nextInt();
                controle.escolherCanal(i);
            } else if (op==5) {
                controle.canalAgora();
            }

            System.out.print("Deseja Continuar no Menu S/N : ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("S"));


    }

}
