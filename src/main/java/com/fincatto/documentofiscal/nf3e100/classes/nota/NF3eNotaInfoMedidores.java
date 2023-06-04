package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.time.LocalDate;

@Root(name = "gMed")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoMedidores extends DFBase {
    private static final long serialVersionUID = 6528182407460067347L;

    @Attribute(name = "nMed")
    private String referencia;

    @Element(name = "idMedidor")
    private String identificacao;

    @Element(name = "dMedAnt")
    private LocalDate leituraAnterior;

    @Element(name = "dMedAtu")
    private LocalDate leituraAtual;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public LocalDate getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(LocalDate leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public LocalDate getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(LocalDate leituraAtual) {
        this.leituraAtual = leituraAtual;
    }
}
