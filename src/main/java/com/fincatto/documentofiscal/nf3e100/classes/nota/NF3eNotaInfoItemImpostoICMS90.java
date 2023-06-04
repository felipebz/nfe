package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eNotaInfoImpostoTributacaoICMS;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoItemImpostoICMS90 extends DFBase {
    private static final long serialVersionUID = 3462711868589518712L;

    @Element(name = "CST")
    private NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "vBC", required = false)
    private String valorBC;

    @Element(name = "pICMS", required = false)
    private String percentualAliquota;

    @Element(name = "vICMS", required = false)
    private String valorTributo;

    public NF3eNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return situacaoTributaria;
    }

    public void setSituacaoTributaria(NF3eNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getValorBC() {
        return valorBC;
    }

    public void setValorBC(BigDecimal valorBC) {
        this.valorBC = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBC, "Valor BC ICMS90 Item");
    }

    public String getPercentualAliquota() {
        return percentualAliquota;
    }

    public void setPercentualAliquota(BigDecimal percentualAliquota) {
        this.percentualAliquota = DFBigDecimalValidador.tamanho5Com2CasasDecimais(percentualAliquota, "Percentual Aliquota ICMS90 Item");
    }

    public String getValorTributo() {
        return valorTributo;
    }

    public void setValorTributo(BigDecimal valorTributo) {
        this.valorTributo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS90 Item");
    }
}
