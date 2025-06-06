package models.produtos;

import models.Produto;

public class AlcoolEmGel extends Produto {

    public AlcoolEmGel() {
    }

    @Override
    public void setPrecoCompra(double precoCompra){
        super.setPrecoCompra(3.12);
    }

    @Override
    public void setPrecoVenda(double precoVenda){
        super.setPrecoVenda(6.25);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
