package MediaSalarialEmpresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {

    ArrayList<Main> listDados = new ArrayList<>();
    double menor = 999999;
    double maior = 0;

    public ArrayList<Funcionarios> Cadastro() {

        Scanner ler = new Scanner(System.in);
        String cont = "S";

        ArrayList<Funcionarios> listDados = new ArrayList<>();


        do {

            Funcionarios funcionarios = new Funcionarios();

            System.out.printf("Qual o nome do funcionário: ");
            funcionarios.setNome(ler.next());

            System.out.printf("Qual o salario do Funcionário: ");
            funcionarios.setSalario(ler.nextDouble());

            listDados.add(funcionarios);

            System.out.printf("Deseja Continuar S/N: ");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));
        return listDados;
    }

    public void listarUsuarios(List<Funcionarios> listDados) {

        if (listDados.isEmpty()) {
            System.out.printf("Lista Vazia !!!!");
        } else {
            for (int i = 0; i < listDados.size(); i++) {
                System.out.printf("Nome: " + listDados.get(i).getNome() + " Salario: " + listDados.get(i).getSalario() + "Reais \n");
            }
        }

    }

    public Double mediaSalario(List<Funcionarios> listDados) {

        double somaSalarios = 0;


        if (listDados.isEmpty()) {
            System.out.printf("Lista Vazia !!!!");
        } else {
            for (int i = 0; i < listDados.size(); i++) {

                somaSalarios = somaSalarios + listDados.get(i).getSalario();

            }
        }

        return somaSalarios = somaSalarios / listDados.size();

    }

    public Double menorSalario(List<Funcionarios> listDados) {

        String nome = null;
        if (listDados.isEmpty()) {
            System.out.printf("Lista Vazia !!!!");
        } else {

            for (int i = 0; i < listDados.size(); i++) {

                if (listDados.get(i).getSalario() < menor) {
                    menor = listDados.get(i).getSalario();
                    nome = listDados.get(i).getNome();
                }
            }
        }

        return menor;


    }

    public String nome(List<Funcionarios> listDados) {
        String nome = null;

        if (listDados.isEmpty()) {
            System.out.printf("Lista Vazia !!!!");
        } else {
            for (int i = 0; i < listDados.size(); i++) {
                if (listDados.get(i).getSalario() == menor) {

                    nome = listDados.get(i).getNome();
                }
            }
        }

        return nome;
    }

    public double maiorSalario(List<Funcionarios> listDados) {
        if (listDados.isEmpty()) {
            System.out.printf("Lista Vazia !!!!");
        } else {
            for (int i = 0; i < listDados.size(); i++) {
                if (listDados.get(i).getSalario() > maior) {
                    maior = listDados.get(i).getSalario();
                }
            }
        }
        return maior;

    }

    public String nomeMaiorSalario(List<Funcionarios> listDados) {
        String nome = null;

        if (listDados.isEmpty()) {
            System.out.printf("Lista Vazia !!!!");
        } else {
            for (int i = 0; i < listDados.size(); i++) {
                if (listDados.get(i).getSalario() == maior) {
                    nome = listDados.get(i).getNome();
                }
            }
        }

        return nome;
    }
}
