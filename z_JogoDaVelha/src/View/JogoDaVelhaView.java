package View;
import java.util.Scanner;

/* Resposanvél por exibir o tabuleiro e a captura das entradas*/
public class JogoDaVelhaView {
    private Scanner scanner;

    public JogoDaVelhaView() {
        scanner = new Scanner(System.in);
    }

    public void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("------------");
        }
    }

    public int[] capturarJogada() {
        System.out.print("Digite a linha (0,1,2): ");
        int linha = scanner.nextInt();
        System.out.print("Digite a coluna (0,1,2): ");
        int coluna = scanner.nextInt();
        return new int[]{linha, coluna};

    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
