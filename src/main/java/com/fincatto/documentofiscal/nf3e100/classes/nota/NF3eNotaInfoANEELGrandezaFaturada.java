package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "gGrandFat")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoANEELGrandezaFaturada extends DFBase {
    private static final long serialVersionUID = -7344140228386398763L;

    @Element(name = "CompetFat")
    private String competenciaFaturamento;

    @Element(name = "vFat")
    private String valorFaturado;

    @Element(name = "uMed")
    private NF3eUnidadeMedida unidadeMedida;

    @Element(name = "qtdDias")
    private String quantidadeDias;

    public String getCompetenciaFaturamento() {
        return competenciaFaturamento;
    }

    public void setCompetenciaFaturamento(String competenciaFaturamento) {
        DFStringValidador.exatamente6N(competenciaFaturamento, "Competência Faturamento");
        this.competenciaFaturamento = competenciaFaturamento;
    }

    public String getValorFaturado() {
        return valorFaturado;
    }

    public void setValorFaturado(BigDecimal valorFaturado) {
        this.valorFaturado = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(valorFaturado, "Valor Faturado");
    }

    public NF3eUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(NF3eUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(String quantidadeDias) {
        DFStringValidador.exatamente2N(quantidadeDias, "Quantidade de Dias");
        this.quantidadeDias = quantidadeDias;
    }
}
