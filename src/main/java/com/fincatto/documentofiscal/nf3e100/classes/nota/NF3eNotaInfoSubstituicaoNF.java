package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoSubstituicaoNF extends DFBase {
    private static final long serialVersionUID = -4872145837029937959L;

    @Element(name = "CNPJ")
    private String cnpj;

    @Element(name = "serie")
    private String serie;

    @Element(name = "nNF")
    private String numeroNota;

    @Element(name = "CompetEmis")
    private String competenciaEmissao;

    @Element(name = "CompetApur")
    private String competenciaApuracao;

    @Element(name = "hash115", required = false)
    private String hashRegistroConvenio115;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        DFStringValidador.tamanho3(serie, "Série");
        this.serie = serie;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        DFStringValidador.tamanho9(numeroNota, "Numero da Nota");
        this.numeroNota = numeroNota;
    }

    public String getCompetenciaEmissao() {
        return competenciaEmissao;
    }

    public void setCompetenciaEmissao(String competenciaEmissao) {
        DFStringValidador.exatamente6N(competenciaEmissao, "Competência da Emissão");
        this.competenciaEmissao = competenciaEmissao;
    }

    public String getCompetenciaApuracao() {
        return competenciaApuracao;
    }

    public void setCompetenciaApuracao(String competenciaApuracao) {
        DFStringValidador.exatamente6N(competenciaApuracao, "Competência da Apuração");
        this.competenciaApuracao = competenciaApuracao;
    }

    public String getHashRegistroConvenio115() {
        return hashRegistroConvenio115;
    }

    public void setHashRegistroConvenio115(String hashRegistroConvenio115) {
        this.hashRegistroConvenio115 = hashRegistroConvenio115;
    }
}
