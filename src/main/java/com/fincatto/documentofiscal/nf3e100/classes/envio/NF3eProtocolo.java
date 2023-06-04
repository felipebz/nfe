package com.fincatto.documentofiscal.nf3e100.classes.envio;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura.NF3eSignature;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Conjunto de NF3es processadas, só existe nos casos em que o lote consultado se encontra processado
 */
@Root(name = "protNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eProtocolo extends DFBase {
    private static final long serialVersionUID = 4634629801463718104L;

    @Element(name = "infProt", required = false)
    private NF3eProtocoloInfo info;

    @Element(name = "infFisco", required = false)
    private NF3eProtocoloInfoFisco infoFisco;

    @Element(name = "Signature", required = false)
    private NF3eSignature signature;
    
    @Attribute(name = "versao")
    private String versao;

    public NF3eProtocoloInfo getInfo() {
        return this.info;
    }

    /**
     * Dados do protocolo de status
     */
    public void setInfo(final NF3eProtocoloInfo info) {
        this.info = info;
    }

    public NF3eSignature getSignature() {
        return this.signature;
    }

    /**
     *
     * */
    public void setSignature(final NF3eSignature signature) {
        this.signature = signature;
    }

    public String getVersao() {
        return this.versao;
    }

    /**
     *
     * */
    public void setVersao(final String versao) {
        this.versao = versao;
    }
}
