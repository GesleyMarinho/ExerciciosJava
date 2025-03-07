package Beecrowd.EX04;

import java.util.Scanner;
/*
* Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
* Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X
*
* */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double ladoA = ler.nextDouble();
        double ladoB = ler.nextDouble();
        double base = ler.nextDouble();


        if (ladoA + ladoB > base && ladoA + base > ladoB && ladoB + base > ladoA) {
            double perimetro = ladoA + ladoB + base;
            System.out.println("Perimetro = " + perimetro);
        } else {
            double area = ((ladoA + ladoB) * base) / 2;
            System.out.println("Area = " + area);

        }

    }
}
