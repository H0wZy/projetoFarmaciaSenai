package models.produtos;

import models.Produto;

public class Hidratante extends Produto {

    public Hidratante() {
    }

    @Override
    public void setPrecoCompra(double precoCompra) {
        super.setPrecoCompra(7);
    }

    @Override
    public void setPrecoVenda(double precoVenda) {
        super.setPrecoVenda(14);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
