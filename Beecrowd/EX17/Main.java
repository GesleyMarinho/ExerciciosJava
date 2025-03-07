package Beecrowd.EX17;
/*
* Cálculo:
Convertendo para segundos:

Início:
5 × 24 × 3600 + 8 × 3600 + 12 × 60 + 23 = 435143

Fim:
9 × 24 × 3600 + 6 × 3600 + 13 × 60 + 23=798803

Diferença: 798803 − 435143 = 363660 segundos.
Convertendo para dias, horas, minutos, segundos:
Dias: 363660 ÷ (24×3600) = 3

Restante:363660 %(24 × 3600 ) = 85560

Horas: 85560 ÷ 3600 = 22 horas.
Restante: 85560 % 3600 = 60.
Minutos:60 ÷ 60 = 1 minuto.
Segundos: 60 % 60 = 0 segundos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int diaInicial = ler.nextInt();
        int horasInicial = ler.nextInt();
        int minutosInicial = ler.nextInt();
        int segundosInicial = ler.nextInt();


        int diaFinal = ler.nextInt();
        int horasFinal = ler.nextInt();
        int minutosFinal = ler.nextInt();
        int segundosFinal = ler.nextInt();


        int inicioEmSegundos = (diaInicial * 24 * 3600) + (horasInicial * 3600) + (minutosInicial * 60) + segundosInicial;
        int fimEmSegundos = (diaFinal * 24 * 3600) + (horasFinal * 3600) + (minutosFinal * 60) + segundosFinal;

        int duracaEmSegundos = fimEmSegundos - inicioEmSegundos;

        int dias = duracaEmSegundos / (24 * 3600);
        duracaEmSegundos %= (24 * 3600);

        int horas = duracaEmSegundos / 3600;
        duracaEmSegundos %= 3600;

        int minutos = duracaEmSegundos / 60;
        int segundos = duracaEmSegundos % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

    }
}


       /* String entrada[] = new String[4];

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = ler.nextLine();
        }

        String dInicio[] = entrada[0].split(" ");
        String hInicio[] = entrada[1].split(" : ");
        String dFim[] = entrada[2].split(" ");
        String hFim[] = entrada[3].split(" : ");

        int dataInicio = Integer.parseInt(dInicio[1]);
        int horaInicio = Integer.parseInt(hInicio[0]);
        int minutoINicio = Integer.parseInt(hInicio[1]);
        int segundosInicio = Integer.parseInt(hInicio[2]);

        int dataFim = Integer.parseInt(dFim[1]);
        int horaFim = Integer.parseInt(hFim[0]);
        int minutoFim = Integer.parseInt(hFim[1]);
        int segundosFim = Integer.parseInt(hFim[2]);

        int duracaoSegundos = (dataFim - dataInicio) * 86400 + (horaFim - horaInicio) * 3600
                + (minutoFim - minutoINicio) * 60 + (segundosFim - segundosInicio);

        int dias, horas, minutos, segundos;

        dias = duracaoSegundos / 86400;
        horas = (duracaoSegundos % 86400) / 3600;
        minutos = ((duracaoSegundos % 86400) % 3600) / 60;
        segundos = ((duracaoSegundos % 86400) % 3600) % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        ler.close();
    }
}
*/