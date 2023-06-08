package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.envio.NF3eEnvioRetorno;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "nf3eResultMsg")
@Namespace(reference = "http://www.portalfiscal.inf.br/nf3e/wsdl/NF3eRecepcaoSinc")
public class NF3eResultMsg extends DFBase {
    private static final long serialVersionUID = 7921364648480953483L;

    @Element(name = "retNF3e")
    private NF3eEnvioRetorno retorno;

    public NF3eEnvioRetorno getRetorno() {
        return retorno;
    }

    public void setRetorno(NF3eEnvioRetorno retorno) {
        this.retorno = retorno;
    }
}
