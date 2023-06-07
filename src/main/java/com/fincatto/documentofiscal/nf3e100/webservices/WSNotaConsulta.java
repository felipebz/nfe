package com.fincatto.documentofiscal.nf3e100.webservices;

import com.fincatto.documentofiscal.DFLog;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eAutorizador100;
import com.fincatto.documentofiscal.nf3e100.classes.nota.consulta.NF3eNotaConsulta;
import com.fincatto.documentofiscal.nf3e100.classes.nota.consulta.NF3eNotaConsultaRetorno;
import com.fincatto.documentofiscal.nf3e100.webservices.gerado.NF3EConsultaStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.math.BigDecimal;
import java.rmi.RemoteException;

class WSNotaConsulta implements DFLog {

    private static final String NOME_SERVICO = "CONSULTAR";
    private final NF3eConfig config;

    WSNotaConsulta(final NF3eConfig config) {
        this.config = config;
    }

    NF3eNotaConsultaRetorno consultaNota(final String chaveDeAcesso) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(gerarDadosConsulta(this.config, chaveDeAcesso).toString());
        this.getLogger().debug(omElementConsulta.toString());
        
        final OMElement omElementResult = this.efetuaConsulta(omElementConsulta, chaveDeAcesso);
        this.getLogger().debug(omElementResult.toString());
        
        return this.config.getPersister().read(NF3eNotaConsultaRetorno.class, omElementResult.toString());
    }
    
    private static NF3eNotaConsulta gerarDadosConsulta(final NF3eConfig config, final String chaveDeAcesso) {
        final NF3eNotaConsulta notaConsulta = new NF3eNotaConsulta();
        notaConsulta.setVersao(new BigDecimal("1.00"));
        notaConsulta.setAmbiente(config.getAmbiente());
        notaConsulta.setServico(WSNotaConsulta.NOME_SERVICO);
        notaConsulta.setChave(chaveDeAcesso);
        return notaConsulta;
    }
    
    private OMElement efetuaConsulta(final OMElement omElement,final String chaveDeAcesso) throws RemoteException {
        final NF3EConsultaStub.Nf3EDadosMsg dados = new NF3EConsultaStub.Nf3EDadosMsg();
        dados.setExtraElement(omElement);
        
        final NF3eAutorizador100 autorizador = NF3eAutorizador100.valueOfChaveAcesso(chaveDeAcesso);
        final String endpoint = autorizador.getConsultaProtocolo(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para ConsultaProtocolo, autorizador " + autorizador.name());
        }
        return new NF3EConsultaStub(endpoint, config, autorizador.getPrefixoSoapAction()).nf3EConsultaNF(dados).getExtraElement();
    }
}
