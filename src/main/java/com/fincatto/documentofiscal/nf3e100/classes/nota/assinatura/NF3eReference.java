package com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

import java.util.List;

public class NF3eReference extends DFBase {
    private static final long serialVersionUID = -4906473217029646581L;

    @Attribute(name = "URI", required = false)
    private String uri;

    @Path("Transforms")
    @ElementList(entry = "Transform", inline = true, required = false)
    private List<NF3eTransform> transform;

    @Element(name = "DigestMethod", required = false)
    private NF3eDigestMethod digestMethod;

    @Element(name = "DigestValue", required = false)
    private String digestValue;

    public String getUri() {
        return this.uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public List<NF3eTransform> getTransform() {
        return this.transform;
    }

    public void setTransform(final List<NF3eTransform> transform) {
        this.transform = transform;
    }

    public NF3eDigestMethod getDigestMethod() {
        return this.digestMethod;
    }

    public void setDigestMethod(final NF3eDigestMethod digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return this.digestValue;
    }

    public void setDigestValue(final String digestValue) {
        this.digestValue = digestValue;
    }
}