package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

import java.time.LocalDate;

public class NF3eNotaInfoFatura extends DFBase {
    private static final long serialVersionUID = -8048840094979823547L;

    @Element(name = "CompetFat")
    private String competenciaFaturamento;

    @Element(name = "dVencFat")
    private LocalDate dataVencimentoFatura;

    @Element(name = "dApresFat", required = false)
    private LocalDate dataApresentacaoFatura;

    @Element(name = "dProxLeitura")
    private LocalDate dataProximaLeitura;

    @Element(name = "nFat")
    private String numeroFatura;

    @Element(name = "codBarras")
    private String codigoBarras;

    @Element(name = "codDebAuto")
    private String codigoDebitoAutomatico;

    @Element(name = "codBanco", required = false)
    private String codigoBanco;

    @Element(name = "codAgencia", required = false)
    private String codigoAgencia;

    @Element(name = "enderCorresp", required = false)
    private NF3eEndereco endereco;

    @Element(name = "gPIX", required = false)
    private NF3eNotaInfoFaturaPix pix;

    public String getCompetenciaFaturamento() {
        return competenciaFaturamento;
    }

    public void setCompetenciaFaturamento(String competenciaFaturamento) {
        DFStringValidador.exatamente6N(competenciaFaturamento, "Competência Faturamento");
        this.competenciaFaturamento = competenciaFaturamento;
    }

    public LocalDate getDataVencimentoFatura() {
        return dataVencimentoFatura;
    }

    public void setDataVencimentoFatura(LocalDate dataVencimentoFatura) {
        this.dataVencimentoFatura = dataVencimentoFatura;
    }

    public LocalDate getDataApresentacaoFatura() {
        return dataApresentacaoFatura;
    }

    public void setDataApresentacaoFatura(LocalDate dataApresentacaoFatura) {
        this.dataApresentacaoFatura = dataApresentacaoFatura;
    }

    public LocalDate getDataProximaLeitura() {
        return dataProximaLeitura;
    }

    public void setDataProximaLeitura(LocalDate dataProximaLeitura) {
        this.dataProximaLeitura = dataProximaLeitura;
    }

    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        DFStringValidador.tamanho20(numeroFatura, "Número Fatura");
        this.numeroFatura = numeroFatura;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        DFStringValidador.exatamente44N(codigoBarras, "Código de Barras");
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoDebitoAutomatico() {
        return codigoDebitoAutomatico;
    }

    public void setCodigoDebitoAutomatico(String codigoDebitoAutomatico) {
        DFStringValidador.exatamente20N(codigoDebitoAutomatico, "Código Débito Automático");
        this.codigoDebitoAutomatico = codigoDebitoAutomatico;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(String codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public NF3eEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(NF3eEndereco endereco) {
        this.endereco = endereco;
    }

    public NF3eNotaInfoFaturaPix getPix() {
        return pix;
    }

    public void setPix(NF3eNotaInfoFaturaPix pix) {
        this.pix = pix;
    }
}
