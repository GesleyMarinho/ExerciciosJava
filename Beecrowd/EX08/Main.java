package Beecrowd.EX08;

import java.util.Scanner;

/*
* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
* sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

Exemplo de Entrada
16 2
Exemplo de Saída
O JOGO DUROU 10 HORA(S)

* Exemplo de Entrada
0 0
Exemplo de Saída
O JOGO DUROU 24 HORA(S)
*
* Exemplo de Entrada
2 16

O JOGO DUROU 14 HORA(S)
*
* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int horaInicial = ler.nextInt();
        int horaFinal = ler.nextInt();

        int duracao = 0;


        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            duracao = (24 - horaInicial) + horaFinal;

        } else {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
