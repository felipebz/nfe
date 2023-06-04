package com.fincatto.documentofiscal.nf3e100.classes.nota;

public enum NF3eTipoGrandeza {
    DEMANDA("1", "Demanda"),
    MONTANTE_USO_SISTEMA_DISTRIBUICAO("2", "Montante de Uso do Sistema de Distribuição"),
    RESERVA_CAPACIDADE("3", "Reserva de Capacidade"),
    ENERGIA_CONTRATADA("4", "Energia Contratada");

    private final String codigo;
    private final String descricao;

    NF3eTipoGrandeza(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eTipoGrandeza valueOfCodigo(final String codigo) {
        for (final NF3eTipoGrandeza indicador : NF3eTipoGrandeza.values()) {
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
