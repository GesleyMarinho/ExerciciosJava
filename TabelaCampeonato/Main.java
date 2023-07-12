package TabelaCampeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Time time = new Time();
        Tabela tabela = new Tabela();
        List<Tabela> resultados = new ArrayList<>();

        List<Time> nomeTimesList = new ArrayList<>();

        String cont = "S";

        do {
            System.out.printf("1- Cadastrar Times\n" +
                    "2- Remover Time\n" +
                    "3- Listar Times\n" +
                    "4- Editar Time \n" +
                    "Qual a opção desejada: ");
            int op = ler.nextInt();

            if (op == 1) {
                nomeTimesList = time.adicionarTime();
            } else if (op == 2) {
                System.out.printf("Qual o time deseja remover ");
                String removerTime = ler.next();
                time.removerTimes(nomeTimesList, removerTime);
            } else if (op == 3) {
                time.listarTimes(nomeTimesList);
            } else if (op == 4) {
                // Editar Times
                // Melhorar essa idea de editar o time
            } else {
                // opção inválida
            }


            System.out.printf("\nDeseja Continuar no Menu Principal (S/N): ");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));

        tabela.gerarTabelaCampeonato(nomeTimesList);

    }
}
