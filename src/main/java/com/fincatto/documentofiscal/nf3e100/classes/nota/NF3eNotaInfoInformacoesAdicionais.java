package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NF3eNotaInfoInformacoesAdicionais extends DFBase {
    private static final long serialVersionUID = -7438210453108220583L;

    @Element(name = "infAdFisco", required = false)
    private String informacoesAdicionaisFisco;

    @ElementList(entry = "infCpl", inline = true, required = false)
    private List<String> informacoesComplementares;

    public String getInformacoesAdicionaisFisco() {
        return informacoesAdicionaisFisco;
    }

    public void setInformacoesAdicionaisFisco(String informacoesAdicionaisFisco) {
        DFStringValidador.tamanho2000(informacoesAdicionaisFisco, "Informacoes Adicionais Fisco");
        this.informacoesAdicionaisFisco = informacoesAdicionaisFisco;
    }

    public List<String> getInformacoesComplementares() {
        return informacoesComplementares;
    }

    public void setInformacoesComplementares(List<String> informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
    }
}
