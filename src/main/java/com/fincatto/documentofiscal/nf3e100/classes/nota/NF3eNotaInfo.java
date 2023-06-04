package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.*;

import java.util.List;

@Root(name = "infNF3e")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfo extends DFBase {
    public static final String IDENT = "NF3e";
    private static final long serialVersionUID = 5691988108908497820L;

    @Attribute(name = "Id")
    private String identificador;
    
    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "ide")
    private NF3eNotaInfoIdentificacao identificacao;
    
    @Element(name = "emit")
    private NF3eNotaInfoEmitente emitente;

    @Element(name = "dest")
    private NF3eNotaInfoDestinatario destinatario;

    @Element(name = "acessante")
    private NF3eNotaInfoAcessante acessante;

    @Element(name = "gSub", required = false)
    private NF3eNotaInfoSubstituicao substituicao;

    @Element(name = "gJudic", required = false)
    private NF3eNotaInfoJudicial separacaoJudicial;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoQuantidadeContratada> quantidadesContratadas;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoMedidores> medidores;

    @ElementList(inline = true, required = false)
    private List<NF3eNotaInfoSCEE> infoSCEE;

    @ElementList(inline = true)
    private List<NF3eNotaInfoProdutosServicos> produtosServicos;

    @Element(name = "total")
    private NF3eNotaInfoTotal total;

    @Element(name = "gFat")
    private NF3eNotaInfoFatura fatura;

    @Element(name = "gANEEL")
    private NF3eNotaInfoANEEL infoANEEL;

    @ElementList(entry = "autXML", inline = true, required = false)
    private List<NF3ePessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe;

    @Element(name = "infAdic", required = false)
    private NF3eNotaInfoInformacoesAdicionais informacoesAdicionais;

    @Element(name="gRespTec", required = false)
    private NF3eNotaInfoResponsavelTecnico informacaoResposavelTecnico;

    /**
     * Pega a chave de acesso a partir do identificador.
     * @return Chave de acesso.
     */
    public String getChaveAcesso() {
        return this.identificador.replace(NF3eNotaInfo.IDENT, "");
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        DFStringValidador.exatamente44N(identificador, "Identificador");
        this.identificador = NF3eNotaInfo.IDENT + identificador;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public NF3eNotaInfoIdentificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(NF3eNotaInfoIdentificacao identificacao) {
        this.identificacao = identificacao;
    }

    public NF3eNotaInfoEmitente getEmitente() {
        return emitente;
    }

    public void setEmitente(NF3eNotaInfoEmitente emitente) {
        this.emitente = emitente;
    }

    public NF3eNotaInfoDestinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(NF3eNotaInfoDestinatario destinatario) {
        this.destinatario = destinatario;
    }

    public NF3eNotaInfoAcessante getAcessante() {
        return acessante;
    }

    public void setAcessante(NF3eNotaInfoAcessante acessante) {
        this.acessante = acessante;
    }

    public NF3eNotaInfoSubstituicao getSubstituicao() {
        return substituicao;
    }

    public void setSubstituicao(NF3eNotaInfoSubstituicao substituicao) {
        this.substituicao = substituicao;
    }

    public NF3eNotaInfoJudicial getSeparacaoJudicial() {
        return separacaoJudicial;
    }

    public void setSeparacaoJudicial(NF3eNotaInfoJudicial separacaoJudicial) {
        this.separacaoJudicial = separacaoJudicial;
    }

    public List<NF3eNotaInfoQuantidadeContratada> getQuantidadesContratadas() {
        return quantidadesContratadas;
    }

    public void setQuantidadesContratadas(List<NF3eNotaInfoQuantidadeContratada> quantidadesContratadas) {
        this.quantidadesContratadas = quantidadesContratadas;
    }

    public List<NF3eNotaInfoMedidores> getMedidores() {
        return medidores;
    }

    public void setMedidores(List<NF3eNotaInfoMedidores> medidores) {
        this.medidores = medidores;
    }

    public List<NF3eNotaInfoSCEE> getInfoSCEE() {
        return infoSCEE;
    }

    public void setInfoSCEE(List<NF3eNotaInfoSCEE> infoSCEE) {
        this.infoSCEE = infoSCEE;
    }

    public List<NF3eNotaInfoProdutosServicos> getProdutosServicos() {
        return produtosServicos;
    }

    public void setProdutosServicos(List<NF3eNotaInfoProdutosServicos> produtosServicos) {
        this.produtosServicos = produtosServicos;
    }

    public NF3eNotaInfoTotal getTotal() {
        return total;
    }

    public void setTotal(NF3eNotaInfoTotal total) {
        this.total = total;
    }

    public NF3eNotaInfoFatura getFatura() {
        return fatura;
    }

    public void setFatura(NF3eNotaInfoFatura fatura) {
        this.fatura = fatura;
    }

    public NF3eNotaInfoANEEL getInfoANEEL() {
        return infoANEEL;
    }

    public void setInfoANEEL(NF3eNotaInfoANEEL infoANEEL) {
        this.infoANEEL = infoANEEL;
    }

    public List<NF3ePessoaAutorizadaDownloadNFe> getPessoasAutorizadasDownloadNFe() {
        return pessoasAutorizadasDownloadNFe;
    }

    public void setPessoasAutorizadasDownloadNFe(List<NF3ePessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe) {
        this.pessoasAutorizadasDownloadNFe = pessoasAutorizadasDownloadNFe;
    }

    public NF3eNotaInfoInformacoesAdicionais getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(NF3eNotaInfoInformacoesAdicionais informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public NF3eNotaInfoResponsavelTecnico getInformacaoResposavelTecnico() {
        return informacaoResposavelTecnico;
    }

    public void setInformacaoResposavelTecnico(NF3eNotaInfoResponsavelTecnico informacaoResposavelTecnico) {
        this.informacaoResposavelTecnico = informacaoResposavelTecnico;
    }
}