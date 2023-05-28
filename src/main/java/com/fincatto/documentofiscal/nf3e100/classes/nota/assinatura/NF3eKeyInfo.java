package com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.Element;

public class NF3eKeyInfo extends DFBase {
    private static final long serialVersionUID = 7949034334524924221L;

    @Element(name = "X509Data", required = false)
    private NF3eX509Data data;

    public NF3eX509Data getData() {
        return this.data;
    }

    public void setData(final NF3eX509Data data) {
        this.data = data;
    }
}