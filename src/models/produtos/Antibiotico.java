package models.produtos;

import models.Produto;

public class Antibiotico extends Produto {

    public Antibiotico() {
    }

    @Override
    public void setPrecoCompra(double precoCompra){
        super.setPrecoCompra(12.59);
    }

    @Override
    public void setPrecoVenda(double precoVenda){
        super.setPrecoVenda(25.18);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
