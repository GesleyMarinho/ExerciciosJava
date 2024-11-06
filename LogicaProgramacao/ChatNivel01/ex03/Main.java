package LogicaProgramacao.ChatNivel01.ex03;

import java.util.Scanner;

/*
* 3. Verificar Par ou Ímpar
Descrição: Escreva um programa que receba um número inteiro e informe se ele é par ou ímpar.
Entrada:
*Um número inteiro.
Saída:
*"Par" se o número for par, e "Ímpar" se o número for ímpar.

* Exemplo:
Entrada:
5
Saída:
Ímpar
*
* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();

        if (a%2 == 0 ){
            System.out.println("Par");
        }else {
            System.out.println("Ímpar");
        }
    }
}
