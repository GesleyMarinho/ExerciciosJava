package For_repeticao.ex04;

import java.util.Scanner;

/*
Soma dos dígitos: Escreva um programa que solicite um número ao usuário e calcule a soma dos seus dígitos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        int result = 0; // se iniciar como 1 podemos para divisão é multiplicação;
        int digito = 0;

        if (x < 10 || x > 100) {
            System.out.println("Valor Digitado errado!");
        } else {
            while (x > 0) {
                digito = x % 10;

                 result = result + digito; //Soma
                // result =   result * digito ; //Multiplicação
                //result = digito / result; //Divisão
                x = x / 10;
            }
        }
        System.out.println(result);
    }
}
