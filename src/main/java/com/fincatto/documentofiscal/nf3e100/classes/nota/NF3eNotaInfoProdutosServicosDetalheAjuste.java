package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoProdutosServicosDetalheAjuste extends DFBase {
    private static final long serialVersionUID = -2747034213035344434L;

    @Element(name = "tpAjuste")
    private NF3eTipoAjuste tipoAjuste;

    @Element(name = "motAjuste")
    private NF3eMotivoSubstituicao motivoAjuste;

    public NF3eTipoAjuste getTipoAjuste() {
        return tipoAjuste;
    }

    public void setTipoAjuste(NF3eTipoAjuste tipoAjuste) {
        this.tipoAjuste = tipoAjuste;
    }

    public NF3eMotivoSubstituicao getMotivoAjuste() {
        return motivoAjuste;
    }

    public void setMotivoAjuste(NF3eMotivoSubstituicao motivoAjuste) {
        this.motivoAjuste = motivoAjuste;
    }
}
