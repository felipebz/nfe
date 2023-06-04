package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eFinalidade {

    NORMAL("1", "Normal"),
    SUBSTITUICAO("2", "Substituição"),
    AJUSTE("3", "Normal com ajuste");

    private final String codigo;
    private final String descricao;

    NF3eFinalidade(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static NF3eFinalidade valueOfCodigo(final String codigo) {
        for (final NF3eFinalidade tipo : NF3eFinalidade.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}
