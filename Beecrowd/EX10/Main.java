package Beecrowd.EX10;

import java.util.Scanner;

/*
* A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00     15%
400.01 - 800.00     12%
800.01 - 1200.00    10%
1200.01 - 2000.00   7%
Acima de 2000.00    4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada
400.00

* Exemplo de Saída
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

* Exemplo de Entrada
800.01

* Exemplo de Saída
Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

* Exemplo de Entrada
2000.00

* Exemplo de Saída
Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %
*
*
* */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double salario = ler.nextDouble();
        double percent = 0;
        double reajuste = 0;

        if (salario <= 400.0) {
            reajuste = (salario / 100) * 15;
            salario = salario + reajuste;
            percent = 15;
        } else if (salario <= 800.0) {
            reajuste = (salario / 100) * 12;
            salario = salario + reajuste;
            percent = 12;
        } else if (salario <= 1200.0) {
            reajuste = (salario / 100) * 10;
            salario = salario + reajuste;
            percent = 10;
        } else if (salario <= 2000) {
            reajuste = (salario / 100) * 7;
            salario = salario + reajuste;
            percent = 7;
        } else {
            reajuste = (salario / 100) * 4;
            salario = salario + reajuste;
            percent = 4;
        }
        System.out.printf("Novo salario: %.2f\n", salario);

        System.out.printf("Reajuste ganho: %.2f\n", reajuste);

        System.out.printf("Em percentual: %.0f %%\n", percent);
    }

}
