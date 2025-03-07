package ControleEstoqueView;

import java.util.Scanner;

public class ControleEstoqueView {
    private Scanner scanner;

    public ControleEstoqueView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("Bem-vindo ao Controle de Estoque!");
        System.out.println("Digite uma opção");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar os Produtos");
        System.out.println("3 - Atualizar os Produtos");
        System.out.println("4 - Remover os Produtos");
        System.out.print("Qual opção vc deseja? ");

        return scanner.nextInt();
    }


}
