package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFModelo;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoEmissao;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.apache.commons.lang3.StringUtils;
import org.simpleframework.xml.Element;

import java.time.ZonedDateTime;

public class NF3eNotaInfoIdentificacao extends DFBase {
    private static final long serialVersionUID = -2305338820011762320L;

    @Element(name = "cUF")
    private DFUnidadeFederativa uf;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "mod")
    private DFModelo modelo;

    @Element(name = "serie")
    private String serie;

    @Element(name = "nNF")
    private String numeroNota;

    @Element(name = "cNF")
    private String codigoRandomico;

    @Element(name = "cDV")
    private Integer digitoVerificador;

    @Element(name = "dhEmi")
    private ZonedDateTime dataHoraEmissao;

    @Element(name = "tpEmis")
    private NF3eTipoEmissao tipoEmissao;

    @Element(name = "nSiteAutoriz")
    private Integer siteAutorizador;

    @Element(name = "cMunFG")
    private String codigoMunicipio;

    @Element(name = "finNF3e")
    private NF3eFinalidade finalidade;

    @Element(name = "verProc")
    private String versaoEmissor;

    @Element(name = "dhCont", required = false)
    private ZonedDateTime dataHoraContigencia;

    @Element(name = "xJust", required = false)
    private String justificativaEntradaContingencia;

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public void setCodigoRandomico(final String codigoRandomico) {
        DFStringValidador.exatamente8(codigoRandomico, "Codigo Randomico");
        DFStringValidador.validaCodigoRandomico(codigoRandomico, "Codigo Randomico");
        if(StringUtils.isNotBlank(numeroNota) && StringUtils.equals(numeroNota.substring(1), codigoRandomico)){
            throw new IllegalStateException(String.format("Número da nota(%s) e código(%s) não podem ser iguais", numeroNota.substring(1), codigoRandomico));
        }
        this.codigoRandomico = codigoRandomico;
    }

    public void setModelo(final DFModelo modelo) {
        this.modelo = modelo;
    }

    public void setSerie(final String serie) {
        DFStringValidador.validador(serie, "Serie", 3, false, true);
        this.serie = serie;
    }

    public void setNumeroNota(final String numeroNota) {
        DFStringValidador.tamanho9(numeroNota, "Numero da Nota");
        if(StringUtils.isNotBlank(codigoRandomico) && StringUtils.equals(numeroNota.substring(1), codigoRandomico)){
            throw new IllegalStateException(String.format("Número da nota(%s) e código(%s) não podem ser iguais", numeroNota.substring(1), codigoRandomico));
        }
        this.numeroNota = numeroNota;
    }

    public void setDataHoraEmissao(final ZonedDateTime dataEmissao) {
        this.dataHoraEmissao = dataEmissao;
    }

    public void setSiteAutorizador(Integer siteAutorizador) {
        this.siteAutorizador = siteAutorizador;
    }

    public void setCodigoMunicipio(final String codigoMunicipio) {
        DFStringValidador.exatamente7N(codigoMunicipio, "Codigo Municipio");
        this.codigoMunicipio = codigoMunicipio;
    }

    public void setTipoEmissao(final NF3eTipoEmissao tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public void setDigitoVerificador(final Integer digitoVerificador) {
        DFIntegerValidador.exatamente1(digitoVerificador, "DV");
        this.digitoVerificador = digitoVerificador;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setFinalidade(final NF3eFinalidade finalidade) {
        this.finalidade = finalidade;
    }

    public void setVersaoEmissor(final String versaoEmissor) {
        DFStringValidador.tamanho20(versaoEmissor, "Versao Emissor");
        this.versaoEmissor = versaoEmissor;
    }

    public void setDataHoraContigencia(final ZonedDateTime dataHoraContigencia) {
        this.dataHoraContigencia = dataHoraContigencia;
    }

    public void setJustificativaEntradaContingencia(final String justificativaEntradaContingencia) {
        DFStringValidador.tamanho15a256(justificativaEntradaContingencia, "Justificativa Entrada Contingencia");
        this.justificativaEntradaContingencia = justificativaEntradaContingencia;
    }
	
    public DFUnidadeFederativa getUf() {
        return this.uf;
    }

    public String getCodigoRandomico() {
        return this.codigoRandomico;
    }

    public DFModelo getModelo() {
        return this.modelo;
    }

    public String getSerie() {
        return this.serie;
    }

    public String getNumeroNota() {
        return this.numeroNota;
    }

    public ZonedDateTime getDataHoraEmissao() {
        return this.dataHoraEmissao;
    }

    public Integer getSiteAutorizador() {
        return siteAutorizador;
    }

    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public NF3eTipoEmissao getTipoEmissao() {
        return this.tipoEmissao;
    }

    public Integer getDigitoVerificador() {
        return this.digitoVerificador;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public NF3eFinalidade getFinalidade() {
        return this.finalidade;
    }

    public String getVersaoEmissor() {
        return this.versaoEmissor;
    }

    public ZonedDateTime getDataHoraContigencia() {
        return this.dataHoraContigencia;
    }

    public String getJustificativaEntradaContingencia() {
        return this.justificativaEntradaContingencia;
    }
	
}