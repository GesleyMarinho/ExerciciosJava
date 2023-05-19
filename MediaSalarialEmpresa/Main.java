package MediaSalarialEmpresa;

import MediaMasculinaFeminina.MetodosouFuncoes;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Funcionarios> listDados = new ArrayList<>();
        Funcoes funcoes = new Funcoes();

        String cont = "S";

        do {

            System.out.printf("1- Cadastro  \n" +
                    "2- Media salarial \n" +
                    "3- Menor salario  mais o nome \n" +
                    "4- Maior Salario mais o nome \n" +
                    "5- Listar usuários e salarios \n"+
                    "Qual a opção desejada: ");
            int op = ler.nextInt();

            if (op == 1) {
                listDados = funcoes.Cadastro();

            } else if (op == 2) {
                double mediaSalario = funcoes.mediaSalario(listDados);
                System.out.printf("A Media salarial é " + mediaSalario);
            } else if (op == 3) {
                double menorSalario = funcoes.menorSalario(listDados);
                String nomeMenorSalario = funcoes.nome(listDados);
                System.out.printf("O menor Salario é " + menorSalario + " e o Seu nome é " + nomeMenorSalario);
            } else if (op == 4) {
                double maiorSalario = funcoes.maiorSalario(listDados);
                String nomeMaior = funcoes.nomeMaiorSalario(listDados);

                System.out.printf(" O Funcionário " + nomeMaior +" Tem o salário de : "+ maiorSalario);
            } else if (op==5) {

                 funcoes.listarUsuarios(listDados);
            }

            System.out.printf(" \n Deseja Continuar no Menu S/N ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("S"));


    }
}
