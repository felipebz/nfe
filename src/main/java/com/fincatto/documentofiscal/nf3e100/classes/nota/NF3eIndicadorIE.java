package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eIndicadorIE {

    CONTRIBUINTE_ICMS("1", "Contribuinte ICMS"),
    CONTRIBUINTE_ISENTO_INSCRICAO_CONTRIBUINTES_ICMS("2", "Contribuinte isento inscrição contribuintes ICMS"),
    NAO_CONTRIBUINTE("9", "Não contribuinte");

    private final String codigo;
    private final String descricao;

    NF3eIndicadorIE(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eIndicadorIE valueOfCodigo(final String codigo) {
        for (final NF3eIndicadorIE indicador : NF3eIndicadorIE.values()) {
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
