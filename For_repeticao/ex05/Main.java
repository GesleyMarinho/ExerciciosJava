package For_repeticao.ex05;

import java.util.Scanner;

/*
Fatorial: Escreva um programa que solicite um número ao usuário e calcule o seu fatorial.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int aux = x;

        System.out.println(x + "!");
        for (int i = x - 1; i >= 1; i--) {
            aux = aux * i;
            System.out.println(x + " . " + i + " = " + aux);
        }
        System.out.println("Fatorial de " + x + " é: " + aux);
    }
}
