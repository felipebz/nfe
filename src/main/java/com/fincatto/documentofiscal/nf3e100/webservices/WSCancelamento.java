package com.fincatto.documentofiscal.nf3e100.webservices;

import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eDetalhamentoEvento;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eEvento;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eEventoRetorno;
import com.fincatto.documentofiscal.nf3e100.classes.evento.cancelamento.NF3eEnviaEventoCancelamento;
import com.fincatto.documentofiscal.utils.DFAssinaturaDigital;
import org.apache.axiom.om.OMElement;

import java.math.BigDecimal;

class WSCancelamento extends WSRecepcaoEvento {
    
    private static final String DESCRICAO_EVENTO = "Cancelamento";
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("1.00");
    private static final String EVENTO_CANCELAMENTO = "110111";
    
    WSCancelamento(final NF3eConfig config) {
        super(config);
    }
    
    NF3eEventoRetorno cancelaNotaAssinada(final String chaveAcesso, final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaCancelamento(eventoAssinadoXml, chaveAcesso);
        return this.config.getPersister().read(NF3eEventoRetorno.class, omElementResult.toString());
    }

    NF3eEventoRetorno cancelaNota(final String chaveAcesso, final String numeroProtocolo, final String motivo) throws Exception {
        final String xmlAssinado = this.getXmlAssinado(chaveAcesso, numeroProtocolo, motivo);
        final OMElement omElementResult = this.efetuaCancelamento(xmlAssinado, chaveAcesso);
        return this.config.getPersister().read(NF3eEventoRetorno.class, omElementResult.toString());
    }

    String getXmlAssinado(final String chaveAcesso, final String numeroProtocolo, final String motivo) throws Exception {
        final String xml = this.gerarDadosCancelamento(chaveAcesso, numeroProtocolo, motivo).toString();
        return new DFAssinaturaDigital(this.config).assinarDocumento(xml);
    }
    private OMElement efetuaCancelamento(final String xmlAssinado, final String chaveAcesso) throws Exception {
        return super.efetuaEvento(xmlAssinado, chaveAcesso);
    }

    private NF3eEvento gerarDadosCancelamento(final String chaveAcesso, final String numeroProtocolo, final String motivo) {
        final NF3eEnviaEventoCancelamento cancelamento = new NF3eEnviaEventoCancelamento();
        cancelamento.setDescricaoEvento(WSCancelamento.DESCRICAO_EVENTO);
        cancelamento.setJustificativa(motivo.trim());
        cancelamento.setProtocoloAutorizacao(numeroProtocolo);
        NF3eDetalhamentoEvento cTeDetalhamentoEventoCancelamento = new NF3eDetalhamentoEvento();
        cTeDetalhamentoEventoCancelamento.setVersaoEvento(WSCancelamento.VERSAO_LEIAUTE);
        cTeDetalhamentoEventoCancelamento.setEvento(cancelamento);

        return super.gerarEvento(chaveAcesso, WSCancelamento.VERSAO_LEIAUTE, cancelamento, WSCancelamento.EVENTO_CANCELAMENTO, 1);
    }
}
