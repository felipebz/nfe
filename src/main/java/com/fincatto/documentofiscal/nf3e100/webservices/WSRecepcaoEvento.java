package com.fincatto.documentofiscal.nf3e100.webservices;

import com.fincatto.documentofiscal.DFLog;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eAutorizador100;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eDetalhamentoEvento;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eEvento;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eInfoEvento;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eTipoEvento;
import com.fincatto.documentofiscal.nf3e100.parsers.NF3eChaveParser;
import com.fincatto.documentofiscal.nf3e100.webservices.gerado.NF3ERecepcaoEventoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

abstract class WSRecepcaoEvento implements DFLog {

    protected final NF3eConfig config;

    WSRecepcaoEvento(NF3eConfig config) {
        this.config = config;
    }

    protected OMElement efetuaEvento(final String xmlAssinado, final String chaveAcesso) throws Exception {
        final NF3eChaveParser ctChaveParser = new NF3eChaveParser(chaveAcesso);

        final NF3ERecepcaoEventoStub.Nf3EDadosMsg dados = new NF3ERecepcaoEventoStub.Nf3EDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        this.getLogger().debug(omElementXML.toString());
        dados.setExtraElement(omElementXML);

        final NF3eAutorizador100 autorizador = NF3eAutorizador100.valueOfChaveAcesso(chaveAcesso);
        final String urlWebService = autorizador.getRecepcaoEvento(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RecepcaoEvento " + ctChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }

        NF3ERecepcaoEventoStub.Nf3EResultMsg cteRecepcaoEventoResult = new NF3ERecepcaoEventoStub(urlWebService, config).nF3ERecepcaoEvento(dados);
        final OMElement omElementResult = cteRecepcaoEventoResult.getExtraElement();
        this.getLogger().debug(omElementResult.toString());
        return omElementResult;
    }

    protected NF3eEvento gerarEvento(String chaveAcesso, BigDecimal versao, NF3eTipoEvento evento, String codigoEvento, int sequencialEvento) {
        final NF3eChaveParser chaveParser = new NF3eChaveParser(chaveAcesso);

        NF3eDetalhamentoEvento cteDetalhamentoEventoCancelamento = new NF3eDetalhamentoEvento();
        cteDetalhamentoEventoCancelamento.setVersaoEvento(versao);
        cteDetalhamentoEventoCancelamento.setEvento(evento);

        final NF3eInfoEvento infoEvento = new NF3eInfoEvento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        infoEvento.setDataHoraEvento(ZonedDateTime.now(this.config.getTimeZone().toZoneId()));
        infoEvento.setId(String.format("ID%s%s0%03d", codigoEvento, chaveAcesso, sequencialEvento));
        infoEvento.setNumeroSequencialEvento(sequencialEvento);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa());
        infoEvento.setCodigoEvento(codigoEvento);
        infoEvento.setDetalheEvento(cteDetalhamentoEventoCancelamento);

        NF3eEvento nf3eEvento = new NF3eEvento();
        nf3eEvento.setInfoEvento(infoEvento);
        nf3eEvento.setVersao(versao);

        return nf3eEvento;
    }


}
