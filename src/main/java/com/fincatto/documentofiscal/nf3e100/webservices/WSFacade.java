package com.fincatto.documentofiscal.nf3e100.webservices;

import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.consultastatusservico.NF3eConsStatServRet;
import com.fincatto.documentofiscal.nf3e100.classes.evento.NF3eEventoRetorno;
import com.fincatto.documentofiscal.nf3e100.classes.nota.consulta.NF3eNotaConsultaRetorno;
import com.fincatto.documentofiscal.utils.DFSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class WSFacade {

    private final WSNotaConsulta wsNotaConsulta;
    private final WSStatusConsulta wsStatusConsulta;
    private final WSCancelamento wsCancelamento;

    public WSFacade(final NF3eConfig config) throws IOException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, CertificateException {
        Protocol.registerProtocol("https", new Protocol("https", new DFSocketFactory(config), 443));
        this.wsNotaConsulta = new WSNotaConsulta(config);
        this.wsStatusConsulta = new WSStatusConsulta(config);
        this.wsCancelamento = new WSCancelamento(config);
    }

    /**
     * Faz a consulta da nota.
     *
     * @param chaveDeAcesso chave de acesso da nota
     * @return dados da consulta da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public NF3eNotaConsultaRetorno consultaNota(final String chaveDeAcesso) throws Exception {
        return this.wsNotaConsulta.consultaNota(chaveDeAcesso);
    }

    /**
     * Faz a consulta de status responsavel pela UF
     *
     * @param uf uf UF que deseja consultar o status do sefaz responsavel
     * @return dados da consulta de status retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public NF3eConsStatServRet consultaStatus(final DFUnidadeFederativa uf) throws Exception {
        return this.wsStatusConsulta.consultaStatus(uf);
    }

    /**
     * Faz o cancelamento da NF3e
     *
     * @param chave     chave de acesso da nota
     * @param numeroProtocolo numero do protocolo da nota
     * @param motivo          motivo do cancelamento
     * @return dados do cancelamento da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public NF3eEventoRetorno cancelaNota(final String chave, final String numeroProtocolo, final String motivo) throws Exception {
        return this.wsCancelamento.cancelaNota(chave, numeroProtocolo, motivo);
    }

    /**
     * Faz o cancelamento da nota com evento ja assinado
     * ATENCAO: Esse metodo deve ser utilizado para assinaturas A3
     *
     * @param chave       chave de acesso da nota
     * @param eventoAssinadoXml evento ja assinado em formato XML
     * @return dados do cancelamento da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public NF3eEventoRetorno cancelaNotaAssinada(final String chave, final String eventoAssinadoXml) throws Exception {
        return this.wsCancelamento.cancelaNotaAssinada(chave, eventoAssinadoXml);
    }

    /**
     * Gera o XML assinado do cancelamento sem enviar para a SEFAZ.
     * @param chave           chave de acesso da NF3e
     * @param numeroProtocolo numero do protocolo da nota
     * @param motivo          motivo do cancelamento
     * @return O XML da requisicao de registro multimodal ja assinado
     * @throws Exception caso nao consiga gerar o xml
     */
    public String getXmlAssinadoCancelamento(final String chave, final String numeroProtocolo, final String motivo) throws Exception {
        return this.wsCancelamento.getXmlAssinado(chave, numeroProtocolo, motivo);
    }

}