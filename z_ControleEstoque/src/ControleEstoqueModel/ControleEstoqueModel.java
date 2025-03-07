package ControleEstoqueModel;

public class ControleEstoqueModel {
    private String nome;
    private int codProd;
    private int quantidade;
    private double precoCusto;
    private double precoVenda;

    public ControleEstoqueModel(String nome, int codProd, int quantidade, Double precoCusto, double precoVenda) {

        this.codProd = codProd;
        this.nome = nome;

        this.quantidade = quantidade;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public ControleEstoqueModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int entradaEstoque(int quantidade) {
        this.quantidade += quantidade;

        return  this.quantidade;
    }

    public int saidaEstoque(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Erro: Estoque insuficiente!");
            return this.quantidade; // Não altera o estoque se não houver quantidade suficiente
        }
        this.quantidade -= quantidade;
        return this.quantidade;
    }

    public double calculoPrecoVenda(double precoCusto) {

        return precoCusto * 1.10;
    }

    public void mensagem(String mensagem){

        System.out.println(mensagem);

    }


}
