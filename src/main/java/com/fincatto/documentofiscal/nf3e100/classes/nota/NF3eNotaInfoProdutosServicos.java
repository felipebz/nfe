package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.*;

import java.util.List;

@Root(name = "NFdet")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoProdutosServicos extends DFBase {
    private static final long serialVersionUID = 3163216478587664689L;

    @Attribute(name = "chNF3eAnt", required = false)
    private String chNF3eAnt;

    @Attribute(name = "mod6HashAnt", required = false)
    private String mod6HashAnt;

    @ElementList(inline = true)
    private List<NF3eNotaInfoProdutosServicosDetalhe> detalhamentoProdutos;

    public String getChNF3eAnt() {
        return chNF3eAnt;
    }

    public void setChNF3eAnt(String chNF3eAnt) {
        DFStringValidador.exatamente44N(chNF3eAnt, "Chave de acesso da NF3e anterior");
        this.chNF3eAnt = chNF3eAnt;
    }

    public String getMod6HashAnt() {
        return mod6HashAnt;
    }

    public void setMod6HashAnt(String mod6HashAnt) {
        this.mod6HashAnt = mod6HashAnt;
    }

    public List<NF3eNotaInfoProdutosServicosDetalhe> getDetalhamentoProdutos() {
        return detalhamentoProdutos;
    }

    public void setDetalhamentoProdutos(List<NF3eNotaInfoProdutosServicosDetalhe> detalhamentoProdutos) {
        this.detalhamentoProdutos = detalhamentoProdutos;
    }
}
