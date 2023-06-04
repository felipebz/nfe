package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.apache.commons.lang3.StringUtils;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoDestinatario extends DFBase {
    private static final long serialVersionUID = 1896086488168208360L;

    @Element(name = "xNome", required = false)
    private String razaoSocial;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "idOutros", required = false)
    private String outraIdentificacao;

    @Element(name = "indIEDest")
    private NF3eIndicadorIE indicadorIEDestinatario;

    @Element(name = "IE", required = false)
    private String inscricaoEstadual;

    @Element(name = "IM", required = false)
    private String inscricaoMunicipal;

    @Element(name = "cNIS", required = false)
    private String numeroIdentificacaoSocial;

    @Element(name = "NB", required = false)
    private String numeroBeneficio;

    @Element(name = "xNomeAdicional", required = false)
    private String nomeAdicional;

    @Element(name = "enderDest", required = false)
    private NF3eEndereco endereco;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        if (this.cpf != null) {
            throw new IllegalStateException("Nao deve setar CNPJ se CPF esteja setado");
        }
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null) {
            throw new IllegalStateException("Nao deve setar CPF se CNPJ esteja setado");
        }
        DFStringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getCpfj() {
        if (StringUtils.isNotBlank(this.cpf)) {
            return this.cpf;
        } else if (StringUtils.isNotBlank(this.cnpj)) {
            return this.cnpj;
        }
        return this.outraIdentificacao;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setRazaoSocial(final String razaoSocial) {
        DFStringValidador.tamanho60(razaoSocial, "Razao Social Destinatario");
        this.razaoSocial = razaoSocial;
    }

    public void setEndereco(final NF3eEndereco endereco) {
        this.endereco = endereco;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        if (StringUtils.isNotBlank(this.outraIdentificacao)) {
            throw new IllegalStateException("Não deve informar Inscrição Estadual se ID Estrangeiro esteja informado");
        }
        DFStringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setOutraIdentificacao(final String outraIdentificacao) {
        if (StringUtils.isNotBlank(outraIdentificacao)) {
            if (StringUtils.isNotBlank(this.inscricaoEstadual)) {
                throw new IllegalStateException("Não deve informar ID Estrangeiro se Inscrição Estadual esteja informado");
            }
            DFStringValidador.tamanho5a20(outraIdentificacao, "ID Estrangeiro Destinatário");
        }
        this.outraIdentificacao = outraIdentificacao;
    }

    public void setIndicadorIEDestinatario(final NF3eIndicadorIE indicadorIEDestinatario) {
        this.indicadorIEDestinatario = indicadorIEDestinatario;
    }

    public void setInscricaoMunicipal(final String inscricaoMunicipal) {
        DFStringValidador.tamanho15(inscricaoMunicipal, "IM Destinatário");
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public void setNumeroIdentificacaoSocial(final String numeroIdentificacaoSocial) {
        DFStringValidador.tamanho15N(numeroIdentificacaoSocial, "Numero Identificacao Social Destinatário");
        this.numeroIdentificacaoSocial = numeroIdentificacaoSocial;
    }

    public void setNumeroBeneficio(final String numeroBeneficio) {
        DFStringValidador.tamanho10N(numeroBeneficio, "Numero Beneficio Destinatário");
        this.numeroBeneficio = numeroBeneficio;
    }

    public void setNomeAdicional(final String nomeAdicional) {
        DFStringValidador.tamanho60(nomeAdicional, "Nome Adicional Destinatário");
        this.nomeAdicional = nomeAdicional;
    }

    public String getOutraIdentificacao() {
        return this.outraIdentificacao;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public NF3eEndereco getEndereco() {
        return this.endereco;
    }

    public NF3eIndicadorIE getIndicadorIEDestinatario() {
        return this.indicadorIEDestinatario;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public String getNumeroIdentificacaoSocial() {
        return this.numeroIdentificacaoSocial;
    }

    public String getNumeroBeneficio() {
        return this.numeroBeneficio;
    }

    public String getNomeAdicional() {
        return this.nomeAdicional;
    }
}
