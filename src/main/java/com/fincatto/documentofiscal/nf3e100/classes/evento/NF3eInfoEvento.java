package com.fincatto.documentofiscal.nf3e100.classes.evento;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.time.ZonedDateTime;

@Root(name = "infEvento")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eInfoEvento extends DFBase {
    private static final long serialVersionUID = 2968523870335565873L;

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "cOrgao", required = false)
    private DFUnidadeFederativa orgao;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "CNPJ", required = false)
    private String cnpj;
    
    @Element(name = "chNF3e")
    private String chave;
    
    @Element(name = "dhEvento")
    private ZonedDateTime dataHoraEvento;
    
    @Element(name = "tpEvento")
    private String codigoEvento;
    
    @Element(name = "nSeqEvento")
    private Integer numeroSequencialEvento;

    @Element(name = "detEvento")
    private NF3eDetalhamentoEvento detalheEvento;

    public void setOrgao(final DFUnidadeFederativa orgao) {
        this.orgao = orgao;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        DFStringValidador.exatamente54(id, "Info Evento ID");
        this.id = id;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getChave() {
        return this.chave;
    }

    public void setChave(final String chave) {
        DFStringValidador.exatamente44N(chave, "Info Evento Chave");
        this.chave = chave;
    }

    public ZonedDateTime getDataHoraEvento() {
        return this.dataHoraEvento;
    }

    public void setDataHoraEvento(final ZonedDateTime dataHoraEvento) {
        this.dataHoraEvento = dataHoraEvento;
    }

    public String getCodigoEvento() {
        return this.codigoEvento;
    }

    public void setCodigoEvento(final String codigoEvento) {
        DFStringValidador.exatamente6N(codigoEvento, "Info Evento Codigo");
        this.codigoEvento = codigoEvento;
    }

    public int getNumeroSequencialEvento() {
        return this.numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(final int numeroSequencialEvento) {
        DFIntegerValidador.tamanho1a2(numeroSequencialEvento, "Numero Sequencial Evento");
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public DFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public void setNumeroSequencialEvento(final Integer numeroSequencialEvento) {
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public NF3eDetalhamentoEvento getDetalheEvento() {
        return this.detalheEvento;
    }

    public void setDetalheEvento(final NF3eDetalhamentoEvento detalheEvento) {
        this.detalheEvento = detalheEvento;
    }
}