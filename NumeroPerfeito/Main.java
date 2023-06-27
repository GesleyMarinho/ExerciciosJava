package NumeroPerfeito;

/*
Desafio: Implemente um programa que solicite ao usuário um número inteiro positivo e verifique se esse número é um número perfeito.
Um número perfeito é aquele que é igual à soma de seus divisores positivos próprios (excluindo o próprio número). Por exemplo, o número 6 é perfeito,
pois seus divisores próprios (1, 2, 3) somam 6.
Seu programa deve exibir uma mensagem indicando se o número digitado é perfeito ou não.
Lembre-se de validar se o número fornecido é positivo antes de realizar os cálculos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int result = 0;
        System.out.printf("Digite um valor: ");
        int num = ler.nextInt();


        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.printf(" " + i);
                result = result + i;
            }
        }

        if(result == num){
            System.out.printf("\nNúmero Perfeito !!!");
        }else{
            System.out.printf("\nNúmero NÃO Perfeito !!!");
        }
    }
}
