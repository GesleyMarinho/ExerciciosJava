package Elevador;

public class Elevador {
    private int andarAtual;
    private final int totalAndares;
    private final int terreo;
    private final int capacidade;
    private int qtPessoas;

    public Elevador() {
        this.andarAtual = 0;
        this.totalAndares = 10;
        this.terreo = 0;
        this.capacidade = 20;
        this.qtPessoas = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQtPessoas() {
        return qtPessoas;
    }

    public void setQtPessoas(int qtPessoas) {
        this.qtPessoas = qtPessoas;
    }


    public void subirElevador(int i) {


        if (i < 0 || i > 10) {
            System.out.println("Erro, Valor inexistente !!!");
        } else {
            setAndarAtual(getAndarAtual() + i); //+1 vai virar um parâmetro
        }
    }

    public void desceElevador(int i) {

        if (i > 10 || i < 0) {
            System.out.println("Erro, Valor inexistente !!!");
            return;
        } else {
            setAndarAtual(getAndarAtual() - i); // -1 vai virar parâmetro
        }
    }

    public void verificarAndar() {

        if (getAndarAtual() < 0 || getAndarAtual() > 10) {
            System.out.println("Erro vc está Digitou um andar Inválido");
            return;
        }
        System.out.println("Você está no Andar : " + getAndarAtual());
    }

    public void descerDoElevador(int i) {

        if (i > this.getQtPessoas()) {
            System.out.println("Erro, quantidade de pessoas para sair é maior do que está no elevador " + i);
            System.out.println("Quantidade atual " + getQtPessoas());
        } else {
            setQtPessoas(getQtPessoas() - i);
            if (getQtPessoas() <= 0) {
                System.out.println("tem " + getQtPessoas() + " Para descer do elevador ");
            } else {
                System.out.println("Desceu " + i + " Pessoas do elevador e abordo ainda temos " + getQtPessoas() + " Pessoas ");
            }
        }

    }

    public void entrarNoElevador(int i) {
        setQtPessoas(getQtPessoas() + i);

        if (getQtPessoas() <= this.capacidade) {

            System.out.println("Capacidade Máxima de " + this.capacidade + " Pessoas, e entrou " + getQtPessoas() + " Pessoas ");
        } else if (getQtPessoas() > this.capacidade) {
            i = getQtPessoas() - capacidade;
            System.out.println("Capacidade Atingidade " + this.capacidade + " FAVOR " + i + " PESSOA OU PESSOAS ESPERAR !!! ");
            setQtPessoas(capacidade);
        }
    }

    public void qtPessoaselevador() {

        System.out.println("Tem " + getQtPessoas() + " Pessoas no ELEVADOR");
    }

}
