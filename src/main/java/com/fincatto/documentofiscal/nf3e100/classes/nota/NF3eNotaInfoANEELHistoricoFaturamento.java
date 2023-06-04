package com.fincatto.documentofiscal.nf3e100.classes.nota;


import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "gHistFat")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoANEELHistoricoFaturamento extends DFBase {
    private static final long serialVersionUID = -114759263793041629L;

    @Element(name = "xGrandFat")
    private String grandezaFaturada;

    @ElementList(inline = true)
    private List<NF3eNotaInfoANEELGrandezaFaturada> grandezasFaturadas;

    public String getGrandezaFaturada() {
        return grandezaFaturada;
    }

    public void setGrandezaFaturada(String grandezaFaturada) {
        DFStringValidador.tamanho2ate60(grandezaFaturada, "Nome da grandeza faturada");
        this.grandezaFaturada = grandezaFaturada;
    }

    public List<NF3eNotaInfoANEELGrandezaFaturada> getGrandezasFaturadas() {
        return grandezasFaturadas;
    }

    public void setGrandezasFaturadas(List<NF3eNotaInfoANEELGrandezaFaturada> grandezasFaturadas) {
        this.grandezasFaturadas = grandezasFaturadas;
    }
}
