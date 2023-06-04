package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.math.BigDecimal;
import java.util.List;

public class NF3eNotaInfoProdutosServicosDetalheItemProcessoReferenciado extends DFBase {
    private static final long serialVersionUID = -5252711668307930044L;

    @Element(name = "vItem")
    private String valorUnitarioItem;

    @Element(name = "qFaturada")
    private String quantidadeFaturada;

    @Element(name = "vProd")
    private String valorTotalItem;

    @Element(name = "indDevolucao", required = false)
    private Integer indicadorDevolucao;

    @Element(name = "vBC", required = false)
    private String valorBaseCalculoICMS;

    @Element(name = "pICMS", required = false)
    private String aliquotaICMS;

    @Element(name = "vICMS", required = false)
    private String valorICMS;

    @Element(name = "pFCP", required = false)
    private String percentualFundoCombatePobreza;

    @Element(name = "vFCP", required = false)
    private String valorFundoCombatePobreza;

    @Element(name = "vBCST", required = false)
    private String valorBaseCalculoICMSST;

    @Element(name = "pICMSST", required = false)
    private String aliquotaICMSST;

    @Element(name = "vICMSST", required = false)
    private String valorICMSST;

    @Element(name = "pFCPST", required = false)
    private String percentualFundoCombatePobrezaST;

    @Element(name = "vFCPST", required = false)
    private String valorFundoCombatePobrezaST;

    @Element(name = "vPIS", required = false)
    private String valorPIS;

    @Element(name = "vPISEfet", required = false)
    private String valorPisEfetivo;

    @Element(name = "vCOFINS", required = false)
    private String valorCOFINS;

    @Element(name = "vCOFINSEfet", required = false)
    private String valorCofinsEfetivo;

    @Element(name = "gProc")
    private NF3eNotaInfoProdutosServicosDetalheItemProcesso processo;

    public String getValorUnitarioItem() {
        return valorUnitarioItem;
    }

    public void setValorUnitarioItem(BigDecimal valorUnitarioItem) {
        this.valorUnitarioItem = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorUnitarioItem, "Valor unitário item");
    }

    public String getQuantidadeFaturada() {
        return quantidadeFaturada;
    }

    public void setQuantidadeFaturada(BigDecimal quantidadeFaturada) {
        this.quantidadeFaturada = DFBigDecimalValidador.tamanho11ComAte4CasasDecimais(quantidadeFaturada, "Quantidade faturada");
    }

    public String getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(BigDecimal valorTotalItem) {
        this.valorTotalItem = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorTotalItem, "Valor total item");
    }

    public Integer getIndicadorDevolucao() {
        return indicadorDevolucao;
    }

    public void setIndicadorDevolucao(Integer indicadorDevolucao) {
        DFIntegerValidador.exatamente1(indicadorDevolucao, "Indicador de devolução");
        this.indicadorDevolucao = indicadorDevolucao;
    }

    public String getValorBaseCalculoICMS() {
        return valorBaseCalculoICMS;
    }

    public void setValorBaseCalculoICMS(BigDecimal valorBaseCalculoICMS) {
        this.valorBaseCalculoICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculoICMS, "Valor base de cálculo ICMS");
    }

    public String getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(BigDecimal aliquotaICMS) {
        this.aliquotaICMS = DFBigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaICMS, "Alíquota ICMS");
    }

    public String getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(BigDecimal valorICMS) {
        this.valorICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMS, "Valor ICMS");
    }

    public String getPercentualFundoCombatePobreza() {
        return percentualFundoCombatePobreza;
    }

    public void setPercentualFundoCombatePobreza(BigDecimal percentualFundoCombatePobreza) {
        this.percentualFundoCombatePobreza = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualFundoCombatePobreza, "Percentual fundo combate pobreza");
    }

    public String getValorFundoCombatePobreza() {
        return valorFundoCombatePobreza;
    }

    public void setValorFundoCombatePobreza(BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobreza, "Valor fundo combate pobreza");
    }

    public String getValorBaseCalculoICMSST() {
        return valorBaseCalculoICMSST;
    }

    public void setValorBaseCalculoICMSST(BigDecimal valorBaseCalculoICMSST) {
        this.valorBaseCalculoICMSST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculoICMSST, "Valor base de cálculo ICMS ST");
    }

    public String getAliquotaICMSST() {
        return aliquotaICMSST;
    }

    public void setAliquotaICMSST(BigDecimal aliquotaICMSST) {
        this.aliquotaICMSST = DFBigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaICMSST, "Alíquota ICMS ST");
    }

    public String getValorICMSST() {
        return valorICMSST;
    }

    public void setValorICMSST(BigDecimal valorICMSST) {
        this.valorICMSST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMS ST");
    }

    public String getPercentualFundoCombatePobrezaST() {
        return percentualFundoCombatePobrezaST;
    }

    public void setPercentualFundoCombatePobrezaST(BigDecimal percentualFundoCombatePobrezaST) {
        this.percentualFundoCombatePobrezaST = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualFundoCombatePobrezaST, "Percentual fundo combate pobreza ST");
    }

    public String getValorFundoCombatePobrezaST() {
        return valorFundoCombatePobrezaST;
    }

    public void setValorFundoCombatePobrezaST(BigDecimal valorFundoCombatePobrezaST) {
        this.valorFundoCombatePobrezaST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobrezaST, "Valor fundo combate pobreza ST");
    }

    public String getValorPIS() {
        return valorPIS;
    }

    public void setValorPIS(BigDecimal valorPIS) {
        this.valorPIS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorPIS, "Valor PIS");
    }

    public String getValorPisEfetivo() {
        return valorPisEfetivo;
    }

    public void setValorPisEfetivo(BigDecimal valorPisEfetivo) {
        this.valorPisEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorPisEfetivo, "Valor PIS efetivo");
    }

    public String getValorCOFINS() {
        return valorCOFINS;
    }

    public void setValorCOFINS(BigDecimal valorCOFINS) {
        this.valorCOFINS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCOFINS, "Valor COFINS");
    }

    public String getValorCofinsEfetivo() {
        return valorCofinsEfetivo;
    }

    public void setValorCofinsEfetivo(BigDecimal valorCofinsEfetivo) {
        this.valorCofinsEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCofinsEfetivo, "Valor COFINS efetivo");
    }

    public NF3eNotaInfoProdutosServicosDetalheItemProcesso getProcesso() {
        return processo;
    }

    public void setProcesso(NF3eNotaInfoProdutosServicosDetalheItemProcesso processo) {
        this.processo = processo;
    }
}
