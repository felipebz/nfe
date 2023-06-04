package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoJudicial extends DFBase {
    private static final long serialVersionUID = 6314282550509580715L;

    @Element(name = "chNF3e")
    private String chaveNF3e;

    public String getChaveNF3e() {
        return chaveNF3e;
    }

    public void setChaveNF3e(String chaveNF3e) {
        DFStringValidador.exatamente44N(chaveNF3e, "Chave da NF3e");
        this.chaveNF3e = chaveNF3e;
    }
}
