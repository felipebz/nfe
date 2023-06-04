package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.time.LocalDate;

@Root(name = "gAdBand")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoProdutosServicosDetalheItemBandeira extends DFBase {
    private static final long serialVersionUID = -6635013114553089861L;

    @Element(name = "dIniAdBand")
    private LocalDate dataInicioAdicionalBandeira;

    @Element(name = "dFimAdBand")
    private LocalDate dataFimAdicionalBandeira;

    @Element(name = "tpBand")
    private NF3eBandeira tipoBandeira;

    @Element(name = "vAdBand")
    private String valorAdicionalBandeira;

    @Element(name = "vAdBandAplic", required = false)
    private String valorAdicionalBandeiraAplicado;

    @Element(name = "motDifBand", required = false)
    private NF3eMotivoDiferencaBandeira motivoDiferencaBandeira;

    public LocalDate getDataInicioAdicionalBandeira() {
        return dataInicioAdicionalBandeira;
    }

    public void setDataInicioAdicionalBandeira(LocalDate dataInicioAdicionalBandeira) {
        this.dataInicioAdicionalBandeira = dataInicioAdicionalBandeira;
    }

    public LocalDate getDataFimAdicionalBandeira() {
        return dataFimAdicionalBandeira;
    }

    public void setDataFimAdicionalBandeira(LocalDate dataFimAdicionalBandeira) {
        this.dataFimAdicionalBandeira = dataFimAdicionalBandeira;
    }

    public NF3eBandeira getTipoBandeira() {
        return tipoBandeira;
    }

    public void setTipoBandeira(NF3eBandeira tipoBandeira) {
        this.tipoBandeira = tipoBandeira;
    }

    public String getValorAdicionalBandeira() {
        return valorAdicionalBandeira;
    }

    public void setValorAdicionalBandeira(BigDecimal valorAdicionalBandeira) {
        this.valorAdicionalBandeira = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorAdicionalBandeira, "Valor Adicional Bandeira");
    }

    public String getValorAdicionalBandeiraAplicado() {
        return valorAdicionalBandeiraAplicado;
    }

    public void setValorAdicionalBandeiraAplicado(BigDecimal valorAdicionalBandeiraAplicado) {
        this.valorAdicionalBandeiraAplicado = DFBigDecimalValidador.tamanho15comAte10CasasDecimais(valorAdicionalBandeiraAplicado, "Valor Adicional Bandeira Aplicado");
    }

    public NF3eMotivoDiferencaBandeira getMotivoDiferencaBandeira() {
        return motivoDiferencaBandeira;
    }

    public void setMotivoDiferencaBandeira(NF3eMotivoDiferencaBandeira motivoDiferencaBandeira) {
        this.motivoDiferencaBandeira = motivoDiferencaBandeira;
    }
}
