package calculoNumerosPares;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro positivo n e calcule a soma dos n primeiros números pares.

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        NumerosPares pares = new NumerosPares();
        System.out.printf("Digite um valor: ");
        pares.setNumeroPar(ler.nextInt());

        double somaPares = pares.calcularNumerosPares(pares.getNumeroPar());
        System.out.printf("A soma dos Números pares é : " + somaPares);
    }
}
