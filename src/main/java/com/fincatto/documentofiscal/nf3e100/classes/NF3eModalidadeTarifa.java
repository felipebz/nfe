package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eModalidadeTarifa {
    CONVENCIONAL_MONOMIA("01", "Convencional Monômia"),
    CONVENCIONAL_BINOMIA("02", "Convencional Binômia"),
    HORARIA_AZUL("03", "Horária Azul"),
    HORARIA_AZUL_APE("04", "Horária Azul APE"),
    HORARIA_VERDE("05", "Horária Verde"),
    HORARIA_VERDE_APE("06", "Horária Verde APE"),
    HORARIA_BRANCA("07", "Horária Branca"),
    PRE_PAGAMENTO("08", "Pré-pagamento"),
    GERACAO("09", "Geração"),
    DISTRIBUICAO("10", "Distribuição");

    private final String codigo;
    private final String descricao;

    NF3eModalidadeTarifa(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eModalidadeTarifa valueOfCodigo(final String codigo) {
        for (final NF3eModalidadeTarifa indicador : NF3eModalidadeTarifa.values()) {
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
