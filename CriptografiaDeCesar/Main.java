package CriptografiaDeCesar;

import java.util.Scanner;

/*
Criptografia de César:
Implemente uma função que receba uma string e um número inteiro como parâmetros e retorne a string criptografada usando a criptografia de César.
A criptografia de César é um tipo simples de criptografia de substituição, na qual cada letra é deslocada um determinado número de posições no alfabeto.
Por exemplo, se o número de deslocamento for 3, a letra "A" se tornará "D", "B" se tornará "E" e assim por diante.

Exemplo de entrada e saída esperadas:
 */
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite uma palavra: ");
        String palavra = ler.next();
        int deslocamento = 3;
        String aux = criptografiaCesar(palavra, deslocamento);
        System.out.printf("A Palavra criptografada é: "+ aux);


    }

    public static String criptografiaCesar(String texto, int deslocamento) {

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isUpperCase(caractere)) {
                char novoCaratere = (char) (((caractere - 'A' + deslocamento) % 26) + 'A');
                resultado.append(novoCaratere);
            } else if (Character.isLowerCase(caractere)) {

                char novoCaratere = (char) (((caractere - 'a' + deslocamento) % 26) + 'a');
                resultado.append(novoCaratere);

            } else {
                resultado.append(caractere);
            }

        }
        return resultado.toString();
    }
}

