package String.ex01;
/*Exercício: Contagem de Vogais e Consoantes

Escreva um programa em Java que recebe uma string do usuário e conta o número de vogais e consoantes na string.
Considere que a string pode conter letras maiúsculas e minúsculas, e que os caracteres não são acentuados.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String var = in.next();
        var.toLowerCase();
        int countVogais = 0;
        int countConsoantes = 0;

        char vogais[] = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < var.length(); i++) {

            char c = var.charAt(i);
            if (contem(vogais, c)) {
                countVogais++;
            } else if (!contem(vogais,c)) {
                countConsoantes ++;
            }

          //  countConsoantes++;
        }

        System.out.println("vogais: " + countVogais);
        System.out.println("Consoantes " + countConsoantes);
    }

    public static boolean contem(char vetor[], char comparacao) {
        boolean flag = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == comparacao) {
                flag = true;
            }

        }
        return flag;
    }
}
