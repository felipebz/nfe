package com.fincatto.documentofiscal.nf3e100.classes.evento;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.nota.assinatura.NF3eSignature;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.time.LocalDateTime;

@Root(name = "infEvento")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eInfoEventoRetorno extends DFBase {
    private static final long serialVersionUID = -74205088995028092L;

    @Attribute(name = "Id", required = false)
    private String id;
    
    @Element(name = "tpAmb")
    private DFAmbiente ambiente;
    
    @Element(name = "verAplic")
    private String versaoAplicativo;
    
    @Element(name = "cOrgao")
    private DFUnidadeFederativa orgao;
    
    @Element(name = "cStat")
    private Integer codigoStatus;
    
    @Element(name = "xMotivo")
    private String motivo;

    @Element(name = "chNF3e", required = false)
    private String chave;

    @Element(name = "tpEvento", required = false)
    private String tipoEvento;

    @Element(name = "xEvento", required = false)
    private String descricaoEvento;

    @Element(name = "nSeqEvento", required = false)
    private Integer numeroSequencialEvento;
    
    @Element(name = "dhRegEvento")
    private LocalDateTime dataHoraRegistro;

    @Element(name = "nProt", required = false)
    private String numeroProtocolo;

    @Element(name = "Signature", required = false)
    private NF3eSignature assinatura;

    public String getId() {
        return this.id;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public String getVersaoAplicativo() {
        return this.versaoAplicativo;
    }

    public DFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public Integer getCodigoStatus() {
        return this.codigoStatus;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public String getChave() {
        return this.chave;
    }

    public String getTipoEvento() {
        return this.tipoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public Integer getNumeroSequencialEvento() {
        return this.numeroSequencialEvento;
    }

    public LocalDateTime getDataHoraRegistro() {
        return this.dataHoraRegistro;
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setVersaoAplicativo(final String versaoAplicativo) {
        this.versaoAplicativo = versaoAplicativo;
    }

    public void setOrgao(final DFUnidadeFederativa orgao) {
        this.orgao = orgao;
    }

    public void setCodigoStatus(final Integer codigoStatus) {
        this.codigoStatus = codigoStatus;
    }

    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public void setChave(final String chave) {
        this.chave = chave;
    }

    public void setTipoEvento(final String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setDescricaoEvento(final String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public void setNumeroSequencialEvento(final Integer numeroSequencialEvento) {
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public void setDataHoraRegistro(final LocalDateTime dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
    }

    public void setNumeroProtocolo(final String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public NF3eSignature getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(NF3eSignature assinatura) {
        this.assinatura = assinatura;
    }
}