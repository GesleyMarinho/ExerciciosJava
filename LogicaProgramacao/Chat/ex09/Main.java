package LogicaProgramacao.Chat.ex09;

import java.util.Scanner;

/*
* 9. Soma de Pares entre Dois Números
Descrição: Dado dois números inteiros, calcule a soma de todos os números pares entre eles (incluindo os números, se forem pares).
Dois números inteiros.
A soma dos números pares entre os dois valores.

Entrada:
3 9

Saída:
20  (4 + 6 + 8 = 20)
* */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int y = ler.nextInt();
        int soma = 0;

        for(int i = x; i<y; i++){
            if(i%2==0){
              soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
