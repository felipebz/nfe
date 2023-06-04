package com.fincatto.documentofiscal.nf3e100.classes.nota.consulta;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.envio.NF3eProtocolo;
import org.simpleframework.xml.*;

import java.util.List;

@Root(name = "retConsSitNF3e", strict = false)
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaConsultaRetorno extends DFBase {
    private static final long serialVersionUID = 2421530323583545334L;

    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "tpAmb")
    private DFAmbiente ambiente;
    
    @Element(name = "verAplic")
    private String versaoAplicacao;
    
    @Element(name = "cStat")
    private String status;
    
    @Element(name = "xMotivo")
    private String motivo;
    
    @Element(name = "cUF")
    private DFUnidadeFederativa uf;

    @Element(name = "protNF3e", required = false)
    protected NF3eProtocolo protocolo;

    @ElementList(entry = "procEventoNF3e", inline = true, required = false)
    private List<NF3eProtocoloEvento> protocoloEvento;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getVersaoAplicacao() {
        return this.versaoAplicacao;
    }

    public void setVersaoAplicacao(final String versaoAplicacao) {
        this.versaoAplicacao = versaoAplicacao;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public DFUnidadeFederativa getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public NF3eProtocolo getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(final NF3eProtocolo protocolo) {
        this.protocolo = protocolo;
    }

    public List<NF3eProtocoloEvento> getProtocoloEvento() {
        return protocoloEvento;
    }

    public void setProtocoloEvento(List<NF3eProtocoloEvento> protocoloEvento) {
        this.protocoloEvento = protocoloEvento;
    }
}