package com.fincatto.documentofiscal.nf3e100.classes.envio;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "retNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eEnvioRetorno extends DFBase {
    private static final long serialVersionUID = 2480453916706864602L;

    @Element(name = "tpAmb", required = false)
    private DFAmbiente ambiente;

    @Element(name = "cUF", required = false)
    private DFUnidadeFederativa uf;

    @Element(name = "verAplic", required = false)
    private String versaoAplicacao;

    @Element(name = "cStat", required = false)
    private String status;

    @Element(name = "xMotivo", required = false)
    private String motivo;

    @Element(name = "protNF3e", required = false)
    private NF3eProtocolo protocolo;

    @Attribute(name = "versao", required = false)
    private String versao;

    public DFAmbiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public DFUnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getVersaoAplicacao() {
        return versaoAplicacao;
    }

    public void setVersaoAplicacao(String versaoAplicacao) {
        this.versaoAplicacao = versaoAplicacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public NF3eProtocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(NF3eProtocolo protocolo) {
        this.protocolo = protocolo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}