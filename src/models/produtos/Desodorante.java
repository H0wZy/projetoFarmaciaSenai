package models.produtos;

import models.Produto;

public class Desodorante extends Produto {

    public Desodorante() {
    }

    @Override
    public void setPrecoCompra(double precoCompra) {
        super.setPrecoCompra(6);
    }

    @Override
    public void setPrecoVenda(double precoVenda) {
        super.setPrecoVenda(12);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
