package String.ex08;

import java.util.Scanner;

/*
Rotação de String: Escreva um programa que verifique se uma string é uma rotação circular de outra string.
 Por exemplo, "abcd" é uma rotação de "bcda".
 */
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = ler.next();

        palavra = rotacionar(palavra);
        System.out.println(palavra);


    }

    public static String rotacionar(String palavra) {
        char[] chars = palavra.toCharArray();
        char primeiro = chars[0];
        for (int j = 1; j < palavra.length(); j++) {
            chars[j - 1] = chars[j];

        }

        chars[chars.length - 1] = primeiro;

        return new String(chars);

    }

}
