package String.ex04;

import java.util.Arrays;
import java.util.Scanner;

/*
Verificar palíndromo: Escreva um programa que verifique se uma string é um palíndromo, ou seja, se pode ser lida da mesma forma de trás para frente.
 */
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        String a = ler.next();


        char x[] = a.toCharArray();
        char t[] = a.toCharArray();

        for (int i = 0; i<a.length(); i++){

            t[i] = x[a.length() -1 - i];
        }

        System.out.println(x);
        System.out.println(t);
        boolean e = compareVetor( x,t);
        System.out.println(e);
    }

    public static boolean compareVetor(char[] x, char[] t){

        return Arrays.equals(x,t);
    }
}
