package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eNotaInfoImpostoTributacaoPIS {
    TRIBUTAVEL_ALIQUOTA_BASICA("01", "Tributável com alíquota básica"),
    TRIBUTAVEL_ALIQUOTA_DIFERENCIADA("02", "Tributável com alíquota diferenciada"),
    TRIBUTAVEL_ALIQUOTA_ERRO("06", "Tributável com alíquota erro"),
    OPERACAO_ISENTA_CONTRIBUICAO("07", "Operação isenta de contribuição"),
    OPERACAO_SEM_INCIDENCIA_CONTRIBUICAO("08", "Operação sem incidência da contribuição"),
    OPERACAO_COM_SUSPENSAO_CONTRIBUICAO("09", "Operação com suspensão da contribuição"),
    OUTRAS_OPERACOES_SAIDA("49", "Outras operações de saída");

    private final String codigo;
    private final String descricao;

    NF3eNotaInfoImpostoTributacaoPIS(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eNotaInfoImpostoTributacaoPIS valueOfCodigo(final String codigo) {
        for (final NF3eNotaInfoImpostoTributacaoPIS valor : NF3eNotaInfoImpostoTributacaoPIS.values()) {
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
