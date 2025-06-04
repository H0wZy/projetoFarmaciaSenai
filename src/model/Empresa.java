package model;

import java.util.List;

public class Empresa {
    private String nome;
    private double caixaTotal;
    private List<Setor> setores;
    private List<Produto> produtos;
    private List<Transportadora> transportadoras;

    public Empresa(String nome, double caixaTotal, List<Setor> setores, List<Produto> produtos, List<Transportadora> transportadoras) {
        this.nome = nome;
        this.caixaTotal = caixaTotal;
        this.setores = setores;
        this.produtos = produtos;
        this.transportadoras = transportadoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCaixaTotal() {
        return caixaTotal;
    }

    public void setCaixaTotal(double caixaTotal) {
        this.caixaTotal = caixaTotal;
    }

    public List<Setor> getSetores() {
        return setores;
    }

    public void setSetores(List<Setor> setores) {
        this.setores = setores;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Transportadora> getTransportadoras() {
        return transportadoras;
    }

    public void setTransportadoras(List<Transportadora> transportadoras) {
        this.transportadoras = transportadoras;
    }

    // public double calcular(){
    //     return calc;
    // }

    
}
