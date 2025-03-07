package Model;

/*Resposanvél pela lógica do Jogo*/
public class JogoDaVelhaModel {

    private char[][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelhaModel() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        iniciarTabuleiro();
    }

    private void iniciarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ') {
            return false;
        }
        tabuleiro[linha][coluna] = jogadorAtual;
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        return true;
    }

    public char verificadorVencedor() {
        // Verifica linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != ' ' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return tabuleiro[i][0]; // Retorna o jogador que venceu na linha i
            }
        }

        // Verifica colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] != ' ' && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                return tabuleiro[0][j]; // Retorna o jogador que venceu na coluna j
            }
        }

        // Verifica diagonal principal
        if (tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return tabuleiro[0][0]; // Retorna o jogador que venceu na diagonal principal
        }

        // Verifica diagonal secundária
        if (tabuleiro[0][2] != ' ' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return tabuleiro[0][2]; // Retorna o jogador que venceu na diagonal secundária
        }

        // Se não houver vencedor, retorna ' '
        return ' ';
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false; // Ainda há espaços vazios
                }
            }
        }
        return true; // Tabuleiro cheio
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public char getJogadorAtual() {
        return jogadorAtual;
    }
}
