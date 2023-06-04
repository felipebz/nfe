package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoAcessante extends DFBase {
    private static final long serialVersionUID = 1461390165210810549L;

    @Element(name = "idAcesso")
    private String identificacaoPontoAcesso;

    @Element(name = "idCodCliente", required = false)
    private String identificacaoCliente;

    @Element(name = "tpAcesso")
    private NF3eTipoAcessante tipo;

    @Element(name = "xNomeUC", required = false)
    private String nomeUnidadeConsumidora;

    @Element(name = "tpClasse", required = false)
    private NF3eClasseConsumo classeConsumo;

    @Element(name = "tpSubClasse", required = false)
    private NF3eSubclasseConsumo subclasseConsumo;

    @Element(name = "tpFase")
    private NF3eTipoFase tipoLigacao;

    @Element(name = "tpGrpTensao")
    private NF3eGrupoTensao grupoTensao;

    @Element(name = "tpModTar")
    private NF3eModalidadeTarifa modalidadeTarifa;

    @Element(name = "latGPS")
    private String latitude;

    @Element(name = "longGPS")
    private String longitude;

    @Element(name = "codRoteiroLeitura", required = false)
    private String codigoRoteiroLeitura;

    public String getIdentificacaoPontoAcesso() {
        return identificacaoPontoAcesso;
    }

    public void setIdentificacaoPontoAcesso(String identificacaoPontoAcesso) {
        DFStringValidador.tamanho15(identificacaoPontoAcesso, "Identificacao Ponto Acesso");
        this.identificacaoPontoAcesso = identificacaoPontoAcesso;
    }

    public String getIdentificacaoCliente() {
        return identificacaoCliente;
    }

    public void setIdentificacaoCliente(String identificacaoCliente) {
        DFStringValidador.tamanho20(identificacaoCliente, "Identificacao Cliente");
        this.identificacaoCliente = identificacaoCliente;
    }

    public NF3eTipoAcessante getTipo() {
        return tipo;
    }

    public void setTipo(NF3eTipoAcessante tipo) {
        this.tipo = tipo;
    }

    public String getNomeUnidadeConsumidora() {
        return nomeUnidadeConsumidora;
    }

    public void setNomeUnidadeConsumidora(String nomeUnidadeConsumidora) {
        DFStringValidador.tamanho2ate60(nomeUnidadeConsumidora, "Nome Unidade Consumidora");
        this.nomeUnidadeConsumidora = nomeUnidadeConsumidora;
    }

    public NF3eClasseConsumo getClasseConsumo() {
        return classeConsumo;
    }

    public void setClasseConsumo(NF3eClasseConsumo classeConsumo) {
        this.classeConsumo = classeConsumo;
    }

    public NF3eSubclasseConsumo getSubclasseConsumo() {
        return subclasseConsumo;
    }

    public void setSubclasseConsumo(NF3eSubclasseConsumo subclasseConsumo) {
        this.subclasseConsumo = subclasseConsumo;
    }

    public NF3eTipoFase getTipoLigacao() {
        return tipoLigacao;
    }

    public void setTipoLigacao(NF3eTipoFase tipoLigacao) {
        this.tipoLigacao = tipoLigacao;
    }

    public NF3eGrupoTensao getGrupoTensao() {
        return grupoTensao;
    }

    public void setGrupoTensao(NF3eGrupoTensao grupoTensao) {
        this.grupoTensao = grupoTensao;
    }

    public NF3eModalidadeTarifa getModalidadeTarifa() {
        return modalidadeTarifa;
    }

    public void setModalidadeTarifa(NF3eModalidadeTarifa modalidadeTarifa) {
        this.modalidadeTarifa = modalidadeTarifa;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCodigoRoteiroLeitura() {
        return codigoRoteiroLeitura;
    }

    public void setCodigoRoteiroLeitura(String codigoRoteiroLeitura) {
        DFStringValidador.tamanho100(codigoRoteiroLeitura, "Codigo Roteiro Leitura");
        this.codigoRoteiroLeitura = codigoRoteiroLeitura;
    }
}
