package Beecrowd.EX12;

import java.util.Scanner;
/*
Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

Exemplo de Entrada
11

Exemplo de Saída
Sao Paulo

 */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int dd = ler.nextInt();


        if (dd == 31) {
            System.out.println("Belo Horizonte");
        } else if (dd == 61) {
            System.out.println("Brasilia");
        } else if (dd == 11) {
            System.out.println("Sao Paulo");
        } else if (dd == 71) {
            System.out.println("Salvador");
        } else if (dd == 21) {
            System.out.println("Rio de Janeiro");
        } else if (dd == 32) {
            System.out.println("Juiz de Fora");
        } else if (dd == 19) {
            System.out.println("Campinas");
        } else if (dd == 27) {
            System.out.println("Vitoria");
        } else {
            System.out.println("DDD nao cadastrado");
        }

    }

}
