package LogicaProgramacao.Chat.ex02;

import java.util.Scanner;
/*
* 2. Média de Números
Descrição: Receba três números e calcule a média aritmética deles.
Entrada:
Três números inteiros ou decimais.
Saída:
A média aritmética (com até duas casas decimais).
*
* Entrada:
4 6 8
Saída:
6.00

* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();

        double resultado  = (double) (a + b + c) / 3;

        System.out.println(resultado);
    }

}
