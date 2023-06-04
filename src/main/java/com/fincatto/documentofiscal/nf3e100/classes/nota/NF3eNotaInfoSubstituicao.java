package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoSubstituicao;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoSubstituicao extends DFBase {
    private static final long serialVersionUID = -8884799421631831055L;

    @Element(name = "chNF3e", required = false)
    private String chaveNF3e;

    @Element(name = "gNF", required = false)
    private NF3eNotaInfoSubstituicaoNF notaFiscal;

    @Element(name = "motSub", required = false)
    private NF3eMotivoSubstituicao motivoSubstituicao;

    public String getChaveNF3e() {
        return chaveNF3e;
    }

    public void setChaveNF3e(String chaveNF3e) {
        DFStringValidador.exatamente44N(chaveNF3e, "Chave da NF3e");
        this.chaveNF3e = chaveNF3e;
    }

    public NF3eNotaInfoSubstituicaoNF getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NF3eNotaInfoSubstituicaoNF notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public NF3eMotivoSubstituicao getMotivoSubstituicao() {
        return motivoSubstituicao;
    }

    public void setMotivoSubstituicao(NF3eMotivoSubstituicao motivoSubstituicao) {
        this.motivoSubstituicao = motivoSubstituicao;
    }
}
