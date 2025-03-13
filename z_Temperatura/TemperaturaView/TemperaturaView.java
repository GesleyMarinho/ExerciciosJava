package z_Temperatura.TemperaturaView;

import java.util.Scanner;

public class TemperaturaView {
    Scanner scanner = new Scanner(System.in);

    public int Menu() {
        System.out.println("\nGerenciamento de TEMPERATURAS");
        System.out.println("1 - Adicionar temperatura máxima");
        System.out.println("2 - Listar Temperaturas ");
        System.out.println("3 - Consultar temperatura no dia ");
        System.out.println("4 - Exibir a Maior e a menor temperatura");
        System.out.println("5 - Media Temperatura");
        System.out.println("6 - Sair");
        System.out.printf("Qual a opção : ");
        return scanner.nextInt();
    }

    public void mensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
