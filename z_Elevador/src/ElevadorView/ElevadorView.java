package ElevadorView;

import java.util.Scanner;

public class ElevadorView {

    private Scanner scanner;

    public ElevadorView () {
        scanner = new Scanner(System.in);
    }

    // Exibe o menu e retorna a opção escolhida
    public int exibirMenu() {
        System.out.println("\n--- Elevador ---");
        System.out.println("1. Entrar");
        System.out.println("2. Sair");
        System.out.println("3. Andar");

        //System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }


    public void exibirMensagem(String mensagem){
        System.out.printf(mensagem);
    }
}
