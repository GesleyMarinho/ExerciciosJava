package String.ex06;

import java.util.Scanner;

/*
06 - Contagem de palavras: Escreva um programa que conte o número de palavras em uma string.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        int count = contadorPalavras(texto);

        System.out.println(count);
    }

    public static int contadorPalavras(String texto) {
        texto.trim();

        if (texto.isEmpty()) {
            return 0;
        }
        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }

}
