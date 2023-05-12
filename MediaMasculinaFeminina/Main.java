package MediaMasculinaFeminina;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Dados> dadosList = new ArrayList<>();
        MetodosouFuncoes metodosouFuncoes = new MetodosouFuncoes();


        int op = 0;
        String continuar = "S";

        dadosList = metodosouFuncoes.inserirDados();
        //metodosouFuncoes.listarUsuarios(dadosList);

        do {

            System.out.printf("1- Calcular a maior Altura \n" + "2- Calcular a menor Altura \n" +
                    "3- Média de altura dos homens \n" + "4- O número de mulheres \n" + "5- listar \n"+"6- Posição em que está a maior altura\n");
            System.out.printf("Qual a opção desejada ? ");
            op = ler.nextInt();

            if (op == 1) {
                double maior = metodosouFuncoes.maiorAltura(dadosList);
                System.out.printf("Maior Altura " + maior);

            } else if (op == 2) {
                double menor = metodosouFuncoes.menorAltura(dadosList);
                System.out.printf("Maior Altura " + menor);

            } else if (op == 3) {
                double mediaAltura = metodosouFuncoes.mediaAlturaHomens(dadosList);
                System.out.printf("Media Altura " + mediaAltura);
            } else if (op == 4) {
                int contM = metodosouFuncoes.qtMulheres(dadosList);
                System.out.printf("Quantidade de mulheres " + contM);
            } else if (op == 5) {
                metodosouFuncoes.listarUsuarios(dadosList);

            }else if(op==6){
                int posicao = metodosouFuncoes.posicaoAltura(dadosList);
                System.out.printf("A Posição da maior Altura é: " + posicao );
            }
            else {
                System.out.printf("Opção Inválida !!!");
            }
            System.out.print("\n Deseja Continuar Menu PRINCIPAL S/N :");
            continuar = ler.next();

        } while (continuar.equalsIgnoreCase("S"));

    }
}
