package Elevador;

import java.util.Scanner;

// Finalizado
public class MainElavador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Elevador elevador = new Elevador();

        int op = 0;

        String continuar = "S";

        do {

            System.out.print("Menu \n" +
                    "1- Subir Elevador \n" +
                    "2- Descer Elevador \n" +
                    "3- Sair Pessoas \n" +
                    "4- Entrar Pessoas \n" +
                    "5- Verificar o Andar\n" +
                    "6- Quantas pessoas está no Elevador ? \n" +
                    "Qual a opção desejada : ");
            op = ler.nextInt();

            if (op == 1) {
                System.out.print("Para qual Andar desejar Subir : ");
                elevador.subirElevador(ler.nextInt());
                elevador.verificarAndar();
            } else if (op == 2) {
                System.out.print("Quantos andares vc deseja DESCER : ");
                elevador.desceElevador(ler.nextInt());
                elevador.verificarAndar();

            } else if (op == 4) {
                System.out.print("Quantas Pessoas desejam entrar no elevador ? ");
                elevador.entrarNoElevador(ler.nextInt());
            } else if (op == 3) {
                System.out.print("Quantas pessoas vão descer ? ");
                elevador.descerDoElevador(ler.nextInt());
            } else if (op == 5) {
                elevador.verificarAndar();
            } else if (op == 6) {
                elevador.qtPessoaselevador();
            }

            System.out.print("Deseja Continuar S/N : ");
            continuar = ler.next();
        } while (continuar.equalsIgnoreCase("S"));


    }
}
