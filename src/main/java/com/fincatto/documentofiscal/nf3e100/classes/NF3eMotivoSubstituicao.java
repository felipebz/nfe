package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eMotivoSubstituicao {
    ERRO_LEITURA("01", "Erro de Leitura"),
    ERRO_PRECO_TARIFA("02", "Erro de Preço ou Erro de Tarifa"),
    DECISAO_JUDICIAL("03", "Decisão Judicial"),
    ERRO_CADASTRAL("04", "Erro Cadastral"),
    ERRO_TRIBUTACAO("05", "Erro de Tributação");

    private final String codigo;
    private final String descricao;

    NF3eMotivoSubstituicao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eMotivoSubstituicao valueOfCodigo(final String codigo) {
        for (final NF3eMotivoSubstituicao indicador : NF3eMotivoSubstituicao.values()) {
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
