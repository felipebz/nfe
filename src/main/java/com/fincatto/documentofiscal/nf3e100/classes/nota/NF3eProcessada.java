package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.envio.NF3eProtocolo;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/*
 * Esse XSD existe nos schemas mas não está especificado no manual e, aparentemente, as empresas
 * não são obrigadas a seguí-lo para distribuição do XML para os clientes que solicitarem.
 * Por isso está definido com "strict = false" e apenas a tag "NF3e" é exigida.
 * A Energisa, por exemplo, envia um XML com raiz "Energisa" e as tags "NF3e" e "nf3eResultMsg" dentro e com essa classe
 * conseguimos pegar a tag NF3e interna corretamente.
 */
@Root(name = "nf3eProc", strict = false)
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eProcessada extends DFBase {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Attribute(name = "ipTransmissor", required = false)
    private String ipTransmissor;

    @Attribute(name = "nPortaCon", required = false)
    private String portaConexao;

    @Attribute(name = "dhConexao", required = false)
    private ZonedDateTime dataHoraConexao;

    @Element(name = "NF3e")
    private NF3eNota nota;

    @Element(name = "protNF3e", required = false)
    private NF3eProtocolo protocolo;

    public String getVersao() {
        return versao;
    }

    public void setVersao(BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao Nota Processada");
    }

    public String getIpTransmissor() {
        return ipTransmissor;
    }

    public void setIpTransmissor(String ipTransmissor) {
        this.ipTransmissor = ipTransmissor;
    }

    public String getPortaConexao() {
        return portaConexao;
    }

    public void setPortaConexao(String portaConexao) {
        this.portaConexao = portaConexao;
    }

    public ZonedDateTime getDataHoraConexao() {
        return dataHoraConexao;
    }

    public void setDataHoraConexao(ZonedDateTime dataHoraConexao) {
        this.dataHoraConexao = dataHoraConexao;
    }

    public NF3eNota getNota() {
        return nota;
    }

    public void setNota(NF3eNota nota) {
        this.nota = nota;
    }

    public NF3eProtocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(NF3eProtocolo protocolo) {
        this.protocolo = protocolo;
    }


}
