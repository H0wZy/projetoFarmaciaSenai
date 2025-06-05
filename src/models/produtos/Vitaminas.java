package models.produtos;

import models.Produto;

public class Vitaminas extends Produto {

    public Vitaminas() {
    }

    @Override
    public void setPrecoCompra(double precoCompra) {
        super.setPrecoCompra(25);
    }

    @Override
    public void setPrecoVenda(double precoVenda) {
        super.setPrecoVenda(50);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
