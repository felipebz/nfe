package com.fincatto.documentofiscal.nf3e100.webservices;

import com.fincatto.documentofiscal.DFLog;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eAutorizador100;
import com.fincatto.documentofiscal.nf3e100.classes.consultastatusservico.NF3eConsStatServ;
import com.fincatto.documentofiscal.nf3e100.classes.consultastatusservico.NF3eConsStatServRet;
import com.fincatto.documentofiscal.nf3e100.webservices.gerado.NF3EStatusServicoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.rmi.RemoteException;

class WSStatusConsulta implements DFLog {
    
    private static final String NOME_SERVICO = "STATUS";
    private final NF3eConfig config;
    
    WSStatusConsulta(final NF3eConfig config) {
        this.config = config;
    }

    NF3eConsStatServRet consultaStatus(final DFUnidadeFederativa uf) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(gerarDadosConsulta(this.config).toString());
        this.getLogger().debug(omElementConsulta.toString());
        
        final OMElement omElementResult = this.efetuaConsultaStatus(omElementConsulta, uf);
        this.getLogger().debug(omElementResult.toString());
        
        return this.config.getPersister().read(NF3eConsStatServRet.class, omElementResult.toString());
    }
    
    private static NF3eConsStatServ gerarDadosConsulta(final NF3eConfig config) {
        final NF3eConsStatServ consStatServ = new NF3eConsStatServ();
        consStatServ.setVersao("1.00");
        consStatServ.setAmbiente(config.getAmbiente());
        consStatServ.setServico(WSStatusConsulta.NOME_SERVICO);
        return consStatServ;
    }
    
    private OMElement efetuaConsultaStatus(final OMElement omElement, final DFUnidadeFederativa unidadeFederativa) throws RemoteException {
        final NF3EStatusServicoStub.Nf3EDadosMsg dados = new NF3EStatusServicoStub.Nf3EDadosMsg();
        dados.setExtraElement(omElement);
        
        final NF3eAutorizador100 autorizador = NF3eAutorizador100.valueOfCodigoUF(unidadeFederativa);
        final String endpoint = autorizador.getStatusServico(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para StatusServico, autorizador " + autorizador.name() + ", UF " + unidadeFederativa.name());
        }
        return new NF3EStatusServicoStub(endpoint, config, autorizador.getPrefixoSoapAction()).nf3EStatusServicoNF(dados).getExtraElement();
    }
}
