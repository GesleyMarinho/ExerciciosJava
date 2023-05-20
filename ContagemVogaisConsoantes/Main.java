package ContagemVogaisConsoantes;

import java.util.Scanner;

/*
Contagem de Vogais e Consoantes:
Crie um programa que solicite ao usuário uma palavra ou frase e conte o número de vogais e consoantes presentes nela.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vogais = 0;
        int consoante = 0;

        System.out.printf("Digite uma palavra: ");
        String palavra = ler.next().toLowerCase();



        Main main = new Main();
        vogais = main.contadorVogais(palavra);
        System.out.printf("A Palavra " + palavra + "Tem " + vogais + " Vogais");
        consoante = main.contadorConsoantes(palavra);
        System.out.printf("\nA Palavra " + palavra + "Tem " + consoante + " Consoante");


    }

    public int contadorVogais(String palavra) {

        int vogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }
        return vogais;
    }

    public int contadorConsoantes(String palavra) {
        int consoante = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                consoante++;
            }
        }
        return consoante;
    }
}
