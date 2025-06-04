package enums;

import utilities.FormatarTexto;

public enum TipoNegocio {
    COMPRA,
    VENDA;

    @Override
    public String toString() {
        return FormatarTexto.capitalizar(name());
    }
}