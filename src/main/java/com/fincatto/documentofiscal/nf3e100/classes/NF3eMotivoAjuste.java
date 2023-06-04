package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eMotivoAjuste {
    ERRO_LEITURA("1", "Erro de Leitura"),
    ERRO_PRECO_TARIFA("2", "Erro de Preço ou Erro de Tarifa"),
    DECISAO_JUDICIAL("3", "Decisão Judicial"),
    ERRO_CADASTRAL("4", "Erro Cadastral"),
    ERRO_TRIBUTACAO("5", "Erro de Tributação");

    private final String codigo;
    private final String descricao;

    NF3eMotivoAjuste(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eMotivoAjuste valueOfCodigo(final String codigo) {
        for (final NF3eMotivoAjuste indicador : NF3eMotivoAjuste.values()) {
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
