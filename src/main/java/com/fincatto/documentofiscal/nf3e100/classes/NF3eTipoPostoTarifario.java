package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eTipoPostoTarifario {
    UNICO("0", "Único"),
    PONTA("1", "Ponta"),
    FORA_PONTA("2", "Fora Ponta"),
    INTERMEDIARIO("3", "Intermediário");

    private final String codigo;
    private final String descricao;

    NF3eTipoPostoTarifario(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoPostoTarifario valueOfCodigo(final String codigo) {
        for (final NF3eTipoPostoTarifario indicador : NF3eTipoPostoTarifario.values()) {
            if (indicador.getCodigo().equals(codigo)) {
                return indicador;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}
