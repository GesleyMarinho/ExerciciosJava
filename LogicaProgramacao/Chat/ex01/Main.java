package LogicaProgramacao.Chat.ex01;

import java.util.Scanner;
/*
1. Soma Simples
Descrição: Escreva um programa que receba dois números inteiros e imprima a soma deles.
Entrada:
3 9
Saída:
12

* */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int a  = ler.nextInt();
        int b = ler.nextInt();

        int soma  = a+b;
        System.out.println(soma);
    }

}
