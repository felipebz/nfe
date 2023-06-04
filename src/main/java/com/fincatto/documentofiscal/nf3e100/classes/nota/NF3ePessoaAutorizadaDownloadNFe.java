package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3ePessoaAutorizadaDownloadNFe extends DFBase {
    private static final long serialVersionUID = -121637638946750864L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        DFStringValidador.cnpj(cnpj, "Pessoa Autorizada Download NFe");
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        DFStringValidador.cpf(cpf, "Pessoa Autorizada Download NFe");
        this.cpf = cpf;
    }
}
