package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);



        System.out.printf("Digite um valor:  ");
        int num = ler.nextInt();

        Main main = new Main();

        main.Fibonacci(num);

    }

    public void Fibonacci(int num) {

        int a = 0;
        int b = 1;
        int aux;
        System.out.printf( a+ " "+ b);

        for (int i = 2; i < num; i++) {

           aux = a + b;
           a = b;
           b = aux;

            System.out.printf(" "+ aux);

        }

    }
}
