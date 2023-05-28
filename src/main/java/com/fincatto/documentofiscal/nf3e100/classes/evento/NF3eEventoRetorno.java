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

@Root(name = "retEventoNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eEventoRetorno extends DFBase {
    private static final long serialVersionUID = -7677346322599674162L;

    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "infEvento")
    private NF3eInfoEventoRetorno infoEventoRetorno;

    @Element(name = "Signature", required = false)
    private NF3eSignature assinatura;

    public NF3eInfoEventoRetorno getInfoEventoRetorno() {
        return this.infoEventoRetorno;
    }

    public void setInfoEventoRetorno(final NF3eInfoEventoRetorno infoEventoRetorno) {
        this.infoEventoRetorno = infoEventoRetorno;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public NF3eSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NF3eSignature assinatura) {
        this.assinatura = assinatura;
    }
}