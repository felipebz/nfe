package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eFonteEnergia {
    HIDRAULICA("1", "Hidráulica"),
    SOLAR("2", "Solar"),
    EOLICA("3", "Eólica"),
    TERMICA("4", "Térmica"),
    HIBRIDA("5", "Hibrida");

    private final String codigo;
    private final String descricao;

    NF3eFonteEnergia(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eFonteEnergia valueOfCodigo(final String codigo) {
        for (final NF3eFonteEnergia valor : NF3eFonteEnergia.values()) {
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
