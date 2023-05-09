package MediaMasculinaFeminina;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosouFuncoes {

    ArrayList<Main> dadosList = new ArrayList<>();

    public ArrayList<Dados> inserirDados() {
        Scanner ler = new Scanner(System.in);

        ArrayList<Dados> dadosList = new ArrayList<>();
        String cont = "S";

        do {

            Dados dados = new Dados();

            System.out.print("Digite seu Sexo: ");
            dados.setSexo(ler.next());
            System.out.print("Digite sua Altura: ");
            dados.setAltura(ler.nextDouble());

            dadosList.add(dados);

            System.out.print("Deseja Continuar Preenchimento a AGENDA S/N :");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));
        return dadosList;

    }

    public void listarUsuarios(List<Dados> dadosList) {
        //for (int i = 0; i < dadosList.size(); i++) {
        for (Dados dados : dadosList) {

            System.out.printf("Altura " + dados.getAltura() + " Sexo: " + dados.getSexo());
        }

    }

    public ArrayList<Dados> maiorAltura(List<Dados> dadosList) {

        double maiorAltura = 0;

        for (int i = 0; i <= dadosList.size(); i++) {

            if (dadosList.get(i).getAltura() > maiorAltura) {

                maiorAltura = dadosList.get(i).getAltura();
            }

        }
        System.out.printf("Maior Altura " + maiorAltura);


    }

    public ArrayList<Dados> menorAltura(List<Dados> dadosList) {

        double menorAltura = 9999;

        for (int i = 0; i <= dadosList.size(); i++) {

            if (dadosList.get(i).getAltura() < menorAltura) {

                menorAltura = dadosList.get(i).getAltura();
            }

        }
        System.out.printf(" Menor Altura " + menorAltura);

    }

    public void mediaAlturaHomens(List<Dados> dadosList) {
        int contM = 0;
        double mediaaltura = 0, somaAltura = 0;
        for (int i = 0; i < dadosList.size(); i++) {
            if (dadosList.get(i).getSexo().equalsIgnoreCase("M")) {
                contM++;
                somaAltura = somaAltura + dadosList.get(i).getAltura();

            }

            mediaaltura = somaAltura / contM;

        }
        System.out.printf("Media de Altura Homens " + mediaaltura);

    }

    public void qtMulheres(List<Dados> dadosList) {
        int contM = 0;

        for (int i = 0; i <= dadosList.size(); i++) {

            if (dadosList.get(i).getSexo().equalsIgnoreCase("F")) {
                contM++;
            }

        }

        System.out.printf("Quantidade de mulheres " + contM);

    }
}
