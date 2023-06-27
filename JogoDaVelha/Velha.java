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

    public int verificarGanhador(String matriz[][]) {
        int resultado = 0;
        boolean vitoriaX = false;
        boolean vitoriaO = false;

        //VERIFICAR LINHAS
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0].equals("X") && matriz[i][1].equals("X") && matriz[i][2].equals("X")) {
                vitoriaX = true;
            } else if (matriz[i][0].equals("O") && matriz[i][1].equals("O") && matriz[i][2].equals("O")) {
                vitoriaO = true;
            }
        }

        //VERIFICAR COLUNAS
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[0][j].equals("X") && matriz[1][j].equals("X") && matriz[2][j].equals("X")) {
                vitoriaX = true;
            } else if (matriz[0][j].equals("O") && matriz[1][j].equals("O") && matriz[2][j].equals("O")) {
                vitoriaO = true;
            }
        }

        // Verificar diagonais
        if ((matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) ||
                (matriz[2][0].equals("X") && matriz[1][1].equals("X") && matriz[0][2].equals("X"))) {
            vitoriaX = true;
        } else if ((matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) ||
                (matriz[2][0].equals("O") && matriz[1][1].equals("O") && matriz[0][2].equals("O"))) {
            vitoriaO = true;
        }

        if (vitoriaX && !vitoriaO) {
            resultado = 1;
        } else if (!vitoriaX && vitoriaO) {
            resultado = 2;
        } else if (!vitoriaX && !vitoriaO) {
            boolean empate = true;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {

                    if (!matriz[i][j].equals("X") && !matriz[i][j].equals("O")) {
                        empate = false;
                        break;
                    }
                    if (!empate) {
                        break;
                    }
                }
                if (empate) {
                    resultado = 3;
                }
            }
        }

        return resultado;
    }
}
