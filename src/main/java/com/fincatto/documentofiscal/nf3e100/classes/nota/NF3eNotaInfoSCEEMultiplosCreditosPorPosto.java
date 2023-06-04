package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "gTipoSaldo")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoSCEEMultiplosCreditosPorPosto {

    @Attribute(name = "nTipoSaldo")
    private String agrupadorSaldo;

    @ElementList(inline = true)
    private List<NF3eNotaInfoSCEECreditosPorPosto> creditosPorPosto;

    public String getAgrupadorSaldo() {
        return agrupadorSaldo;
    }

    public void setAgrupadorSaldo(String agrupadorSaldo) {
        DFStringValidador.tamanho2N(agrupadorSaldo, "Agrupador de Saldo");
        this.agrupadorSaldo = agrupadorSaldo;
    }

    public List<NF3eNotaInfoSCEECreditosPorPosto> getCreditosPorPosto() {
        return creditosPorPosto;
    }

    public void setCreditosPorPosto(List<NF3eNotaInfoSCEECreditosPorPosto> creditosPorPosto) {
        this.creditosPorPosto = creditosPorPosto;
    }
}
