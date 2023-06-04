package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoProdutosServicosDetalheItemAnt extends DFBase {
    private static final long serialVersionUID = -5150782928788429695L;

    @Attribute(name = "nItemAnt")
    private Integer numeroItemAnterior;

    @Element(name = "vItem")
    private String valorUnitario;

    @Element(name = "qFaturada")
    private String quantidadeFaturada;

    @Element(name = "vProd")
    private String valorTotal;

    @Element(name = "cClass")
    private String codigoClassificacao;

    @Element(name = "vBC", required = false)
    private String valorBaseCalculoICMS;

    @Element(name = "pICMS", required = false)
    private String aliquotaICMS;

    @Element(name = "vICMS", required = false)
    private String valorICMS;

    @Element(name = "vFCP", required = false)
    private String valorFundoCombatePobreza;

    @Element(name = "vBCST", required = false)
    private String valorBaseCalculoST;

    @Element(name = "vICMSST", required = false)
    private String valorICMSST;

    @Element(name = "vFCPST", required = false)
    private String valorTotalFundoCombatePobrezaST;

    @Element(name = "vPIS", required = false)
    private String valorPIS;

    @Element(name = "vPISEfet", required = false)
    private String valorPISEfetivo;

    @Element(name = "vCOFINS", required = false)
    private String valorCOFINS;

    @Element(name = "vCOFINSEfet", required = false)
    private String valorCOFINSEfetivo;

    @Element(name = "retTrib", required = false)
    private NF3eNotaInfoItemRetencaoTributos retencaoTributos;

    @Element(name = "indDevolucao", required = false)
    private Integer indicadorDevolucao;

    public Integer getNumeroItemAnterior() {
        return numeroItemAnterior;
    }

    public void setNumeroItemAnterior(Integer numeroItemAnterior) {
        DFIntegerValidador.tamanho3(numeroItemAnterior, "Numero Item Anterior");
        this.numeroItemAnterior = numeroItemAnterior;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorUnitario, "Valor Unitario");
    }

    public String getQuantidadeFaturada() {
        return quantidadeFaturada;
    }

    public void setQuantidadeFaturada(BigDecimal quantidadeFaturada) {
        this.quantidadeFaturada = DFBigDecimalValidador.tamanho11Com4CasasDecimais(quantidadeFaturada, "Quantidade Faturada");
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorTotal, "Valor Total");
    }

    public String getCodigoClassificacao() {
        return codigoClassificacao;
    }

    public void setCodigoClassificacao(Integer codigoClassificacao) {
        DFIntegerValidador.tamanho7(codigoClassificacao, "Codigo Classificacao");
        this.codigoClassificacao = String.valueOf(codigoClassificacao);
    }

    public String getValorBaseCalculoICMS() {
        return valorBaseCalculoICMS;
    }

    public void setValorBaseCalculoICMS(BigDecimal valorBaseCalculoICMS) {
        this.valorBaseCalculoICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculoICMS, "Valor Base Calculo ICMS");
    }

    public String getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(BigDecimal aliquotaICMS) {
        this.aliquotaICMS = DFBigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaICMS, "Aliquota ICMS");
    }

    public String getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(BigDecimal valorICMS) {
        this.valorICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMS, "Valor ICMS");
    }

    public String getValorFundoCombatePobreza() {
        return valorFundoCombatePobreza;
    }

    public void setValorFundoCombatePobreza(BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobreza, "Valor Fundo Combate Pobreza");
    }

    public String getValorBaseCalculoST() {
        return valorBaseCalculoST;
    }

    public void setValorBaseCalculoST(BigDecimal valorBaseCalculoST) {
        this.valorBaseCalculoST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculoST, "Valor Base Calculo ST");
    }

    public String getValorICMSST() {
        return valorICMSST;
    }

    public void setValorICMSST(BigDecimal valorICMSST) {
        this.valorICMSST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMS ST");
    }

    public String getValorTotalFundoCombatePobrezaST() {
        return valorTotalFundoCombatePobrezaST;
    }

    public void setValorTotalFundoCombatePobrezaST(BigDecimal valorTotalFundoCombatePobrezaST) {
        this.valorTotalFundoCombatePobrezaST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalFundoCombatePobrezaST, "Valor Total Fundo Combate Pobreza ST");
    }

    public String getValorPIS() {
        return valorPIS;
    }

    public void setValorPIS(BigDecimal valorPIS) {
        this.valorPIS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorPIS, "Valor PIS");
    }

    public String getValorPISEfetivo() {
        return valorPISEfetivo;
    }

    public void setValorPISEfetivo(BigDecimal valorPISEfetivo) {
        this.valorPISEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorPISEfetivo, "Valor PIS Efetivo");
    }

    public String getValorCOFINS() {
        return valorCOFINS;
    }

    public void setValorCOFINS(BigDecimal valorCOFINS) {
        this.valorCOFINS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCOFINS, "Valor COFINS");
    }

    public String getValorCOFINSEfetivo() {
        return valorCOFINSEfetivo;
    }

    public void setValorCOFINSEfetivo(BigDecimal valorCOFINSEfetivo) {
        this.valorCOFINSEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCOFINSEfetivo, "Valor COFINS Efetivo");
    }

    public NF3eNotaInfoItemRetencaoTributos getRetencaoTributos() {
        return retencaoTributos;
    }

    public void setRetencaoTributos(NF3eNotaInfoItemRetencaoTributos retencaoTributos) {
        this.retencaoTributos = retencaoTributos;
    }

    public Integer getIndicadorDevolucao() {
        return indicadorDevolucao;
    }

    public void setIndicadorDevolucao(Integer indicadorDevolucao) {
        DFIntegerValidador.exatamente1(indicadorDevolucao, "Indicador Devolucao");
        this.indicadorDevolucao = indicadorDevolucao;
    }
}
