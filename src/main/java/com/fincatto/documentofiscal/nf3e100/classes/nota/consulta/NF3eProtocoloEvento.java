package com.fincatto.documentofiscal.nf3e100.classes.nota.consulta;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eEvento;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eEventoRetorno;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "procEventoNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eProtocoloEvento extends DFBase {
    private static final long serialVersionUID = -97363403798044615L;

    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "eventoNF3e")
    private NF3eEvento evento;

    @Element(name = "retEventoNF3e", required = false)
    private NF3eEventoRetorno eventoRetorno;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public NF3eEvento getEvento() {
        return this.evento;
    }

    public void setEvento(final NF3eEvento evento) {
        this.evento = evento;
    }

    public void setEventoRetorno(final NF3eEventoRetorno infoEventoRetorno) {
        this.eventoRetorno = infoEventoRetorno;
    }

    public NF3eEventoRetorno getEventoRetorno() {
        return this.eventoRetorno;
    }
}
