package models;

import java.time.LocalDate;

public class VendasProgramadas {
    LocalDate dataVenda;
    double valorVenda;
    double custoProduto;

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public double getLucro(){
        return valorVenda - custoProduto;
    }

    public int getAno(){
        return dataVenda.getYear();
    }

    public int getMes(){
        return dataVenda.getMonthValue();
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(double custoProduto) {
        this.custoProduto = custoProduto;
    }
}
