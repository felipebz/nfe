package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoNaoLeitura;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoProdutosServicosDetalheItemProdutoMedicao extends DFBase {
    private static final long serialVersionUID = 5138079001967022091L;

    @Element(name = "nMed")
    private String numeroMedicao;

    @Element(name = "nContrat", required = false)
    private String grupoDemanadaContratada;

    @Element(name = "gMedida", required = false)
    private NF3eNotaInfoProdutosServicosDetalheItemProdutoMedida medida;

    @Element(name = "tpMotNaoLeitura", required = false)
    private NF3eMotivoNaoLeitura tipoMotivoNaoLeitura;

    public String getNumeroMedicao() {
        return numeroMedicao;
    }

    public void setNumeroMedicao(Integer numeroMedicao) {
        DFIntegerValidador.exatamente2(numeroMedicao, "Numero Medicao");
        this.numeroMedicao = String.valueOf(numeroMedicao);
    }

    public String getGrupoDemanadaContratada() {
        return grupoDemanadaContratada;
    }

    public void setGrupoDemanadaContratada(Integer grupoDemanadaContratada) {
        DFIntegerValidador.exatamente2(grupoDemanadaContratada, "Numero Contrato");
        this.grupoDemanadaContratada = String.valueOf(grupoDemanadaContratada);
    }

    public NF3eNotaInfoProdutosServicosDetalheItemProdutoMedida getMedida() {
        return medida;
    }

    public void setMedida(NF3eNotaInfoProdutosServicosDetalheItemProdutoMedida medida) {
        this.medida = medida;
    }

    public NF3eMotivoNaoLeitura getTipoMotivoNaoLeitura() {
        return tipoMotivoNaoLeitura;
    }

    public void setTipoMotivoNaoLeitura(NF3eMotivoNaoLeitura tipoMotivoNaoLeitura) {
        this.tipoMotivoNaoLeitura = tipoMotivoNaoLeitura;
    }
}
