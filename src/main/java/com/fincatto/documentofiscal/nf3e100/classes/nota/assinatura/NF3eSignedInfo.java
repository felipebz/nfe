package com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.Element;

public class NF3eSignedInfo extends DFBase {
    private static final long serialVersionUID = -5878065134465400530L;

    @Element(name = "CanonicalizationMethod", required = false)
    private NF3eCanonicalizationMethod canonicalizationMethod;

    @Element(name = "SignatureMethod", required = false)
    private NF3eSignatureMethod signatureMethod;

    @Element(name = "Reference", required = false)
    private NF3eReference reference;

    public NF3eCanonicalizationMethod getCanonicalizationMethod() {
        return this.canonicalizationMethod;
    }

    public void setCanonicalizationMethod(final NF3eCanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public NF3eSignatureMethod getSignatureMethod() {
        return this.signatureMethod;
    }

    public void setSignatureMethod(final NF3eSignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public NF3eReference getReference() {
        return this.reference;
    }

    public void setReference(final NF3eReference reference) {
        this.reference = reference;
    }
}