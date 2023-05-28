package com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class NF3eSignature extends DFBase {
	private static final long serialVersionUID = 4057860940440076358L;

	@Attribute(name = "Id", required = false)
	private String id;

	@Element(name = "SignedInfo", required = false)
	private NF3eSignedInfo signedInfo;

	@Element(name = "SignatureValue", required = false)
	private String signatureValue;

	@Element(name = "KeyInfo", required = false)
	private NF3eKeyInfo keyInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NF3eSignedInfo getSignedInfo() {
		return this.signedInfo;
	}

	public void setSignedInfo(final NF3eSignedInfo signedInfo) {
		this.signedInfo = signedInfo;
	}

	public String getSignatureValue() {
		return this.signatureValue;
	}

	public void setSignatureValue(final String signatureValue) {
		this.signatureValue = signatureValue;
	}

	public NF3eKeyInfo getKeyInfo() {
		return this.keyInfo;
	}

	public void setKeyInfo(final NF3eKeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
}