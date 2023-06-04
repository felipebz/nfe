package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eTipoPostoTarifarioCompleto {
    UNICO("0", "Único/Não se aplica"),
    PONTA("1", "Ponta"),
    FORA_PONTA("2", "Fora Ponta"),
    INTERMEDIARIO("3", "Intermediário"),
    PONTA_RESERVADO("4", "Ponta Reservado"),
    FORA_PONTA_RESERVADO("5", "Fora ponta Reservado"),
    INTERMEDIARIO_RESERVADO("6", "Intermediário Reservado"),
    RESERVADO("7", "Reservado");

    private final String codigo;
    private final String descricao;

    NF3eTipoPostoTarifarioCompleto(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoPostoTarifarioCompleto valueOfCodigo(final String codigo) {
        for (final NF3eTipoPostoTarifarioCompleto valor : NF3eTipoPostoTarifarioCompleto.values()) {
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
