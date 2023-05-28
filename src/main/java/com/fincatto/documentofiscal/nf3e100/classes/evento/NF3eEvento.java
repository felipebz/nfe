package com.fincatto.documentofiscal.nf3e100.classes.evento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura.NF3eSignature;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "eventoNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eEvento extends DFBase {
    private static final long serialVersionUID = 3384732231249580742L;

    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "infEvento")
    private NF3eInfoEvento infoEvento;

    @Element(name = "Signature", required = false)
    private NF3eSignature assinatura;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public NF3eInfoEvento getInfoEvento() {
        return this.infoEvento;
    }

    public void setInfoEvento(final NF3eInfoEvento infoEvento) {
        this.infoEvento = infoEvento;
    }

    public NF3eSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NF3eSignature assinatura) {
        this.assinatura = assinatura;
    }
}