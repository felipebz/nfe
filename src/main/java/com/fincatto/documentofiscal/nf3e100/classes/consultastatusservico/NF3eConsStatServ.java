package com.fincatto.documentofiscal.nf3e100.classes.consultastatusservico;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "consStatServNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eConsStatServ extends DFBase {
    private static final long serialVersionUID = 3473836544443619832L;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "xServ")
    private String servico;

    @Attribute(name = "versao")
    private String versao;

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getServico() {
        return this.servico;
    }

    public void setServico(final String servico) {
        this.servico = servico;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }
}
