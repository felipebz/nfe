package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eNotaInfoImpostoTributacaoICMS;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoICMS51 extends DFBase {
    private static final long serialVersionUID = 695808542822037735L;

    @Element(name = "CST")
    private NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "vICMSDeson", required = false)
    private String valorICMSDesonerado;

    @Element(name = "cBenef", required = false)
    private String codigoBeneficioFiscalUF;

    public NF3eNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return situacaoTributaria;
    }

    public void setSituacaoTributaria(NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getValorICMSDesonerado() {
        return valorICMSDesonerado;
    }

    public void setValorICMSDesonerado(BigDecimal valorICMSDesonerado) {
        this.valorICMSDesonerado = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSDesonerado, "Valor ICMS Desonerado ICMS40 Item");
    }

    public String getCodigoBeneficioFiscalUF() {
        return codigoBeneficioFiscalUF;
    }

    public void setCodigoBeneficioFiscalUF(String codigoBeneficioFiscalUF) {
        DFStringValidador.tamanho10(codigoBeneficioFiscalUF, "Codigo Beneficio Fiscal UF ICMS40 Item");
        this.codigoBeneficioFiscalUF = codigoBeneficioFiscalUF;
    }
}
