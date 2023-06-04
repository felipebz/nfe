package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eNotaInfoImpostoTributacaoICMS;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoICMS00 extends DFBase {
    private static final long serialVersionUID = -80352731424568841L;

    @Element(name = "CST")
    private NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "vBC")
    private String valorBaseCalculo;

    @Element(name = "pICMS")
    private String percentualAliquota;

    @Element(name = "vICMS")
    private String valorTributo;

    @Element(name = "pFCP", required = false)
    private String percentualFundoCombatePobreza;

    @Element(name = "vFCP", required = false)
    private String valorFundoCombatePobreza;

    public NF3eNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return situacaoTributaria;
    }

    public void setSituacaoTributaria(NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getValorBaseCalculo() {
        return valorBaseCalculo;
    }

    public void setValorBaseCalculo(BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor Base Calculo ICMS00");
    }

    public String getPercentualAliquota() {
        return percentualAliquota;
    }

    public void setPercentualAliquota(BigDecimal percentualAliquota) {
        this.percentualAliquota = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualAliquota, "Aliquota ICMS00");
    }

    public String getValorTributo() {
        return valorTributo;
    }

    public void setValorTributo(BigDecimal valorTributo) {
        this.valorTributo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS00");
    }

    public String getPercentualFundoCombatePobreza() {
        return percentualFundoCombatePobreza;
    }

    public void setPercentualFundoCombatePobreza(BigDecimal percentualFundoCombatePobreza) {
        this.percentualFundoCombatePobreza = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualFundoCombatePobreza, "Percentual Fundo Combate Pobreza ICMS00");
    }

    public String getValorFundoCombatePobreza() {
        return valorFundoCombatePobreza;
    }

    public void setValorFundoCombatePobreza(BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobreza, "Valor Fundo Combate Pobreza ICMS00");
    }
}
