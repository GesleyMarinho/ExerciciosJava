package SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

    ArrayList<Itens> listItens = new ArrayList<>();
    ArrayList<Itens> listAux = new ArrayList<>();

    public ArrayList<Itens> adicionarItens() {
        Scanner ler = new Scanner(System.in);
        String continuar = "S";


        do {

            Itens itens = new Itens();

            System.out.printf("Qual o NOME do Produto: ");
            //itens.setNome(ler.next());
            String nomeProduto = ler.next();

            boolean nomeExiste = false;

            for (Itens item : listItens) {

                if (item.getNome().equalsIgnoreCase(nomeProduto)) {
                    nomeExiste = true;
                    break;
                }
            }

            if (nomeExiste) {
                System.out.printf("Produto com o mesmo nome já foi adicionado. Por favor, insira um nome diferente.\n");
                continue;
            }
            itens.setNome(nomeProduto);

            System.out.printf("Qual o PREÇO do Produto: ");
            double precoProduto;
            while (true) {
                precoProduto = ler.nextDouble();
                if (precoProduto >= 0) {
                    break;
                } else {
                    System.out.printf("O PREÇO não pode ser negativo! Insira novamente: ");
                }
            }
            itens.setPreco(precoProduto);

            System.out.printf("Quantos itens no ESTOQUE: ");
            int estoqueProduto;

            while (true){
                estoqueProduto = ler.nextInt();
                if(estoqueProduto >=0){
                    break;
                }else{
                    System.out.printf("O ESTOQUE NÃO pode ser negativo !!! insira um novo valor: ");
                }
            }



            itens.setEstoque(estoqueProduto);


            System.out.printf("Produto Adicionado com sucesso !!! ");

            listItens.add(itens);


            System.out.printf("\nDeseja Continuar inserindo Itens S/N: ");
            continuar = ler.next();

        } while (continuar.equalsIgnoreCase("S"));
        return listItens;
    }

    public void listarItens(List<Itens> listItens) {

        if (listItens.isEmpty()) {
            System.out.printf("\nLista vazia !!!!");
        } else {

            for (int i = 0; i < listItens.size(); i++) {
                System.out.printf("\nID " + (i + 1) + " Produto: " + listItens.get(i).getNome() + " preço: " + listItens.get(i).getPreco() + " Estoque :" + listItens.get(i).getEstoque());
            }
        }

    }

    public List<Itens> emitirPedidoVenda(List<Itens> listItens, List<Itens> listAux) {
        Scanner ler = new Scanner(System.in);


        while (true) {
            boolean encontrado = false;
            System.out.printf("Qual o item Deseja Adicionar: ");
            String produto = ler.next();
            System.out.printf("Qual a QUANTIDADE deseja adicionar: ");
            int qt = ler.nextInt();

            //boolean encontrado = false;

            for (int i = 0; i < listItens.size(); i++) {

                if (listItens.get(i).getNome().equalsIgnoreCase(produto) && listItens.get(i).getEstoque() >= qt && qt > 0) {

                    listAux.add(listItens.get(i));
                    listItens.get(i).setEstoque(listItens.get(i).getEstoque() - qt);
                    System.out.printf("Produto inserido no carrinho !" + produto + "Quantidade " + qt);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.printf("Produto não encontrado " + produto + " OU Quantidade inferior ou superior estoque " + qt);
            }

            System.out.print("\nDeseja adicionar mais produtos? (S/N): ");
            String continuar = ler.next();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }


        return listAux;
    }


    public double calcularTotal(List<Itens> listAux) {
        double total = 0;

        if (listAux.isEmpty()){
            System.out.printf("Seu CARRINHO está vazio =/ ");

        }else {

            for (int i = 0; i < listAux.size(); i++) {

                total += listAux.get(i).getPreco() * listAux.get(i).getEstoque();
            }
        }


        return total;

    }
}
