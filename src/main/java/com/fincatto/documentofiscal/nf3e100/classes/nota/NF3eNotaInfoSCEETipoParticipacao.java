package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eNotaInfoSCEETipoParticipacao {
    MINI_OU_MICROGERACAO("1", "Mini ou microgeração (somente uma UC)"),
    MULTIPLAS_UNIDADES_CONSUMIDORAS("2", "Múltiplas unidades consumidoras (condomínio em área definida)"),
    AUTOCONSUMO_REMOTO("3", "Autoconsumo remoto"),
    GERACAO_COMPARTILHADA("4", "Geração compartilhada (consórcio ou cooperativa)"),
    MISTA("5", "Mista (utilizar quando enquadrado em mais de um tipo de participação)");

    private final String codigo;
    private final String descricao;

    NF3eNotaInfoSCEETipoParticipacao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eNotaInfoSCEETipoParticipacao valueOfCodigo(final String codigo) {
        for (final NF3eNotaInfoSCEETipoParticipacao valor : NF3eNotaInfoSCEETipoParticipacao.values()) {
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
