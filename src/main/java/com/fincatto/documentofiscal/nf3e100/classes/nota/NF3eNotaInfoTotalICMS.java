package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoTotalICMS extends DFBase {
    private static final long serialVersionUID = 8521953526286158433L;

    @Element(name = "vBC")
    private String valorBaseCalculo;

    @Element(name = "vICMS")
    private String valorTributo;

    @Element(name = "vICMSDeson")
    private String valorICMSDesonerado;

    @Element(name = "vFCP")
    private String valorFundoCombatePobreza;

    @Element(name = "vBCST")
    private String valorBaseCalculoST;

    @Element(name = "vST")
    private String valorST;

    @Element(name = "vFCPST")
    private String valorFundoCombatePobrezaST;

    public String getValorBaseCalculo() {
        return valorBaseCalculo;
    }

    public void setValorBaseCalculo(BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor Base Calculo ICMS Item");
    }

    public String getValorTributo() {
        return valorTributo;
    }

    public void setValorTributo(BigDecimal valorTributo) {
        this.valorTributo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS Item");
    }

    public String getValorICMSDesonerado() {
        return valorICMSDesonerado;
    }

    public void setValorICMSDesonerado(BigDecimal valorICMSDesonerado) {
        this.valorICMSDesonerado = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSDesonerado, "Valor ICMS Desonerado Total");
    }

    public String getValorFundoCombatePobreza() {
        return valorFundoCombatePobreza;
    }

    public void setValorFundoCombatePobreza(BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobreza, "Valor Fundo Combate Pobreza Total");
    }

    public String getValorBaseCalculoST() {
        return valorBaseCalculoST;
    }

    public void setValorBaseCalculoST(BigDecimal valorBaseCalculoST) {
        this.valorBaseCalculoST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculoST, "Valor Base Calculo ST Total");
    }

    public String getValorST() {
        return valorST;
    }

    public void setValorST(BigDecimal valorST) {
        this.valorST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorST, "Valor ST Total");
    }

    public String getValorFundoCombatePobrezaST() {
        return valorFundoCombatePobrezaST;
    }

    public void setValorFundoCombatePobrezaST(BigDecimal valorFundoCombatePobrezaST) {
        this.valorFundoCombatePobrezaST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobrezaST, "Valor Fundo Combate Pobreza ST Total");
    }
}
