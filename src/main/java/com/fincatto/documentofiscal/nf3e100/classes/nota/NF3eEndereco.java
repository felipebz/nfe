package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eEndereco extends DFBase {
    private static final long serialVersionUID = 6060434334396031634L;
    
    @Element(name = "xLgr")
    private String logradouro;

    @Element(name = "nro")
    private String numero;

    @Element(name = "xCpl", required = false)
    private String complemento;

    @Element(name = "xBairro")
    private String bairro;

    @Element(name = "cMun")
    private String codigoMunicipio;

    @Element(name = "xMun")
    private String descricaoMunicipio;

    @Element(name = "CEP")
    private String cep;

    @Element(name = "UF")
    private String uf;

    @Element(name = "fone", required = false)
    private String telefone;

    @Element(name = "email", required = false)
    private String email;

    public void setLogradouro(final String logradouro) {
        DFStringValidador.tamanho60(logradouro, "Logradouro");
        this.logradouro = logradouro;
    }

    public void setNumero(final String numero) {
        DFStringValidador.tamanho60(numero, "Numero do Endereco");
        this.numero = numero;
    }

    public void setComplemento(final String complemento) {
        DFStringValidador.tamanho60(complemento, "Complemento");
        this.complemento = complemento;
    }

    public void setBairro(final String bairro) {
        DFStringValidador.tamanho2ate60(bairro, "Bairro");
        this.bairro = bairro;
    }

    public void setCodigoMunicipio(final String codigoMunicipio) {
        DFStringValidador.exatamente7(codigoMunicipio, "Codigo do Municipio");
        this.codigoMunicipio = codigoMunicipio;
    }

    public void setDescricaoMunicipio(final String descricaoMunicipio) {
        DFStringValidador.tamanho60(descricaoMunicipio, "Descricao do Municipio");
        this.descricaoMunicipio = descricaoMunicipio;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf.getCodigo();
    }

    public void setCep(final String cep) {
        DFStringValidador.exatamente8(cep, "CEP");
        this.cep = cep;
    }

    public void setTelefone(final String telefone) {
        DFStringValidador.telefone(telefone);
        this.telefone = telefone;
    }

    public void setEmail(final String email) {
        DFStringValidador.email(email, "Email");
        this.email = email;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public String getDescricaoMunicipio() {
        return this.descricaoMunicipio;
    }

    public String getUf() {
        return this.uf;
    }

    public String getCep() {
        return this.cep;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }
}