package Beecrowd.EX09;

import java.util.Scanner;

/*
*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

Exemplo de Entrada
7 8 9 10
Exemplo de Saída
O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

* Exemplo de Entrada
7 7 7 7
Exemplo de Saída
O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)
*
Exemplo de Entrada
7 10 8 9
Exemplo de Saída
O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)
* */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int horaInicial = ler.nextInt();
        int minutosInicial = ler.nextInt();
        int horaFinal = ler.nextInt();
        int minutosFinal = ler.nextInt();

        int horas = 0;
        int minutos = 0;


        if (minutosInicial == minutosFinal && horaInicial == horaFinal) {
            horas = 24;
            minutos = 0;
            System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
            return;
        } else {
            if (minutosFinal < minutosInicial) {
                minutos = (60 - minutosInicial) + minutosFinal;
                horaFinal--;
            } else {
                minutos = minutosFinal - minutosInicial;
            }
        }


        if (horaFinal < horaInicial) {
            horas = (24 - horaInicial) + horaFinal;
        }else {
            horas = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}
