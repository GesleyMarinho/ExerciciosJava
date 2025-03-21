package Beecrowd.EX13;

import java.util.Scanner;

/*
* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio.
*  A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
*  Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

Exemplos de Entrada
3002.00

* Exemplos de Saída
R$ 80.36

* Exemplos de Entrada
1701.12

* Exemplos de Saída
Isento

* Exemplos de Entrada
4520.00

* Exemplos de Saída
R$ 355.60
* */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double salario = ler.nextDouble();
        double imposto = 0;

        if (salario <= 2000) {
            System.out.println("Isento");
        } else {

            if (salario > 2000) {
                double faixa1 = Math.min(salario - 2000, 1000);

                imposto += faixa1 * 0.08;
            }

            if (salario > 3000) {
                double faixa2 = Math.min(salario - 3000, 1500);
                imposto += faixa2 * 0.18;

            }

            if (salario > 4500) {
                double faixa3 = salario - 4500;
                imposto += faixa3 * 0.28;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }


    }

}
