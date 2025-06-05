package models.produtos;

import models.Produto;

public class FioDental extends Produto {


    public FioDental() {
        super();
    }

    @Override
    public void setPrecoCompra(double precoCompra) {
        super.setPrecoCompra(2.50);
    }

    @Override
    public void setPrecoVenda(double precoVenda) {
        super.setPrecoVenda(5);
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
