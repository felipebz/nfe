package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoCOFINSEfetivo extends DFBase {
    private static final long serialVersionUID = 4360414275785192568L;

    @Element(name = "vBCCOFINSEfet")
    private String valorBaseCalculo;

    @Element(name = "pCOFINSEfet")
    private String percentualAliquota;

    @Element(name = "vCOFINSEfet")
    private String valorTributo;

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
