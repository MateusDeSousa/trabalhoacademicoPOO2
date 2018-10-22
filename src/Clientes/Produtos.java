package Clientes;

public class Produtos {
    private String nome;
    private int quantidade;
    private double valorUnidade;

    public Produtos(String nome, int quantidade, double valorUnidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void removerQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }
}
