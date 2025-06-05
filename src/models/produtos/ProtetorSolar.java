package models.produtos;

import models.Produto;

public class ProtetorSolar extends Produto {

    public ProtetorSolar() {
    }

    @Override
    public void setPrecoCompra(double precoCompra) {
        super.setPrecoCompra(59.90);
    }

    @Override
    public void setPrecoVenda(double precoVenda) {
        super.setPrecoVenda(119.80);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
