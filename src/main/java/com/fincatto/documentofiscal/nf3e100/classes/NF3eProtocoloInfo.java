package com.fincatto.documentofiscal.nf3e100.classes;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Tipo Protocolo de status resultado do processamento da NF3e<br>
 * Dados do protocolo de status
 */

@Root(name = "infProt")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eProtocoloInfo extends DFBase {
    private static final long serialVersionUID = -6767121633444305271L;
    
    @Element(name = "tpAmb")
    private DFAmbiente ambiente;
    
    @Element(name = "verAplic")
    private String versaoAplicacao;
    
    @Element(name = "chNF3e")
    private String chave;
    
    @Element(name = "dhRecbto")
    private String dataRecebimento;

    @Element(name = "nProt", required = false)
    private String numeroProtocolo;

    @Element(name = "digVal", required = false)
    private String validador;
    
    @Element(name = "cStat")
    private String status;
    
    @Element(name = "xMotivo")
    private String motivo;

    @Attribute(name = "Id", required = false)
    private String id;

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    /**
     * Identificação do Ambiente:<br>
     * 1 - Produção<br>
     * 2 - Homologação
     */
    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getVersaoAplicacao() {
        return this.versaoAplicacao;
    }

    /**
     * Versão do Aplicativo que processou a NF3e
     */
    public void setVersaoAplicacao(final String versaoAplicacao) {
        this.versaoAplicacao = versaoAplicacao;
    }

    public String getChave() {
        return this.chave;
    }

    /**
     * Chaves de acesso da NF3e, compostas por: UF do emitente, AAMM da emissão da NF3e, CNPJ do emitente, modelo, subsérie e número da NF3e e código numérico+DV.
     */
    public void setChave(final String chave) {
        this.chave = chave;
    }

    public String getDataRecebimento() {
        return this.dataRecebimento;
    }

    /**
     * Data e hora de processamento, no formato AAAA-MM-DDTHH:MM:SS TZD. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação. Em caso de Rejeição, com data e hora do recebimento do Lote de NF3e enviado.
     */
    public void setDataRecebimento(final String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    /**
     * Número do Protocolo de Status da NF3e. 1 posição tipo de autorizador (1 – Secretaria de Fazenda Estadual, 3 - SEFAZ Virtual RS, 5 - SEFAZ Virtual SP ); 2 posições ano; 10 seqüencial no ano.
     */
    public void setNumeroProtocolo(final String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public String getValidador() {
        return this.validador;
    }

    /**
     * Digest Value da NF3e processado. Utilizado para conferir a integridade da NF3e original.
     */
    public void setValidador(final String validador) {
        this.validador = validador;
    }

    public String getStatus() {
        return this.status;
    }

    /**
     * Código do status da NF3e.
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    public String getMotivo() {
        return this.motivo;
    }

    /**
     * Descrição literal do status da NF3e.
     */
    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public String getId() {
        return this.id;
    }

    /**
     *
     * */
    public void setId(final String id) {
        this.id = id;
    }
}
