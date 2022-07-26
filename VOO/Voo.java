package VOO;


import java.util.Scanner;

public class Voo {


    boolean[] lugares = new boolean[5];
    private int numeroVoo;

    public Voo(int numeroVoo) {
        this.numeroVoo = numeroVoo;

    }


    //proximoLivre - retorna o número da próxima cadeira livre
    public int proximoLivre() {

        for (int i = 0; i < lugares.length; i++) {

            if (!lugares[i]) {
                return i;
            }
        }

        // Caso não localizar uma posoção valida retorne -1
        return -1;
    }

    //verifica - verifica se o número da cadeira recebido como parâmetro está ocupada
    public boolean verifica(int numeroCadeira) {
        return lugares[numeroCadeira];
    }

    //ocupa - ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna
    //verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso
    //caso contrário

    public boolean ocupa(int numeroCadeira) {
        if (lugares[numeroCadeira]) {
            return false;
        }

        lugares[numeroCadeira] = true;
        return true;
    }

    //vagas retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
    public int vagas() {
        int contador = 0;
        for (int i = 0; i < lugares.length; i++) {
            if (!lugares[i]) {
                contador++;
            }
        }
        return contador;
    }

    //getVoo retorna o número do vôo
    public int getVoo() {

        return numeroVoo;
    }

}
