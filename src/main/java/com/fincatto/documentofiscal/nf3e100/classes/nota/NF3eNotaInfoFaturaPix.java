package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoFaturaPix extends DFBase {
    private static final long serialVersionUID = -3788593073728756962L;

    @Element(name = "urlQRCodePIX")
    private String urlQRCodePIX;

    public String getUrlQRCodePIX() {
        return urlQRCodePIX;
    }

    public void setUrlQRCodePIX(String urlQRCodePIX) {
        DFStringValidador.tamanho2000(urlQRCodePIX, "URL QRCode PIX");
        this.urlQRCodePIX = urlQRCodePIX;
    }
}
