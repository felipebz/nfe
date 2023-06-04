package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoICMS60 extends DFBase {
    private static final long serialVersionUID = -1680947849790987580L;

    @Element(name = "CST")
    private NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "vBCSTRet", required = false)
    private String valorBCICMSSTRetido;

    @Element(name = "pICMSSTRet", required = false)
    private String percentualAliquotaICMSSTConsumidorFinal;

    @Element(name = "vICMSSubstituto", required = false)
    private String valorICMSSubstituto;

    @Element(name = "vICMSSTRet", required = false)
    private String valorICMSSTRetido;

    @Element(name = "vBCFCPSTRet", required = false)
    private String valorBCFundoCombatePobrezaRetidoST;

    @Element(name = "pFCPSTRet", required = false)
    private String percentualFundoCombatePobrezaRetidoST;

    @Element(name = "vFCPSTRet", required = false)
    private String valorFundoCombatePobrezaRetidoST;

    @Element(name = "pRedBCEfet", required = false)
    private String percentualReducaoBCEfetiva;

    @Element(name = "vBCEfet", required = false)
    private String valorBCEfetiva;

    @Element(name = "pICMSEfet", required = false)
    private String percentualAliquotaICMSEfetiva;

    @Element(name = "vICMSEfet", required = false)
    private String valorICMSEfetivo;

    public NF3eNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return situacaoTributaria;
    }

    public void setSituacaoTributaria(NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getValorBCICMSSTRetido() {
        return valorBCICMSSTRetido;
    }

    public void setValorBCICMSSTRetido(BigDecimal valorBCICMSSTRetido) {
        this.valorBCICMSSTRetido = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMSSTRetido, "Valor BC ICMS ST Retido ICMS60 Item");
    }

    public String getPercentualAliquotaICMSSTConsumidorFinal() {
        return percentualAliquotaICMSSTConsumidorFinal;
    }

    public void setPercentualAliquotaICMSSTConsumidorFinal(BigDecimal percentualAliquotaICMSSTConsumidorFinal) {
        this.percentualAliquotaICMSSTConsumidorFinal = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualAliquotaICMSSTConsumidorFinal, "Percentual Aliquota ICMS ST Consumidor Final ICMS60 Item");
    }

    public String getValorICMSSubstituto() {
        return valorICMSSubstituto;
    }

    public void setValorICMSSubstituto(BigDecimal valorICMSSubstituto) {
        this.valorICMSSubstituto = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSSubstituto, "Valor ICMS Substituto ICMS60 Item");
    }

    public String getValorICMSSTRetido() {
        return valorICMSSTRetido;
    }

    public void setValorICMSSTRetido(BigDecimal valorICMSSTRetido) {
        this.valorICMSSTRetido = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSSTRetido, "Valor ICMS ST Retido ICMS60 Item");
    }

    public String getValorBCFundoCombatePobrezaRetidoST() {
        return valorBCFundoCombatePobrezaRetidoST;
    }

    public void setValorBCFundoCombatePobrezaRetidoST(BigDecimal valorBCFundoCombatePobrezaRetidoST) {
        this.valorBCFundoCombatePobrezaRetidoST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCFundoCombatePobrezaRetidoST, "Valor BC Fundo Combate Pobreza Retido ST ICMS60 Item");
    }

    public String getPercentualFundoCombatePobrezaRetidoST() {
        return percentualFundoCombatePobrezaRetidoST;
    }

    public void setPercentualFundoCombatePobrezaRetidoST(BigDecimal percentualFundoCombatePobrezaRetidoST) {
        this.percentualFundoCombatePobrezaRetidoST = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualFundoCombatePobrezaRetidoST, "Percentual Fundo Combate Pobreza Retido ST ICMS60 Item");
    }

    public String getValorFundoCombatePobrezaRetidoST() {
        return valorFundoCombatePobrezaRetidoST;
    }

    public void setValorFundoCombatePobrezaRetidoST(BigDecimal valorFundoCombatePobrezaRetidoST) {
        this.valorFundoCombatePobrezaRetidoST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobrezaRetidoST, "Valor Fundo Combate Pobreza Retido ST ICMS60 Item");
    }

    public String getPercentualReducaoBCEfetiva() {
        return percentualReducaoBCEfetiva;
    }

    public void setPercentualReducaoBCEfetiva(BigDecimal percentualReducaoBCEfetiva) {
        this.percentualReducaoBCEfetiva = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualReducaoBCEfetiva, "Percentual Reducao BC Efetiva ICMS60 Item");
    }

    public String getValorBCEfetiva() {
        return valorBCEfetiva;
    }

    public void setValorBCEfetiva(BigDecimal valorBCEfetiva) {
        this.valorBCEfetiva = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCEfetiva, "Valor BC Efetiva ICMS60 Item");
    }

    public String getPercentualAliquotaICMSEfetiva() {
        return percentualAliquotaICMSEfetiva;
    }

    public void setPercentualAliquotaICMSEfetiva(BigDecimal percentualAliquotaICMSEfetiva) {
        this.percentualAliquotaICMSEfetiva = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualAliquotaICMSEfetiva, "Percentual Aliquota ICMS Efetiva ICMS60 Item");
    }

    public String getValorICMSEfetivo() {
        return valorICMSEfetivo;
    }

    public void setValorICMSEfetivo(BigDecimal valorICMSEfetivo) {
        this.valorICMSEfetivo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSEfetivo, "Valor ICMS Efetivo ICMS60 Item");
    }
}
