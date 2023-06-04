package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "infNF3eSupl")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoSuplementar extends DFBase {
    private static final long serialVersionUID = -996166604621530688L;

    @Element(name = "qrCodNF3e")
    private String qrCode;

    public void setQrCode(final String qrCode) {
        this.qrCode = qrCode;
    }

    public String getQrCode() {
        return this.qrCode;
    }
}