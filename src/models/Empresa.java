package models;

import interfaces.ICalculavel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements ICalculavel {
    private String nome;
    private double caixaTotal;
    private List<Setor> setores;
    private List<Produto> produtos;
    private List<Transportadora> transportadoras;
    private List<VendasProgramadas> vendasProgramadas;

    public Empresa(String nome, List<Setor> setores, List<Produto> produtos, List<Transportadora> transportadoras) {
        this.nome = nome;
        this.caixaTotal = 200000.00;
        this.setores = setores;
        this.produtos = produtos;
        this.transportadoras = transportadoras;
        this.vendasProgramadas = new ArrayList<>();
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



    
}
