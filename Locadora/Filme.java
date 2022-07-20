package Locadora;

import static Locadora.Cliente.cliente;

public class Filme {
    static Filme[] filme = new Filme[4];
    private String titulo;
    private int classificacao;
    private boolean alugado;
    private Cliente nomeCliente;

    public Filme(String titulo, int classificacao, boolean alugado, Cliente nomeCliente) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.alugado = alugado;
        this.nomeCliente = nomeCliente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }


    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public String filmeDetalhes() {
        return "Filme{" +
                "titulo = '" + titulo + '\'' +
                ", classificacao = " + classificacao +
                ", alugado = " + alugado +
                ", nomeCliente = " + nomeCliente.getNome() +
                '}';
    }

    public void filmeAlugado() {
        setAlugado(true);
    }

    public static void cadastrarFilme() {


        filme[0] = new Filme("OS Vigandores", 16, true, cliente[0]);
        filme[1] = new Filme("Yesterday", 14, false, cliente[1]);
        filme[2] = new Filme("One Pice filme Z", 10, true, cliente[2]);
        filme[3] = new Filme("Deadpool 2 ", 18, false, cliente[0]);

    }

    public static void listarFilme() {
        for (int i = 0; i < filme.length; i++) {
            System.out.println(filme[i].filmeDetalhes());
        }
    }
}
