package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eTipoFase {
    MONOFASICO("1", "Monofásico"),
    BIFASICO("2", "Bifásico"),
    TRIFASICO("3", "Trifásico");

    private final String codigo;
    private final String descricao;

    NF3eTipoFase(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoFase valueOfCodigo(final String codigo) {
        for (final NF3eTipoFase indicador : NF3eTipoFase.values()) {
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
