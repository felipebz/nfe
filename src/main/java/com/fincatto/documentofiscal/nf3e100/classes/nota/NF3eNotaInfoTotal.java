package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoTotal extends DFBase {
    private static final long serialVersionUID = 5046598660231298478L;

    @Element(name = "vProd")
    private String valorTotalProdutos;

    @Element(name = "ICMSTot")
    private NF3eNotaInfoTotalICMS icmsTotal;

    @Element(name = "vRetTribTot")
    private NF3eNotaInfoTotalTributosFederais valorTotalRetencaoTributos;

    @Element(name = "vCOFINS")
    private String valorTotalCOFINS;

    @Element(name = "vCOFINSEfet")
    private String valorTotalCOFINSEfetivo;

    @Element(name = "vPIS")
    private String valorTotalPIS;

    @Element(name = "vPISEfet")
    private String valorTotalPISEfetivo;

    @Element(name = "vNF")
    private String valorTotalNota;

    public String getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public void setValorTotalProdutos(BigDecimal valorTotalProdutos) {
        this.valorTotalProdutos = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalProdutos, "Valor Total Produtos");
    }

    public NF3eNotaInfoTotalICMS getIcmsTotal() {
        return icmsTotal;
    }

    public void setIcmsTotal(NF3eNotaInfoTotalICMS icmsTotal) {
        this.icmsTotal = icmsTotal;
    }

    public NF3eNotaInfoTotalTributosFederais getValorTotalRetencaoTributos() {
        return valorTotalRetencaoTributos;
    }

    public void setValorTotalRetencaoTributos(NF3eNotaInfoTotalTributosFederais valorTotalRetencaoTributos) {
        this.valorTotalRetencaoTributos = valorTotalRetencaoTributos;
    }

    public String getValorTotalCOFINS() {
        return valorTotalCOFINS;
    }

    public void setValorTotalCOFINS(BigDecimal valorTotalCOFINS) {
        this.valorTotalCOFINS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalCOFINS, "Valor Total COFINS");
    }

    public String getValorTotalCOFINSEfetivo() {
        return valorTotalCOFINSEfetivo;
    }

    public void setValorTotalCOFINSEfetivo(BigDecimal valorTotalCOFINSEfetivo) {
        this.valorTotalCOFINSEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalCOFINSEfetivo, "Valor Total COFINS Efetivo");
    }

    public String getValorTotalPIS() {
        return valorTotalPIS;
    }

    public void setValorTotalPIS(BigDecimal valorTotalPIS) {
        this.valorTotalPIS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalPIS, "Valor Total PIS");
    }

    public String getValorTotalPISEfetivo() {
        return valorTotalPISEfetivo;
    }

    public void setValorTotalPISEfetivo(BigDecimal valorTotalPISEfetivo) {
        this.valorTotalPISEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalPISEfetivo, "Valor Total PIS Efetivo");
    }

    public String getValorTotalNota() {
        return valorTotalNota;
    }

    public void setValorTotalNota(BigDecimal valorTotalNota) {
        this.valorTotalNota = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalNota, "Valor Total Nota");
    }
}
