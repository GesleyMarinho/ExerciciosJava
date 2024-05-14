package For_repeticao.ex02;

import java.util.Scanner;
/*
Tabuada: Escreva um programa que solicite um número ao usuário e imprima a tabuada desse número de 1 a 10.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = x * i;
            System.out.println(x + "*" + i + "=" + result);
        }

    }
}
