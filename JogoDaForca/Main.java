package JogoDaForca;

import java.util.Random;
import java.util.Scanner;

/*
Jogo da Forca:
Crie um jogo da forca em que o programa escolha aleatoriamente uma palavra de um conjunto de palavras predefinidas.
O jogador deve tentar adivinhar a palavra, digitando uma letra por vez.
O programa deve exibir uma representação visual da forca e atualizar conforme o jogador for acertando ou errando as letras.
Você pode representar a forca usando caracteres ASCII ou criar uma interface gráfica, se preferir.

Exemplo de interação do jogo:
 */
public class Main {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        // Lista com as Palavras
        String[] palavras = {"casa", "banana", "uai", }; //"12345678910"

        System.out.printf("Jogo da Forca !\n");

        // variavel palavra receve um random para acessar uma das palavras da lista;
        String palavra = palavras[random.nextInt(palavras.length)];

        // lista que recebe o tamanho da  palavra selecionado;
        char[] letrarEncontradas = new char[palavra.length()];

        int tentativa = 4; //quantidade total de tentativas;

        System.out.printf(" teste " + palavra);


        while (true) {

            System.out.printf("\nPalavra: ");
            for (int i = 0; i < palavra.length() ; i++) {

                //se a letra na posição [i] for encontrada ele preenche com a letra.
                //se não é preenchido com ( _ )
                if (letrarEncontradas[i] != 0) {
                    System.out.printf(letrarEncontradas[i] + "");
                } else {
                    System.out.printf("_");
                }
            }

            System.out.printf("\nDigite uma letra: ");
            // aqui eu digito uma letra e passo ela para caixa baixa;
            char letra = ler.next().charAt(0);
            letra = Character.toLowerCase(letra);

            boolean tipo = false;

            for (int i = 0; i < palavra.length(); i++) {
                // se a letra for acertada eu preencho o array
                 // com a letra que foi encontrada é inserida nas posições que tem na palavra;
                if (palavra.charAt(i) == letra) {
                    letrarEncontradas[i] = letra;
                    tipo = true;
                }
            }

            if (String.valueOf(letrarEncontradas).equals(palavra)) {
                System.out.printf("Parabéns !");
                break;
            }
            if(tentativa == 0){
                System.out.printf("Perdeu !");
                break;
            }
            if(!tipo){
                tentativa --;
            }

            System.out.printf("teste tentativas "+ tentativa);
        }


    }
}
