package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eGrandezaMedida {
    DEMANDA("01", "Demanda"),
    DEMANDA_REATIVA("02", "Demanda Reativa"),
    ENERGIA_ATIVA("03", "Energia Ativa"),
    ENERGIA_ATIVA_INJETADA("04", "Energia Ativa injetada"),
    ENERGIA_REATIVA("05", "Energia Reativa");

    private final String codigo;
    private final String descricao;

    NF3eGrandezaMedida(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eGrandezaMedida valueOfCodigo(final String codigo) {
        for (final NF3eGrandezaMedida valor : NF3eGrandezaMedida.values()) {
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
