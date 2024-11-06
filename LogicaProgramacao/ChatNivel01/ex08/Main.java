package LogicaProgramacao.ChatNivel01.ex08;

import java.util.Scanner;

/*
* 8. Inverter String
Descrição: Receba uma string e imprima-a ao contrário.
Entrada:
hello

Saída:
olleh
*
*  */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String aux = ler.next();
        String palavra = ler.next();

        char[] vetor = aux.toCharArray();

        for (int i = 0; i < vetor.length / 2; i++) {
            char temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 -i];
            vetor[vetor.length-1-i] = temp;
        }

        String invertida  = new String(vetor);
        System.out.println(invertida);

        String palavra2 = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavra2);

    }
}
