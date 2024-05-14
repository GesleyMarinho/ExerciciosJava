package String.ex07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Compressão de String: Escreva um programa que comprima uma string substituindo sequências repetidas de caracteres
 por um único caractere seguido pelo número de vezes que ele ocorre.
 Por exemplo, "aaabbbbcc" seria comprimido para "a3b4c2".
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = ler.next();

        String compress = comprimirString(palavra);

        System.out.println("String comprimida: " + compress);

    }

    public static String comprimirString(String palavra) {
        char v1[] = palavra.toCharArray();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            int contagem = 1;
            while (i < v1.length - 1 && v1[i] == v1[i + 1]) {
                contagem++;
                i++;
            }

            resultado.append(v1[i]);
            resultado.append(contagem);
        }
        return resultado.toString();
    }
}


