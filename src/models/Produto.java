package models;

public class Produto {
    private String nome;
    private double precoCompra;
    private double precoVenda;
    private int quantidadeEstoque;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nPreço compra: " + getPrecoCompra()
                + "\nPreço venda: " + getPrecoVenda() + "\nQuantidade estoque: " + getQuantidadeEstoque();
    }




}
