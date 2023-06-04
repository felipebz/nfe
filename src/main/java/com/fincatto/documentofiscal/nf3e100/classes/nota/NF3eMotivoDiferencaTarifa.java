package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eMotivoDiferencaTarifa {
    DECISAO_JUDICIAL("01", "Decisão judicial"),
    DECISAO_DISTRIBUIDORA("02", "Decisão da distribuidora"),
    DESCONTO_TARIFARIO("03", "Desconto Tarifário"),
    REAJUSTE_TARIFARIO("04", "Reajuste tarifário");

    private final String codigo;
    private final String descricao;

    NF3eMotivoDiferencaTarifa(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eMotivoDiferencaTarifa valueOfCodigo(final String codigo) {
        for (final NF3eMotivoDiferencaTarifa valor : NF3eMotivoDiferencaTarifa.values()) {
            if (valor.getCodigo().equals(codigo)) {
                return valor;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}
