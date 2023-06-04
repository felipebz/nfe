package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoProdutosServicosDetalheItemProdutoMedida extends DFBase {
    private static final long serialVersionUID = -825992719444078632L;

    @Element(name = "tpGrMed")
    private NF3eGrandezaMedida tipoGrandezaMedida;

    @Element(name = "cPosTarif")
    private NF3eTipoPostoTarifarioCompleto tipoPostoTarifario;

    @Element(name = "uMed")
    private NF3eUnidadeMedida unidadeMedida;

    @Element(name = "vMedAnt")
    private String valorMedicaoAnterior;

    @Element(name = "vMedAtu")
    private String valorMedicaoAtual;

    @Element(name = "vConst")
    private String fatorMultiplicacaoMedidor;

    @Element(name = "vMed")
    private String valorMedicao;

    @Element(name = "pPerdaTran", required = false)
    private String perdaTransformacao;

    @Element(name = "vMedPerdaTran", required = false)
    private String valorMedicaoPerdaTransformacao;

    @Element(name = "vMedPerdaTec", required = false)
    private String valorMedicaoPerdaTecnica;

    public NF3eGrandezaMedida getTipoGrandezaMedida() {
        return tipoGrandezaMedida;
    }

    public void setTipoGrandezaMedida(NF3eGrandezaMedida tipoGrandezaMedida) {
        this.tipoGrandezaMedida = tipoGrandezaMedida;
    }

    public NF3eTipoPostoTarifarioCompleto getTipoPostoTarifario() {
        return tipoPostoTarifario;
    }

    public void setTipoPostoTarifario(NF3eTipoPostoTarifarioCompleto tipoPostoTarifario) {
        this.tipoPostoTarifario = tipoPostoTarifario;
    }

    public NF3eUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(NF3eUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getValorMedicaoAnterior() {
        return valorMedicaoAnterior;
    }

    public void setValorMedicaoAnterior(BigDecimal valorMedicaoAnterior) {
        this.valorMedicaoAnterior = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(valorMedicaoAnterior, "Valor Medicao Anterior");
    }

    public String getValorMedicaoAtual() {
        return valorMedicaoAtual;
    }

    public void setValorMedicaoAtual(BigDecimal valorMedicaoAtual) {
        this.valorMedicaoAtual = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(valorMedicaoAtual, "Valor Medicao Atual");
    }

    public String getFatorMultiplicacaoMedidor() {
        return fatorMultiplicacaoMedidor;
    }

    public void setFatorMultiplicacaoMedidor(BigDecimal fatorMultiplicacaoMedidor) {
        this.fatorMultiplicacaoMedidor = DFBigDecimalValidador.tamanho15comAte6CasasDecimais(fatorMultiplicacaoMedidor, "Fator Multiplicacao Medidor");
    }

    public String getValorMedicao() {
        return valorMedicao;
    }

    public void setValorMedicao(BigDecimal valorMedicao) {
        this.valorMedicao = DFBigDecimalValidador.tamanho5Com2CasasDecimais(valorMedicao, "Perda Transformacao");
    }

    public String getPerdaTransformacao() {
        return perdaTransformacao;
    }

    public void setPerdaTransformacao(BigDecimal perdaTransformacao) {
        this.perdaTransformacao = DFBigDecimalValidador.tamanho5Com2CasasDecimais(perdaTransformacao, "Perda Transformacao");
    }

    public String getValorMedicaoPerdaTransformacao() {
        return valorMedicaoPerdaTransformacao;
    }

    public void setValorMedicaoPerdaTransformacao(BigDecimal valorMedicaoPerdaTransformacao) {
        this.valorMedicaoPerdaTransformacao = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(valorMedicaoPerdaTransformacao, "Valor Medicao Perda Transformacao");
    }

    public String getValorMedicaoPerdaTecnica() {
        return valorMedicaoPerdaTecnica;
    }

    public void setValorMedicaoPerdaTecnica(BigDecimal valorMedicaoPerdaTecnica) {
        this.valorMedicaoPerdaTecnica = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(valorMedicaoPerdaTecnica, "Valor Medicao Perda Tecnica");
    }
}
