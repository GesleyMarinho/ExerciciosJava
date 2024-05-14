package String.ex05;

import java.util.Scanner;

/*
Substituição de caracteres: Escreva uma função que substitua todas as ocorrências de um caractere por outro em uma string.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String a = ler.next();

        char texto[] = a.toCharArray();
        char novoA[] = new char[a.length()];
        char x = 'x';
        for (int i = 0; i < texto.length; i++) {

            if (texto[i] == x) {

                texto[i] = 'w';
            }
            novoA[i] = texto[i];
        }

        System.out.println(novoA);
    }
}
