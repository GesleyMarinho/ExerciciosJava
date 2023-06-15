package JogoDaVelha;

public class Velha {
    public void tabuleiro(String matriz[][]) {
        int valor = 1;
        System.out.printf("\nTabuleiro ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = String.valueOf(valor);
                valor++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < matriz.length; j++) {

                System.out.printf(" " + matriz[i][j]);
            }
        }
    }

    public int primieroJogador(int a, int b) {
        int ganhador = 0;
        if (a > b) {
            ganhador = 1;
        } else if (b > a) {
            ganhador = 2;
        } else {
            System.out.printf("\nEmpate , refazer o sorteio ");
        }
        return ganhador;
    }

    public boolean fazerJogada(String[][] matriz, int jogada, String simbolo1, String simbolo2, int jogadorVencedor) {
        if (jogadorVencedor == 1) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j].equalsIgnoreCase(String.valueOf(jogada))) {
                        matriz[i][j] = simbolo1;
                        return true;
                    }
                }
            }
        } else if (jogadorVencedor == 2) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j].equalsIgnoreCase(String.valueOf(jogada))) {
                        matriz[i][j] = simbolo2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void mostrarTabuleiro(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" " + matriz[i][j]);
            }
        }
    }

    public int  verificarGanhador(String matriz[][]){
        return 0;
    }


}
