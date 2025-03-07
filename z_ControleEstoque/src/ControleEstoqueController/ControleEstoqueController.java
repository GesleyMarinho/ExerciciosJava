package ControleEstoqueController;

import ControleEstoqueModel.ControleEstoqueModel;
import ControleEstoqueView.ControleEstoqueView;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ControleEstoqueController {

    private ControleEstoqueView view;
    private ControleEstoqueModel model;
    private List<ControleEstoqueModel> produtos;
    private Scanner scanner;

    public ControleEstoqueController(ControleEstoqueModel model, ControleEstoqueView view) {
        this.model = model;
        this.view = view;
        this.produtos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProduto();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 0:
                    model.mensagem("Saindo ....");
                    break;
                default:
                    model.mensagem("Opção Inválida");
            }
        } while (opcao != 0);
    }

    public void cadastrarProduto() {
        try {
            ControleEstoqueModel produto = new ControleEstoqueModel();

            System.out.print("Digite código do Produto: ");
            while (!scanner.hasNextInt()) {
                model.mensagem("Código inválido! Digite um número válido.");
                scanner.next();
            }
            produto.setCodProd(scanner.nextInt());

            scanner.nextLine(); // Limpa buffer

            System.out.print("Digite o nome do Produto: ");
            produto.setNome(scanner.nextLine());

            System.out.print("Digite a quantidade do Produto: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Quantidade inválida! Digite um número válido.");
                scanner.next();
            }
            produto.setQuantidade(scanner.nextInt());

            System.out.print("Digite o preço de Custo: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Preço inválido! Digite um valor numérico.");
                scanner.next();
            }
            double precoCusto = scanner.nextDouble();
            produto.setPrecoCusto(precoCusto);

            // Calcula o preço de venda
            produto.setPrecoVenda(produto.calculoPrecoVenda(precoCusto));

            produtos.add(produto);
            model.mensagem("Produto cadastrado com sucesso!");

        } catch (InputMismatchException e) {
            model.mensagem("Erro: Entrada inválida! Certifique-se de digitar números corretamente.");
            scanner.nextLine(); // Limpa buffer
        }
    }


    public void listarProduto() {

        if (produtos.isEmpty()) {
            model.mensagem("Nenhum produto Cadastro!!");
            return;
        }

        // Cabeçalho da tabela
        System.out.printf("%-10s | %-25s | %-10s | %-15s | %-15s%n",
                "CodProd", "Nome", "Quantidade", "Preço de Custo", "Preço de Venda");
        System.out.println("-----------|---------------------------|------------|-----------------|----------------");
        for (ControleEstoqueModel produto : produtos) {

            System.out.printf("%-10d | %-25s | %-10d | R$ %-12.2f | R$ %-12.2f%n",
                    produto.getCodProd(),
                    produto.getNome(),
                    produto.getQuantidade(),
                    produto.getPrecoCusto(),
                    produto.getPrecoVenda());

        }

    }

    public void removerProduto() {
        System.out.print("Qual o código de produto você deseja remover? ");
        int codigo = scanner.nextInt();

        boolean removido = false;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodProd() == codigo) {
                produtos.remove(i);
                removido = true;
                model.mensagem("Produto removido com sucesso!");
                break;
            }
        }

        if (!removido) {
            model.mensagem("Produto não encontrado!");
        }
    }

    public void atualizarProduto() {

        System.out.println("Qual o produto deseja atualizar: ");
        int codigo = scanner.nextInt();

        ControleEstoqueModel produtoAtualizar = null;

        for (ControleEstoqueModel produto : produtos) {
            if (produto.getCodProd() == codigo) {
                produtoAtualizar = produto;
                break;
            }
        }

        if (produtoAtualizar == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.println("Produto encontrado! Dados atuais:");
        System.out.printf("Nome: %s | Quantidade: %d | Preço de Custo: R$ %.2f | Preço de Venda: R$ %.2f%n",
                produtoAtualizar.getNome(), produtoAtualizar.getQuantidade(),
                produtoAtualizar.getPrecoCusto(), produtoAtualizar.getPrecoVenda());

        System.out.println("\nO que deseja atualizar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Quantidade");
        System.out.println("3 - Preço de Custo");
        System.out.println("0 - Cancelar");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Evita problemas ao ler strings depois de números

        switch (opcao) {
            case 1:
                System.out.print("Digite o novo nome: ");
                produtoAtualizar.setNome(scanner.nextLine());
                break;
            case 2:
                atualizarEstoque(produtoAtualizar);
                break;
            case 3:
                System.out.print("Digite o novo preço de custo: ");
                double novoPrecoCusto = scanner.nextDouble();
                produtoAtualizar.setPrecoCusto(novoPrecoCusto);

                // Atualiza o preço de venda com base no novo custo
                produtoAtualizar.setPrecoVenda(novoPrecoCusto * 1.10);
                break;
            case 0:
                System.out.println("Atualização cancelada.");
                return;
            default:
                model.mensagem("Opção inválida! Nenhuma alteração foi feita.");
                return;
        }

        System.out.println("Produto atualizado com sucesso!");

    }

    public void atualizarEstoque(ControleEstoqueModel produto) {
        System.out.print("Deseja adicionar (1) ou retirar (2) do estoque? ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a quantidade a adicionar no estoque: ");
            int entrada = scanner.nextInt();
            produto.setQuantidade(produto.entradaEstoque(entrada));
            model.mensagem("Entrada de estoque Atualizada !!!");
        } else if (escolha == 2) {
            System.out.print("Digite a quantidade a retirar do estoque: ");
            int saida = scanner.nextInt();
            produto.setQuantidade(produto.saidaEstoque(saida));

        } else {
            model.mensagem("Opção inválida. Nenhuma alteração feita.");
        }
    }
}
