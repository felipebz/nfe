package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte300.classes.nota.CTeNotaInfoResponsavelTecnico;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoResponsavelTecnico extends DFBase {
    private static final long serialVersionUID = 4560039483950955714L;

    @Element(name = "CNPJ")
    private String cnpj;

    @Element(name = "xContato")
    private String contatoNome;

    @Element(name = "email")
    private String email;

    @Element(name = "fone")
    private String telefone;

    @Element(name = "idCSRT", required = false)
    private String idCSRT;

    @Element(name = "hashCSRT", required = false)
    private String hashCSRT;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getContatoNome() {
        return contatoNome;
    }

    public void setContatoNome(String contatoNome) {
        DFStringValidador.tamanho2ate60(contatoNome, "Responsavel tecnico");
        this.contatoNome = contatoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        DFStringValidador.email(email, "Responsavel tecnico ");
        DFStringValidador.validaIntervalo(email, 6, 60, "Responsavel tecnico");
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        DFStringValidador.telefone(telefone, "Responsavel tecnico");
        this.telefone = telefone;
    }

    public String getIdCSRT() {
        return idCSRT;
    }

    public void setIdCSRT(String idCSRT) {
        DFStringValidador.exatamente3(idCSRT, "Responsavel tecnico");
        this.idCSRT = idCSRT;
    }

    public String getHashCSRT() {
        return hashCSRT;
    }

    public void setHashCSRT(String hashCSRT) {
        DFStringValidador.isBase64(hashCSRT, "HASH CSRT em Responsavel tecnico");
        this.hashCSRT = hashCSRT;
    }

}
