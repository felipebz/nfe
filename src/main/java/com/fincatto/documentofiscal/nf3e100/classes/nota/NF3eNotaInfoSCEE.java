package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "gSCEE")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoSCEE extends DFBase {
    private static final long serialVersionUID = -4224145186679160436L;

    @Element(name = "tpPartComp")
    private NF3eNotaInfoSCEETipoParticipacao tipoParticipacao;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoSCEEGrupoConsumidor> grupoConsumidor;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoSCEECreditosPorPosto> creditosPorPosto;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoSCEEMultiplosCreditosPorPosto> multiplosCreditosPorPosto;

    public NF3eNotaInfoSCEETipoParticipacao getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(NF3eNotaInfoSCEETipoParticipacao tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public List<NF3eNotaInfoSCEEGrupoConsumidor> getGrupoConsumidor() {
        return grupoConsumidor;
    }

    public void setGrupoConsumidor(List<NF3eNotaInfoSCEEGrupoConsumidor> grupoConsumidor) {
        this.grupoConsumidor = grupoConsumidor;
    }

    public List<NF3eNotaInfoSCEECreditosPorPosto> getCreditosPorPosto() {
        return creditosPorPosto;
    }

    public void setCreditosPorPosto(List<NF3eNotaInfoSCEECreditosPorPosto> creditosPorPosto) {
        this.creditosPorPosto = creditosPorPosto;
    }

    public List<NF3eNotaInfoSCEEMultiplosCreditosPorPosto> getMultiplosCreditosPorPosto() {
        return multiplosCreditosPorPosto;
    }

    public void setMultiplosCreditosPorPosto(List<NF3eNotaInfoSCEEMultiplosCreditosPorPosto> multiplosCreditosPorPosto) {
        this.multiplosCreditosPorPosto = multiplosCreditosPorPosto;
    }
}
