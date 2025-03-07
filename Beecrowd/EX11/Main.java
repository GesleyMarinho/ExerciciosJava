package Beecrowd.EX11;

import java.util.Scanner;
/*
* Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.
*   Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

ntrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.


* Exemplos de Entrada
vertebrado
mamifero
onivoro

* Exemplos de Saída
homem

* Exemplos de Entrada
vertebrado
ave
carnivoro

* * Exemplos de Saída
aguia

* Exemplos de Entrada
invertebrado
anelideo
onivoro

* * Exemplos de Saída
minhoca
 * */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String a = ler.next();
        String b = ler.next();
        String c = ler.next();


        if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
            System.out.println("pomba");
        } else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
            System.out.println("homem");
        } else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {
            System.out.println("pulga");
        } else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
