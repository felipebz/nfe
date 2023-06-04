package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eBandeira {
    VERDE("1", "Verde"),
    AMARELA("2", "Amarela"),
    VERMELHA_PATAMAR_1("3", "Vermelha patamar 1"),
    VERMELHA_PATAMAR_2("4", "Vermelha patamar 2"),
    ESCASSEZ_HIDRICA("5", "Escassez Hidrica");

    private final String codigo;
    private final String descricao;

    NF3eBandeira(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eBandeira valueOfCodigo(final String codigo) {
        for (final NF3eBandeira valor : NF3eBandeira.values()) {
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
