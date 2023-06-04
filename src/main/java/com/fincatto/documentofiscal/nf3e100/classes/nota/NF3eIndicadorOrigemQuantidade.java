package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eIndicadorOrigemQuantidade {
    MEDIA("1", "Media"),
    MEDIDO("2", "Medido"),
    CONTRATADA("3", "Contratada"),
    CALCULADA("4", "Calculada"),
    CUSTO_DE_DISPONIBILIDADE("5", "Custo de disponibilidade"),
    SEM_QUANTIDADE("6", "Sem quantidade");

    private final String codigo;
    private final String descricao;

    NF3eIndicadorOrigemQuantidade(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eIndicadorOrigemQuantidade valueOfCodigo(final String codigo) {
        for (final NF3eIndicadorOrigemQuantidade valor : NF3eIndicadorOrigemQuantidade.values()) {
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
