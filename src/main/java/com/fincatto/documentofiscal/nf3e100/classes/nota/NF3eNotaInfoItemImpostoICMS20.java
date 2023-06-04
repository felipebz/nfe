package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoICMS20 extends DFBase {
    private static final long serialVersionUID = 8588451192014159414L;

    @Element(name = "CST")
    private NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "pRedBC")
    private String percentualReducaoBC;

    @Element(name = "vBC")
    private String valorBCICMS;

    @Element(name = "pICMS")
    private String percentualAliquota;

    @Element(name = "vICMS")
    private String valorTributo;

    @Element(name = "vICMSDeson", required = false)
    private String valorICMSDesoneracao;

    @Element(name = "cBenef", required = false)
    private String codigoBeneficioFiscalUF;

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

    public String getPercentualReducaoBC() {
        return percentualReducaoBC;
    }

    public void setPercentualReducaoBC(BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualReducaoBC, "Percentual Reducao BC ICMS20 Item");
    }

    public String getValorBCICMS() {
        return valorBCICMS;
    }

    public void setValorBCICMS(BigDecimal valorBCICMS) {
        this.valorBCICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMS, "Valor BC ICMS20 Item");
    }

    public String getPercentualAliquota() {
        return percentualAliquota;
    }

    public void setPercentualAliquota(BigDecimal percentualAliquota) {
        this.percentualAliquota = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualAliquota, "Percentual Aliquota ICMS20 Item");
    }

    public String getValorTributo() {
        return valorTributo;
    }

    public void setValorTributo(BigDecimal valorTributo) {
        this.valorTributo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS20 Item");
    }

    public String getValorICMSDesoneracao() {
        return valorICMSDesoneracao;
    }

    public void setValorICMSDesoneracao(BigDecimal valorICMSDesoneracao) {
        this.valorICMSDesoneracao = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSDesoneracao, "Valor ICMS Desoneracao ICMS20 Item");
    }

    public String getCodigoBeneficioFiscalUF() {
        return codigoBeneficioFiscalUF;
    }

    public void setCodigoBeneficioFiscalUF(String codigoBeneficioFiscalUF) {
        DFStringValidador.tamanho10(codigoBeneficioFiscalUF, "Codigo Beneficio Fiscal UF");
        this.codigoBeneficioFiscalUF = codigoBeneficioFiscalUF;
    }

    public String getPercentualFundoCombatePobreza() {
        return percentualFundoCombatePobreza;
    }

    public void setPercentualFundoCombatePobreza(BigDecimal percentualFundoCombatePobreza) {
        this.percentualFundoCombatePobreza = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualFundoCombatePobreza, "Percentual Fundo Combate Pobreza ICMS20 Item");
    }

    public String getValorFundoCombatePobreza() {
        return valorFundoCombatePobreza;
    }

    public void setValorFundoCombatePobreza(BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobreza, "Valor Fundo Combate Pobreza ICMS20 Item");
    }
}
