package com.fincatto.documentofiscal.nf3e100.classes.nota.consulta;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "consSitNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaConsulta extends DFBase {
    private static final long serialVersionUID = 4553239019397141121L;

    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "tpAmb")
    private DFAmbiente ambiente;
    
    @Element(name = "xServ")
    private String servico;
    
    @Element(name = "chNF3e")
    private String chave;

    public void setVersao(final BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao Nota Consulta");
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setServico(final String servico) {
        this.servico = servico;
    }

    public void setChave(final String chave) {
        DFStringValidador.exatamente44N(chave, "Chave de Acesso Nota Consulta");
        this.chave = chave;
    }

    public String getVersao() {
        return this.versao;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public String getServico() {
        return this.servico;
    }

    public String getChave() {
        return this.chave;
    }
}