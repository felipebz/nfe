package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eMotivoNaoLeitura {
    CONSUMIDOR("1", "Consumidor"),
    DISTRIBUIDORA("2", "Distribuidora"),
    INDEPENDENTE("3", "Independente do Consumidor e distribuidora");

    private final String codigo;
    private final String descricao;

    NF3eMotivoNaoLeitura(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eMotivoNaoLeitura valueOfCodigo(final String codigo) {
        for (final NF3eMotivoNaoLeitura valor : NF3eMotivoNaoLeitura.values()) {
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
