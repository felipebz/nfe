package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NF3eNotaInfoProdutosServicosDetalheItem extends DFBase {
    private static final long serialVersionUID = -7366773209759819829L;

    @Attribute(name = "nItemAnt", required = false)
    private Integer numeroItemAnterior;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoProdutosServicosDetalheItemTarifa> tarifas;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoProdutosServicosDetalheItemBandeira> bandeiras;

    @Element(name = "prod")
    private NF3eNotaInfoProdutosServicosDetalheItemProduto produto;

    @Element(name = "imposto")
    private NF3eNotaInfoProdutosServicosDetalheItemImposto imposto;

    @Element(name = "gProcRef", required = false)
    private NF3eNotaInfoProdutosServicosDetalheItemProcessoReferenciado processoReferenciado;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoProdutosServicosDetalheInfoContabil> informacoesContabeis;

    @Element(name = "infAdProd", required = false)
    private String informacoesAdicionaisProduto;

    public Integer getNumeroItemAnterior() {
        return numeroItemAnterior;
    }

    public void setNumeroItemAnterior(Integer numeroItemAnterior) {
        DFIntegerValidador.tamanho3(numeroItemAnterior, "Numero Item Anterior");
        this.numeroItemAnterior = numeroItemAnterior;
    }

    public List<NF3eNotaInfoProdutosServicosDetalheItemTarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<NF3eNotaInfoProdutosServicosDetalheItemTarifa> tarifas) {
        this.tarifas = tarifas;
    }

    public List<NF3eNotaInfoProdutosServicosDetalheItemBandeira> getBandeiras() {
        return bandeiras;
    }

    public void setBandeiras(List<NF3eNotaInfoProdutosServicosDetalheItemBandeira> bandeiras) {
        this.bandeiras = bandeiras;
    }

    public NF3eNotaInfoProdutosServicosDetalheItemProduto getProduto() {
        return produto;
    }

    public void setProduto(NF3eNotaInfoProdutosServicosDetalheItemProduto produto) {
        this.produto = produto;
    }

    public NF3eNotaInfoProdutosServicosDetalheItemImposto getImposto() {
        return imposto;
    }

    public void setImposto(NF3eNotaInfoProdutosServicosDetalheItemImposto imposto) {
        this.imposto = imposto;
    }

    public NF3eNotaInfoProdutosServicosDetalheItemProcessoReferenciado getProcessoReferenciado() {
        return processoReferenciado;
    }

    public void setProcessoReferenciado(NF3eNotaInfoProdutosServicosDetalheItemProcessoReferenciado processoReferenciado) {
        this.processoReferenciado = processoReferenciado;
    }

    public List<NF3eNotaInfoProdutosServicosDetalheInfoContabil> getInformacoesContabeis() {
        return informacoesContabeis;
    }

    public void setInformacoesContabeis(List<NF3eNotaInfoProdutosServicosDetalheInfoContabil> informacoesContabeis) {
        this.informacoesContabeis = informacoesContabeis;
    }

    public String getInformacoesAdicionaisProduto() {
        return informacoesAdicionaisProduto;
    }

    public void setInformacoesAdicionaisProduto(String informacoesAdicionaisProduto) {
        DFStringValidador.tamanho500(informacoesAdicionaisProduto, "Informações adicionais do produto");
        this.informacoesAdicionaisProduto = informacoesAdicionaisProduto;
    }
}
