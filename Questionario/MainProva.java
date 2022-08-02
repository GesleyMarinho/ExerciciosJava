package Questionario;

import java.util.Scanner;

public class MainProva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int questao;

        Prova prova = new Prova("A", "C");

        Gabarito gabarito = new Gabarito();

        System.out.printf("Qual questão deseja saber se está correto : ");
        questao = ler.nextInt();
        System.out.printf("A resposta da Questão "+questao +" é : "+ gabarito.respostaQuestao(questao));
    }
}
