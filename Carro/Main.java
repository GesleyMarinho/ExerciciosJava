package Carro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op = 0;
        String cont = "S";
        Carro c1 = new Carro();

        c1.marca = "Fiat";
        c1.velocidadeMax = 160;
        c1.ligado = false;
        do {
            System.out.print("Escolha uma das opções Abaixo \n" +
                    "1 - Ligar o carro \n" +
                    "2 - Desligar o carro \n" +
                    "3 - Acelerar o carro \n" +
                    "4 - Desacelerar o carro \n" +
                    "5 - Status do carro no momento : ");
            op = ler.nextInt();

            if (op == 1) {
                c1.carroLigado();
            } else if (op == 2) {
                c1.carroDesligado();
            } else if (op == 3) {
                c1.acelerarCarro2(40);
            } else if (op == 4) {
                c1.carroDesacelerar(40);
            } else if (op == 5) {
                c1.status();
            } else {
                System.out.println("Opção Invalida");
                cont = ler.nextLine();
            }
        } while (cont == "S");


    }
}
