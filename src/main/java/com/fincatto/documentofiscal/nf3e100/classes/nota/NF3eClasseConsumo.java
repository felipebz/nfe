package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eClasseConsumo {
    COMERCIAL("01", "Comercial"),
    CONSUMO_PROPRIO("02", "Consumo Próprio"),
    ILUMINACAO_PUBLICA("03", "Iluminação Pública"),
    INDUSTRIAL("04", "Industrial"),
    PODER_PUBLICO("05", "Poder Público"),
    RESIDENCIAL("06", "Residencial"),
    RURAL("07", "Rural"),
    SERVICO_PUBLICO("08", "Serviço Público");

    private final String codigo;
    private final String descricao;

    NF3eClasseConsumo(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eClasseConsumo valueOfCodigo(final String codigo) {
        for (final NF3eClasseConsumo indicador : NF3eClasseConsumo.values()) {
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
