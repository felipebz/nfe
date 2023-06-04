package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eTipoTarifa {
    TE("1", "TE"),
    TUSD("2", "TUSD");

    private final String codigo;
    private final String descricao;

    NF3eTipoTarifa(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoTarifa valueOfCodigo(final String codigo) {
        for (final NF3eTipoTarifa valor : NF3eTipoTarifa.values()) {
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
