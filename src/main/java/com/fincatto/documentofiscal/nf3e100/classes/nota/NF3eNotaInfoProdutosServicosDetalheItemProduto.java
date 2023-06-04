package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eIndicadorOrigemQuantidade;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eUnidadeMedida;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoProdutosServicosDetalheItemProduto extends DFBase {
    private static final long serialVersionUID = 4460484779900483884L;

    @Element(name = "indOrigemQtd")
    private NF3eIndicadorOrigemQuantidade indicadorOrigemQuantidade;

    @Element(name = "gMedicao", required = false)
    private NF3eNotaInfoProdutosServicosDetalheItemProdutoMedicao medicao;

    @Element(name = "cProd")
    private String codigoProduto;

    @Element(name = "xProd")
    private String descricaoProduto;

    @Element(name = "cClass")
    private String codigoClassificacao;

    @Element(name = "CFOP", required = false)
    private String cfop;

    @Element(name = "uMed")
    private NF3eUnidadeMedida unidadeMedida;

    @Element(name = "qFaturada")
    private String quantidadeFaturada;

    @Element(name = "vItem")
    private String valorUnitario;

    @Element(name = "vProd")
    private String valorTotal;

    @Element(name = "indDevolucao", required = false)
    private Integer indicadorDevolucao;

    @Element(name = "indPrecoACL", required = false)
    private Integer indicadorPrecoACL;

    public NF3eIndicadorOrigemQuantidade getIndicadorOrigemQuantidade() {
        return indicadorOrigemQuantidade;
    }

    public void setIndicadorOrigemQuantidade(NF3eIndicadorOrigemQuantidade indicadorOrigemQuantidade) {
        this.indicadorOrigemQuantidade = indicadorOrigemQuantidade;
    }

    public NF3eNotaInfoProdutosServicosDetalheItemProdutoMedicao getMedicao() {
        return medicao;
    }

    public void setMedicao(NF3eNotaInfoProdutosServicosDetalheItemProdutoMedicao medicao) {
        this.medicao = medicao;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        DFStringValidador.tamanho60(codigoProduto, "Codigo Produto");
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        DFStringValidador.tamanho120(descricaoProduto, "Descricao Produto");
        this.descricaoProduto = descricaoProduto;
    }

    public String getCodigoClassificacao() {
        return codigoClassificacao;
    }

    public void setCodigoClassificacao(Integer codigoClassificacao) {
        DFIntegerValidador.tamanho7(codigoClassificacao, "Codigo Classificacao");
        this.codigoClassificacao = String.valueOf(codigoClassificacao);
    }

    public String getCfop() {
        DFStringValidador.exatamente4(cfop, "CFOP");
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public NF3eUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(NF3eUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getQuantidadeFaturada() {
        return quantidadeFaturada;
    }

    public void setQuantidadeFaturada(BigDecimal quantidadeFaturada) {
        this.quantidadeFaturada = DFBigDecimalValidador.tamanho11Com4CasasDecimais(quantidadeFaturada, "Quantidade Faturada");
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorUnitario, "Valor Unitario");
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorTotal, "Valor Total");
    }

    public Integer getIndicadorDevolucao() {
        return indicadorDevolucao;
    }

    public void setIndicadorDevolucao(Integer indicadorDevolucao) {
        DFIntegerValidador.exatamente1(indicadorDevolucao, "Indicador Devolucao");
        this.indicadorDevolucao = indicadorDevolucao;
    }

    public Integer getIndicadorPrecoACL() {
        return indicadorPrecoACL;
    }

    public void setIndicadorPrecoACL(Integer indicadorPrecoACL) {
        DFIntegerValidador.exatamente1(indicadorPrecoACL, "Indicador Preco ACL");
        this.indicadorPrecoACL = indicadorPrecoACL;
    }
}
