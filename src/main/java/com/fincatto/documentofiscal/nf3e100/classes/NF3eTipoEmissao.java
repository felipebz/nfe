package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eTipoEmissao {

    EMISSAO_NORMAL("1", "Normal"),
    CONTINGENCIA_OFFLINE("2", "Contingência Off-line"),;

    private final String codigo;
    private final String descricao;

    NF3eTipoEmissao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static NF3eTipoEmissao valueOfCodigo(final String codigo) {
        for (final NF3eTipoEmissao tipo : NF3eTipoEmissao.values()) {
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
