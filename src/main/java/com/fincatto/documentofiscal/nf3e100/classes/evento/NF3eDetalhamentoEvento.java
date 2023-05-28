package com.fincatto.documentofiscal.nf3e100.classes.evento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.evento.cancelamento.NF3eEnviaEventoCancelamento;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.*;

import java.math.BigDecimal;

@Root(name = "detEvento")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eDetalhamentoEvento extends DFBase {
    private static final long serialVersionUID = 7625923998721410241L;

    @Attribute(name = "versaoEvento")
    private String versaoEvento;

    @ElementUnion({
            @Element(name = "evCancNF3e", type = NF3eEnviaEventoCancelamento.class),
    })
    private NF3eTipoEvento evento;

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = DFBigDecimalValidador.tamanho5Com2CasasDecimais(versaoEvento, "Versao do Evento");
    }

    public String getVersaoEvento() {
        return this.versaoEvento;
    }

    public NF3eTipoEvento getEvento() {
        return this.evento;
    }

    public void setEvento(final NF3eTipoEvento evento) {
        this.evento = evento;
    }

    public NF3eEnviaEventoCancelamento getCancelamento() {
        if (this.evento instanceof NF3eEnviaEventoCancelamento) {
            return (NF3eEnviaEventoCancelamento) this.evento;
        }
        throw new IllegalStateException("Evento não é cancelamento");
    }
}