package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoTotalTributosFederais extends DFBase {
    private static final long serialVersionUID = -8987921835510708842L;

    @Element(name = "vRetPIS")
    private String valorPISRetido;

    @Element(name = "vRetCofins")
    private String valorCOFINSRetido;

    @Element(name = "vRetCSLL")
    private String valorCSLLRetido;

    @Element(name = "vIRRF")
    private String valorIRRF;

    public String getValorPISRetido() {
        return valorPISRetido;
    }

    public void setValorPISRetido(BigDecimal valorPISRetido) {
        this.valorPISRetido = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorPISRetido, "Valor PIS Retido");
    }

    public String getValorCOFINSRetido() {
        return valorCOFINSRetido;
    }

    public void setValorCOFINSRetido(BigDecimal valorCOFINSRetido) {
        this.valorCOFINSRetido = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCOFINSRetido, "Valor COFINS Retido");
    }

    public String getValorCSLLRetido() {
        return valorCSLLRetido;
    }

    public void setValorCSLLRetido(BigDecimal valorCSLLRetido) {
        this.valorCSLLRetido = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCSLLRetido, "Valor CSLL Retido");
    }

    public String getValorIRRF() {
        return valorIRRF;
    }

    public void setValorIRRF(BigDecimal valorIRRF) {
        this.valorIRRF = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorIRRF, "Valor IRRF");
    }
}
