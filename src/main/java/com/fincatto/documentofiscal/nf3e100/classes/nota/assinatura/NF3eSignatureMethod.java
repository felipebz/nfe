package com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura;

import org.simpleframework.xml.Attribute;

import java.io.Serializable;

public class NF3eSignatureMethod implements Serializable {
    private static final long serialVersionUID = 4525403507445216913L;

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(final String algorithm) {
        this.algorithm = algorithm;
    }

}
