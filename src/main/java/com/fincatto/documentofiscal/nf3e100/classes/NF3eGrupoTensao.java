package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eGrupoTensao {
    A1("01", "Alta Tensão (230kV ou mais)"),
    A2("02", "Alta Tensão (88 a 138kV)"),
    A3("03", "Alta Tensão (69kV)"),
    A3a("04", "Alta Tensão (30kV a 44kV)"),
    A4("05", "Alta Tensão (2,3kV a 25kV)"),
    AS("06", "Alta Tensão Subterrâneo"),
    B1("07", "Residencial"),
    B1_BAIXA_RENDA("08", "Residencial Baixa Renda"),
    B2("09", "Rural"),
    B2_COOPERATIVA("10", "Cooperativa de Eletrificação Rural"),
    B2_IRRIGACAO("11", "Serviço Público de Irrigação"),
    B3("12", "Demais Classes"),
    B4a("13", "Iluminação Pública - rede de distribuição"),
    B4b("14", "Iluminação Pública - bulbo de lâmpada");

    private final String codigo;
    private final String descricao;

    NF3eGrupoTensao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eGrupoTensao valueOfCodigo(final String codigo) {
        for (final NF3eGrupoTensao indicador : NF3eGrupoTensao.values()) {
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
