package CaixaEletronicoView;

import java.util.Scanner;

public class CaixaEletronicoView {
    private Scanner scanner;

    public CaixaEletronicoView() {

        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\n--- Caixa Eletrônico ---");
        System.out.println("1. Verificar Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public void exibirsaldo(double saldo) {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public double capturarValor() {
        System.out.println("Digite um valor: ");
        return scanner.nextDouble();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
