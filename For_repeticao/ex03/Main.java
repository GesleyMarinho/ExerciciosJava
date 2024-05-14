package For_repeticao.ex03;

import java.util.Scanner;
/*
Soma dos números pares: Escreva um programa que calcule e imprima a soma dos números pares de 1 a 100.
*/
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        int result =0;

        for(int i =1; i < 100; i++){
            if(i%2==0){
                result = result +i;
            }
        }
        System.out.println(result);
    }
}
