package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eTipoAjuste {
    ITEM_SUBSTITUIDO("1", "Item a ser substituído"),
    ITEM_SUBSTITUICAO("2", "Item de substituição"),
    ITEM_ELIMINADO("3", "Item a ser eliminado"),
    ITEM_INCLUIDO("4", "Item a ser incluído referente a NF3e anterior");

    private final String codigo;
    private final String descricao;

    NF3eTipoAjuste(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoAjuste valueOfCodigo(final String codigo) {
        for (final NF3eTipoAjuste valor : NF3eTipoAjuste.values()) {
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
