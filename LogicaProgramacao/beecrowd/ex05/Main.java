package LogicaProgramacao.beecrowd.ex05;

import java.util.Scanner;
/*
* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
*  A seguir, calcule e mostre o valor da conta a pagar.

imagem adicionada

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*Exemplo de Entrada	   Exemplo de Saída
3 2                    Total: R$ 10.00
4 3                    Total: R$ 6.00
2 3                    Total: R$ 13.50
* */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        double resultado = 0;
        if (a == 1) {
            resultado = b * 4;

        } else if (a == 2) {
            resultado = b * 4.50;

        } else if (a == 3) {
            resultado = b * 5;

        } else if (a == 4) {
            resultado = b * 2;

        } else if (a == 5) {
            resultado = b * 1.50;

        } else {
            System.out.println("Código Inválido");
        }

        System.out.printf("Total: R$ %.2f%n", resultado);
    }
}
