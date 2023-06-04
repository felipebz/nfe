package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoEmitente extends DFBase {
    private static final long serialVersionUID = 5552402103543919043L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "IE")
    private String inscricaoEstadual;
    
    @Element(name = "xNome")
    private String razaoSocial;

    @Element(name = "xFant", required = false)
    private String nomeFantasia;
    
    @Element(name = "enderEmit")
    private NF3eEndereco endereco;

    public void setCnpj(final String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(final String razaoSocial) {
        DFStringValidador.tamanho60(razaoSocial, "Razao Social Emitente");
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(final String nomeFantasia) {
        DFStringValidador.tamanho60(nomeFantasia, "Nome Fantasia Emitente");
        this.nomeFantasia = nomeFantasia;
    }

    public void setEndereco(final NF3eEndereco endereco) {
        this.endereco = endereco;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        DFStringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return this.cnpj;
    }
	
    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public NF3eEndereco getEndereco() {
        return this.endereco;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }
}