package SistemaDeVendas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Crie um programa que simule um sistema de vendas de uma loja. O programa deve permitir ao usuário adicionar produtos ao carrinho de compras,
exibir o total da compra e finalizar a compra.

Você pode implementar as seguintes funcionalidades:

Adicionar produtos ao carrinho: O usuário deve poder adicionar produtos ao carrinho de compras, informando o nome do produto e o preço.
Exibir o total da compra: O programa deve calcular e exibir o valor total da compra, somando os preços de todos os produtos no carrinho.
Finalizar a compra: O usuário deve poder finalizar a compra, exibindo uma mensagem de agradecimento e o valor total da compra.
Você pode usar estruturas de dados como listas para armazenar os produtos e implementar as funcionalidades usando classes, métodos e estruturas de controle de fluxo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        Pedido pedido = new Pedido();

        List<Itens> listItens = new ArrayList<>();
        List<Itens> listAux = new ArrayList<>();
        int op = 0;

        String cont = "S";

        do {

            System.out.printf("1- Cadastrar itens e preços \n"
                    + "2- listar os itens \n"
                    + "3- Emitir um Pedido \n"
                    + "4- Finalizar o Pedido\n "
                    + "O Que deseha fazer : ");
            op = ler.nextInt();

            if (op == 1) {

                listItens = pedido.adicionarItens();

            } else if (op == 2) {

                pedido.listarItens(listItens);

            } else if (op == 3) {

                pedido.emitirPedidoVenda(listItens, listAux);

            } else if (op == 4) {
                double precoFinal = 0;
                String des = "S";

                System.out.printf("Deseja finalizar a compra S/N :");
                des = ler.next();
                if (des.equalsIgnoreCase("S")) {
                    precoFinal = pedido.calcularTotal(listAux);
                    System.out.printf("Preço final do pedido é de R$ " + precoFinal );
                } else {
                    System.out.printf("Compra cancelada !! ");
                }

            }

            System.out.printf("\nDeseja Continuar no Menu S/N: ");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));


    }
}
