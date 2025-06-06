package enums;

import utilities.FormatarTexto;

public enum TipoSetor {
    GERENCIA_FILIAL,
    ATENDIMENTO_CLIENTE,
    GESTAO_PESSOAS,
    FINANCEIRO,
    VENDAS,
    ALMOXARIFADO,
    TRANSPORTADORAS;
    
    @Override
    public String toString() {
        return FormatarTexto.capitalizar(name());
    }
}