package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eTipoAtoANELL {
    REH("1", "Resolução homologatória"),
    DESPACHO("2", "Despacho"),
    REN("3", "Resolução Normativa");

    private final String codigo;
    private final String descricao;

    NF3eTipoAtoANELL(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoAtoANELL valueOfCodigo(final String codigo) {
        for (final NF3eTipoAtoANELL valor : NF3eTipoAtoANELL.values()) {
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
