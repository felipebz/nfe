package com.fincatto.documentofiscal.nf3e100.classes;

public enum NF3eSubclasseConsumo {
    RESIDENCIAL("01", "Residencial"),
    RESIDENCIAL_BAIXA_RENDA("02", "Residencial baixa renda"),
    RESIDENCIAL_BAIXA_RENDA_INDIGENA("03", "Residencial baixa renda indígena"),
    RESIDENCIAL_BAIXA_RENDA_QUILOMBOLA("04", "Residencial baixa renda quilombola"),
    RESIDENCIAL_BAIXA_RENDA_BENEFICIO_PRESTACAO_CONTINUADA("05", "Residencial baixa renda benefício de prestação continuada da assistência social"),
    RESIDENCIAL_BAIXA_RENDA_MULTIFAMILIAR("06", "Residencial baixa renda multifamiliar"),
    COMERCIAL("07", "Comercial"),
    SERVICOS_TRANSPORTE_EXCETO_TRACAO_ELETRICA("08", "Serviços de transporte, exceto tração elétrica"),
    SERVICOS_COMUNICACAO_TELECOMUNICACAO("09", "Serviços de comunicação e telecomunicação"),
    ASSOCIACAO_ENTIDADES_FILANTROPICAS("10", "Associação e entidades filantrópicas"),
    TEMPLOS_RELIGIOSOS("11", "Templos religiosos"),
    ADMINISTRACAO_CONDOMINIAL("12", "Administração condominial: iluminação e instalações de uso comum de prédio ou conjunto de edificações"),
    ILUMINACAO_EM_RODOVIAS("13", "Iluminação em rodovias solicitada por quem detenha concessão ou autorização para administração em rodovias"),
    SEMAFOROS_RADARES_CAMERAS_MONITORAMENTO_TRANSITO("14", "Semáforos, radares e câmeras de monitoramento de trânsito"),
    OUTROS_SERVICOS_OUTRAS_ATIVIDADES_CLASSE_COMERCIAL("15", "Outros serviços e outras atividades da classe comercial"),
    AGROPECUARIA_RURAL("16", "Agropecuária rural"),
    AGROPECUARIA_URBANA("17", "Agropecuária urbana"),
    RESIDENCIAL_RURAL("18", "Residencial rural"),
    COOPERATIVA_ELETRIFICACAO_RURAL("19", "Cooperativa de eletrificação rural"),
    AGROINDUSTRIAL("20", "Agroindustrial"),
    SERVICO_PUBLICO_IRRIGACAO_RURAL("21", "Serviço público de irrigação rural"),
    ESCOLA_AGROTECNICA("22", "Escola agrotécnica"),
    AQUICULTURA("23", "Aquicultura"),
    PODER_PUBLICO_FEDERAL("24", "Poder público Federal"),
    PODER_PUBLICO_ESTADUAL_OU_DISTRITAL("25", "Poder Público Estadual ou Distrital"),
    PODER_PUBLICO_MUNICIPAL("26", "Poder público Municipal"),
    TRACAO_ELETRICA("27", "Tração Elétrica"),
    AGUA_ESGOTO_SANEAMENTO("28", "Água esgoto ou saneamento"),
    OUTROS("99", "Outros");

    private final String codigo;
    private final String descricao;

    NF3eSubclasseConsumo(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NF3eSubclasseConsumo valueOfCodigo(final String codigo) {
        for (final NF3eSubclasseConsumo indicador : NF3eSubclasseConsumo.values()) {
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
