package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura.NF3eSignature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "NF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNota extends DFBase {
    private static final long serialVersionUID = -4086625815382998898L;

    @Element(name = "infNF3e")
    private NF3eNotaInfo info;

    @Element(name = "infNF3eSupl", required = false)
    private NF3eNotaInfoSuplementar infoSuplementar;

    @Element(name = "Signature", required = false)
    private NF3eSignature assinatura;

    public void setInfo(final NF3eNotaInfo info) {
        this.info = info;
    }

    public NF3eNotaInfo getInfo() {
        return this.info;
    }

    public NF3eNotaInfoSuplementar getInfoSuplementar() {
        return this.infoSuplementar;
    }

    public void setInfoSuplementar(final NF3eNotaInfoSuplementar infoSuplementar) {
        this.infoSuplementar = infoSuplementar;
    }

    public void setAssinatura(final NF3eSignature assinatura) {
        this.assinatura = assinatura;
    }

    public NF3eSignature getAssinatura() {
        return this.assinatura;
    }
}