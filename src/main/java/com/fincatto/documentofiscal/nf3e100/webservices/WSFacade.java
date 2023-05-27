package com.fincatto.documentofiscal.nf3e100.webservices;

import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.consultastatusservico.NF3eConsStatServRet;
import com.fincatto.documentofiscal.utils.DFSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class WSFacade {

    private final WSStatusConsulta wsStatusConsulta;

    public WSFacade(final NF3eConfig config) throws IOException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, CertificateException {
        Protocol.registerProtocol("https", new Protocol("https", new DFSocketFactory(config), 443));
        this.wsStatusConsulta = new WSStatusConsulta(config);
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

}