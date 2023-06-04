package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NF3eNotaInfoANEEL extends DFBase {
    private static final long serialVersionUID = -5271810687852491262L;

    @ElementList(inline = true)
    private List<NF3eNotaInfoANEELHistoricoFaturamento> historicoFaturamento;

    public List<NF3eNotaInfoANEELHistoricoFaturamento> getHistoricoFaturamento() {
        return historicoFaturamento;
    }

    public void setHistoricoFaturamento(List<NF3eNotaInfoANEELHistoricoFaturamento> historicoFaturamento) {
        this.historicoFaturamento = historicoFaturamento;
    }
}
