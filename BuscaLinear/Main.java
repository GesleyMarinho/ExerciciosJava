package BuscaLinear;
import java.util.Scanner;

/*
Busca Linear:
Crie uma função que recebe um array de inteiros e um valor como parâmetros, e retorna a posição em que o valor se encontra no array.
Se o valor não estiver presente, retorne -1.
 */
public class Main {
    public static void main(String[] Args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[6];


        for (int i = 1; i < numeros.length; i++) {
            System.out.printf("Digite um valor: ");
            numeros[i] = ler.nextInt();

        }

        for (int i = 1; i < numeros.length; i++) {
            System.out.printf("\nPosição: " + i + "=" + numeros[i]);
        }

        System.out.printf("\nQual valor vc deseja verificar na lista: ");
        int valor = ler.nextInt();
        valor = buscalinear(numeros, valor);


        if (valor != -1) {
            System.out.printf("Valor encontrado na posição " + valor);
        } else {
            System.out.printf("Valor não encontrado " + valor);
        }

    }

    public static int buscalinear(int[] numeros, int valor) {
        int x = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return i;
            }
        }

        return -1;
    }

}
