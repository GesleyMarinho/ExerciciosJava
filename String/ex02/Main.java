package String.ex02;

import java.util.Scanner;

/*
Inversão de String: Escreva uma função que inverta uma string.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String a = ler.next();
        char normal[] = a.toCharArray();
        char invertida[] = a.toCharArray();
        for (int i = 0; i < normal.length; i++) {
            System.out.println(normal[i]);
        }

        for (int j = 0; j < a.length(); j++) {
            System.out.println( invertida[j] = normal[a.length() - 1 - j]);
        }

        String t = new String(invertida);
        System.out.println(a);
        System.out.println(t);
    }
}
