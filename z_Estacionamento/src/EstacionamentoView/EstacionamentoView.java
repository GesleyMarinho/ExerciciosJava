package EstacionamentoView;

import java.util.Scanner;

public class EstacionamentoView {

    Scanner scanner = new Scanner(System.in);
    public int Menu() {
        System.out.println("\nGerenciamento de vagas");
        System.out.println("1 - Estacionar");
        System.out.println("2 - Pagar e Sair ");
        System.out.println("3 - Listar veiculos estacionados");
        System.out.println("4 - Finalizar o Programa");
        System.out.printf("Qual a opção: ");
        int op = scanner.nextInt();
        return op;
    }

    public void mensagem(String mensagem) {
        System.out.print(mensagem);
    }
}
