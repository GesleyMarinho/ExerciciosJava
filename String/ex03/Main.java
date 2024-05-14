package String.ex03;

import java.util.Scanner;

/*
Remoção de espaços em branco: Escreva um programa que remova todos os espaços em branco de uma string.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String a = ler.nextLine();

        String b = retirarEspacoEmBranco(a);

        System.out.println(b);
    }

    public static String retirarEspacoEmBranco(String x) {

        return x.replace(" ", "").trim();

    }
}
