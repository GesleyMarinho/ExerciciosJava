package VerificadorDePalidromo;

import java.util.Scanner;

/*
Verificador de Palíndromo:
Escreva um programa que solicite ao usuário uma palavra ou frase e verifique se ela é um palíndromo.
Um palíndromo é uma palavra que pode ser lida da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda.
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra = null;
        String palavraAux = null;

        System.out.printf("Digite uma palavra para ser verificada: ");
        palavra = ler.next();

        palavraAux = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(palavraAux)) {
            System.out.printf("É uma palavara Palindromo !!!");
        } else {
            System.out.printf("Não é uma palavra Palindromo !!!");
        }


    }
}
