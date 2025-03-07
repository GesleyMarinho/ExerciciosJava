package Beecrowd.EX07;

import java.io.IOException;
import java.util.Scanner;

/*
* Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
*  A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.

Exemplos de Entrada
7.0 5.0 7.0

* 	Exemplos de Saída
TRIANGULO ACUTANGULO
TRIANGULO ISOSCELES

6.0 6.0 10.0
*
Exemplos de Saída
TRIANGULO OBTUSANGULO
TRIANGULO ISOSCELES

6.0 6.0 6.0
*
Exemplos de Saída
TRIANGULO ACUTANGULO
TRIANGULO EQUILATERO

5.0 7.0 2.0

* Exemplos de Saída
NAO FORMA TRIANGULO

6.0 8.0 10.0

* Exemplos de Saída
TRIANGULO RETANGULO
*
*
* */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x;

        if (a < b) {
            x = a;
            a = b;
            b = x;
        }
        if (b < c) {
            x = b;
            b = c;
            c = x;
        }
        if (a < b) {
            x = a;
            a = b;
            b = x;
        }

        double BCAoQuadrado = Math.pow(b, 2) + Math.pow(c, 2);
        double aAoQaadrado = Math.pow(a, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (aAoQaadrado > BCAoQuadrado) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (aAoQaadrado == BCAoQuadrado) {
            System.out.println("TRIANGULO RETANGULO");
        }

        if (aAoQaadrado < BCAoQuadrado) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        if ((a == b || b == c) != (a == b && b == c)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        scanner.close();
    }
}