package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoProdutosServicosDetalheItemImposto extends DFBase {
    private static final long serialVersionUID = 126368432459922071L;

    @Element(name = "ICMS00", required = false)
    private NF3eNotaInfoItemImpostoICMS00 icms00;

    @Element(name = "ICMS10", required = false)
    private NF3eNotaInfoItemImpostoICMS10 icms10;

    @Element(name = "ICMS20", required = false)
    private NF3eNotaInfoItemImpostoICMS20 icms20;

    @Element(name = "ICMS40", required = false)
    private NF3eNotaInfoItemImpostoICMS40 icms40;

    @Element(name = "ICMS51", required = false)
    private NF3eNotaInfoItemImpostoICMS51 icms51;

    @Element(name = "ICMS60", required = false)
    private NF3eNotaInfoItemImpostoICMS60 icms60;

    @Element(name = "ICMS90", required = false)
    private NF3eNotaInfoItemImpostoICMS90 icms90;

    @Element(name = "indSemCST", required = false)
    private Integer indicadorSemSituacaoTributaria;

    @Element(name = "PIS", required = false)
    private NF3eNotaInfoItemImpostoPIS pis;

    @Element(name = "PISEfet", required = false)
    private NF3eNotaInfoItemImpostoPISEfetivo pisEfet;

    @Element(name = "COFINS", required = false)
    private NF3eNotaInfoItemImpostoCOFINS cofins;

    @Element(name = "COFINSEfet", required = false)
    private NF3eNotaInfoItemImpostoCOFINSEfetivo cofinsEfet;

    @Element(name = "retTrib", required = false)
    private NF3eNotaInfoItemRetencaoTributos retTrib;

    public NF3eNotaInfoItemImpostoICMS00 getIcms00() {
        return icms00;
    }

    public void setIcms00(NF3eNotaInfoItemImpostoICMS00 icms00) {
        this.icms00 = icms00;
    }

    public NF3eNotaInfoItemImpostoICMS10 getIcms10() {
        return icms10;
    }

    public void setIcms10(NF3eNotaInfoItemImpostoICMS10 icms10) {
        this.icms10 = icms10;
    }

    public NF3eNotaInfoItemImpostoICMS20 getIcms20() {
        return icms20;
    }

    public void setIcms20(NF3eNotaInfoItemImpostoICMS20 icms20) {
        this.icms20 = icms20;
    }

    public NF3eNotaInfoItemImpostoICMS40 getIcms40() {
        return icms40;
    }

    public void setIcms40(NF3eNotaInfoItemImpostoICMS40 icms40) {
        this.icms40 = icms40;
    }

    public NF3eNotaInfoItemImpostoICMS51 getIcms51() {
        return icms51;
    }

    public void setIcms51(NF3eNotaInfoItemImpostoICMS51 icms51) {
        this.icms51 = icms51;
    }

    public NF3eNotaInfoItemImpostoICMS60 getIcms60() {
        return icms60;
    }

    public void setIcms60(NF3eNotaInfoItemImpostoICMS60 icms60) {
        this.icms60 = icms60;
    }

    public NF3eNotaInfoItemImpostoICMS90 getIcms90() {
        return icms90;
    }

    public void setIcms90(NF3eNotaInfoItemImpostoICMS90 icms90) {
        this.icms90 = icms90;
    }

    public Integer getIndicadorSemSituacaoTributaria() {
        return indicadorSemSituacaoTributaria;
    }

    public void setIndicadorSemSituacaoTributaria(Integer indicadorSemSituacaoTributaria) {
        DFIntegerValidador.exatamente1(indicadorSemSituacaoTributaria, "Indicador Sem Situacao Tributaria");
        this.indicadorSemSituacaoTributaria = indicadorSemSituacaoTributaria;
    }

    public NF3eNotaInfoItemImpostoPIS getPis() {
        return pis;
    }

    public void setPis(NF3eNotaInfoItemImpostoPIS pis) {
        this.pis = pis;
    }

    public NF3eNotaInfoItemImpostoPISEfetivo getPisEfet() {
        return pisEfet;
    }

    public void setPisEfet(NF3eNotaInfoItemImpostoPISEfetivo pisEfet) {
        this.pisEfet = pisEfet;
    }

    public NF3eNotaInfoItemImpostoCOFINS getCofins() {
        return cofins;
    }

    public void setCofins(NF3eNotaInfoItemImpostoCOFINS cofins) {
        this.cofins = cofins;
    }

    public NF3eNotaInfoItemImpostoCOFINSEfetivo getCofinsEfet() {
        return cofinsEfet;
    }

    public void setCofinsEfet(NF3eNotaInfoItemImpostoCOFINSEfetivo cofinsEfet) {
        this.cofinsEfet = cofinsEfet;
    }

    public NF3eNotaInfoItemRetencaoTributos getRetTrib() {
        return retTrib;
    }

    public void setRetTrib(NF3eNotaInfoItemRetencaoTributos retTrib) {
        this.retTrib = retTrib;
    }
}
