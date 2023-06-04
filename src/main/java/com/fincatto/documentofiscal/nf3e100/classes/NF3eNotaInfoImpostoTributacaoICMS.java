package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eNotaInfoImpostoTributacaoICMS {
    TRIBUTADA_INTEGRALMENTE("00", "Tributada integralmente"),
    TRIBUTADA_COM_COBRANCA_ICMS_SUBSTITUICAO_TRIBUTARIA("10", "Tributada e com cobrança do ICMS por substituição tributária"),
    COM_REDUCAO_BASE_CALCULO("20", "Com redução de base de cálculo"),
    ISENTA("40", "Isenta"),
    DIFERIMENTO("51", "Diferimento"),
    ICMS_COBRADO_ANTERIORMENTE_SUBSTITUICAO_TRIBUTARIA("60", "ICMS cobrado anteriormente por substituição tributária"),
    OUTRAS("90", "Outras");

    private final String codigo;
    private final String descricao;

    NF3eNotaInfoImpostoTributacaoICMS(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eNotaInfoImpostoTributacaoICMS valueOfCodigo(final String codigo) {
        for (final NF3eNotaInfoImpostoTributacaoICMS valor : NF3eNotaInfoImpostoTributacaoICMS.values()) {
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
