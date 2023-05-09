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

        do {

            System.out.printf("1- Calcular a maior Altura \n" + "2- Calcular a menor Altura \n" +
                    "3- Média de altura dos homens \n" + "4- O número de mulheres \n" + "5- listar \n");
            System.out.printf("Qual a opção desejada ? ");
            op = ler.nextInt();

            if (op == 1) {
                //dadosList = metodosouFuncoes.maiorAltura(dadosList);

                dadosList = metodosouFuncoes.maiorAltura();

            } else if (op == 2) {
                //metodosouFuncoes.menorAltura(dadosList);

                dadosList = metodosouFuncoes.menorAltura(dadosList);

            } else if (op == 3) {
                metodosouFuncoes.mediaAlturaHomens(dadosList);
            } else if (op == 4) {
                metodosouFuncoes.qtMulheres(dadosList);
            } else if (op == 5) {
                metodosouFuncoes.listarUsuarios(dadosList);

               // dadosList = metodosouFuncoes.listarUsuarios(dadosList);

            } else {
                System.out.printf("Opção Inválida !!!");
            }
            System.out.print("\n Deseja Continuar Menu PRINCIPAL S/N :");
            continuar = ler.next();

        } while (continuar.equalsIgnoreCase("S"));

    }
}
