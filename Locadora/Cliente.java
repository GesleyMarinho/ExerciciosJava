package Locadora;

public class Cliente {
    static Cliente[] cliente = new Cliente[3];
    private String nome;
    private int idade;
    private boolean bloqueado;

    public Cliente(String nome, int idade, boolean bloqueado) {
        this.nome = nome;
        this.idade = idade;
        this.bloqueado = bloqueado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String clienteDetalhes() {
        return "Cliente{" +
                " nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", bloqueado = " + bloqueado +
                '}';
    }

    public void bloquearCliente() {

        setBloqueado(true);

    }

    public static void cadastrarCliente(){

        cliente[0] = new Cliente("Gesley", 30, false);
        cliente[1] = new Cliente("Debora", 28, true);
        cliente[2] = new Cliente("Danilo", 10, false);
    }

    public static void listarCliente(){
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(cliente[i].clienteDetalhes());

        }
    }
}
