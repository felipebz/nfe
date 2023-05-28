package com.fincatto.documentofiscal.nf3e100.classes.evento.cancelamento;

import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eTipoEvento;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "evCancNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eEnviaEventoCancelamento extends NF3eTipoEvento {
    private static final long serialVersionUID = -5707161236852966181L;

    @Element(name = "nProt")
    private String protocoloAutorizacao;

    @Element(name = "xJust")
    private String justificativa;

    public void setJustificativa(final String justificativa) {
        DFStringValidador.tamanho15a256(justificativa, "Justificativa");
        this.justificativa = justificativa;
    }

    public void setProtocoloAutorizacao(final String protocoloAutorizacao) {
        DFStringValidador.exatamente15N(protocoloAutorizacao, "Protocolo de Autorizacao");
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public String getProtocoloAutorizacao() {
        return this.protocoloAutorizacao;
    }

}