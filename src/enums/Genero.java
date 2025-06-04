package enums;

import utilities.FormatarTexto;

public enum Genero {
    MASCULINO,
    FEMININO,
    OUTRO;

    @Override
    public String toString() {
        return FormatarTexto.capitalizar(name());
    }
}