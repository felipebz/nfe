package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "det")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoProdutosServicosDetalhe extends DFBase {
    private static final long serialVersionUID = -6038782805072324047L;

    @Attribute(name = "nItem")
    private Integer numeroItem;

    @Element(name = "gAjusteNF3eAnt", required = false)
    private NF3eNotaInfoProdutosServicosDetalheAjuste ajuste;

    @Element(name = "detItemAnt", required = false)
    private NF3eNotaInfoProdutosServicosDetalheItemAnt itemAnterior;

    @Element(name = "detItem", required = false)
    private NF3eNotaInfoProdutosServicosDetalheItem item;

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        DFIntegerValidador.tamanho3(numeroItem, "Numero do item");
        this.numeroItem = numeroItem;
    }

    public NF3eNotaInfoProdutosServicosDetalheAjuste getAjuste() {
        return ajuste;
    }

    public void setAjuste(NF3eNotaInfoProdutosServicosDetalheAjuste ajuste) {
        this.ajuste = ajuste;
    }

    public NF3eNotaInfoProdutosServicosDetalheItemAnt getItemAnterior() {
        return itemAnterior;
    }

    public void setItemAnterior(NF3eNotaInfoProdutosServicosDetalheItemAnt itemAnterior) {
        this.itemAnterior = itemAnterior;
    }

    public NF3eNotaInfoProdutosServicosDetalheItem getItem() {
        return item;
    }

    public void setItem(NF3eNotaInfoProdutosServicosDetalheItem item) {
        this.item = item;
    }
}
