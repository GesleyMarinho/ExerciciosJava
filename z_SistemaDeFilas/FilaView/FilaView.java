package z_SistemaDeFilas.FilaView;

import java.util.Scanner;

public class FilaView {
    Scanner scanner = new Scanner(System.in);


    public int Menu() {
        System.out.println("\nGerenciamento de Fila");
        System.out.println("1 - Inserir na Fila");
        System.out.println("2 - Listar Filas ");
        System.out.println("3 - Consultar");
        System.out.println("4 - Sair");
        System.out.printf("Qual a opção: ");
        return scanner.nextInt();
    }

    public void mensagem(String mensagem) {
        System.out.print(mensagem);
    }
}
