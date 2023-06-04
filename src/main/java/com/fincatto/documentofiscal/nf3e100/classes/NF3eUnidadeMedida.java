package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eUnidadeMedida {
    KW("1", "kW"),
    KWH("2", "kWh"),
    KVAR("3", "kVAr"),
    KVARH("4", "kVArh"),
    UN("5", "UN");

    private final String codigo;
    private final String descricao;

    NF3eUnidadeMedida(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eUnidadeMedida valueOfCodigo(final String codigo) {
        for (final NF3eUnidadeMedida valor : NF3eUnidadeMedida.values()) {
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
