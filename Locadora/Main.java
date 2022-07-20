package Locadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        Cliente cliente;
        Filme filme;

        Cliente.cadastrarCliente();
        Cliente.listarCliente();

        Filme.cadastrarFilme();
        Filme.listarFilme();


    }
}
