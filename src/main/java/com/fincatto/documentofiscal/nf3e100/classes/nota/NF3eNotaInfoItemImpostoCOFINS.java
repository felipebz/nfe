package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoCOFINS extends DFBase {
    private static final long serialVersionUID = -5741521136987748568L;

    @Element(name = "CST")
    private NF3eNotaInfoImpostoTributacaoCOFINS situacaoTributaria;

    @Element(name = "vBC")
    private String valorBaseCalculo;

    @Element(name = "pCOFINS")
    private String percentualAliquota;

    @Element(name = "vCOFINS")
    private String valorTributo;

    public NF3eNotaInfoImpostoTributacaoCOFINS getSituacaoTributaria() {
        return situacaoTributaria;
    }

    public void setSituacaoTributaria(NF3eNotaInfoImpostoTributacaoCOFINS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getValorBaseCalculo() {
        return valorBaseCalculo;
    }

    public void setValorBaseCalculo(BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor Base Calculo COFINS");
    }

    public String getPercentualAliquota() {
        return percentualAliquota;
    }

    public void setPercentualAliquota(BigDecimal percentualAliquota) {
        this.percentualAliquota = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualAliquota, "Aliquota COFINS");
    }

    public String getValorTributo() {
        return valorTributo;
    }

    public void setValorTributo(BigDecimal valorTributo) {
        this.valorTributo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor COFINS");
    }
}
