package com.fincatto.documentofiscal.nf3e100.classes.envio;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Tipo Protocolo de status resultado do processamento da NF3e<br>
 * Dados do protocolo de status
 */

@Root(name = "infFisco")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eProtocoloInfoFisco extends DFBase {
    private static final long serialVersionUID = 1793392392026441366L;

    @Element(name = "cMsg")
    private String codigo;

    @Element(name = "xMsg")
    private String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
