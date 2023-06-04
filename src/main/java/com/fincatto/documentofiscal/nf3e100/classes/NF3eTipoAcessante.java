package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eTipoAcessante {
    GERADOR("0", "Gerador"),
    CATIVO("1", "Cativo"),
    LIVRE("2", "Livre"),
    PARCIALMENTE_LIVRE("3", "Parcialmente Livre"),
    CONSUMIDOR_ESPECIAL("4", "Consumidor Especial"),
    PARCIALMENTE_ESPECIAL("5", "Parcialmente Especial"),
    COMUNHAO("6", "Comunhão"),
    SUPRIMENTO("7", "Suprimento"),
    DISTRIBUIDORA("8", "Distribuidora");

    private final String codigo;
    private final String descricao;

    NF3eTipoAcessante(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoAcessante valueOfCodigo(final String codigo) {
        for (final NF3eTipoAcessante indicador : NF3eTipoAcessante.values()) {
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
