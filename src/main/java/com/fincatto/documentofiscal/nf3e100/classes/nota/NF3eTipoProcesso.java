package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eTipoProcesso {
    SEFAZ("0", "SEFAZ"),
    JUSTICA_FEDERAL("1", "Justiça Federal"),
    JUSTICA_ESTADUAL("2", "Justiça Estadual");

    private final String codigo;
    private final String descricao;

    NF3eTipoProcesso(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoProcesso valueOfCodigo(final String codigo) {
        for (final NF3eTipoProcesso valor : NF3eTipoProcesso.values()) {
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
