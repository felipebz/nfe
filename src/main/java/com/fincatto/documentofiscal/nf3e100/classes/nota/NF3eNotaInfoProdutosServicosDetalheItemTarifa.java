package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.*;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFIntegerValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.time.LocalDate;

@Root(name = "gTarif")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoProdutosServicosDetalheItemTarifa extends DFBase {
    private static final long serialVersionUID = -7669680953752454653L;

    @Element(name = "dIniTarif")
    private LocalDate dataInicioTarifa;

    @Element(name = "dFimTarif")
    private LocalDate dataFimTarifa;

    @Element(name = "tpAto")
    private NF3eTipoAtoANELL tipoAto;

    @Element(name = "nAto")
    private String numeroAto;

    @Element(name = "anoAto")
    private Integer anoAto;

    @Element(name = "tpTarif")
    private NF3eTipoTarifa tipoTarifa;

    @Element(name = "cPosTarif")
    private NF3eTipoPostoTarifarioCompleto tipoPosTarifa;

    @Element(name = "uMed")
    private NF3eUnidadeMedida unidadeMedida;

    @Element(name = "vTarifHom")
    private String valorTarifaHomologada;

    @Element(name = "vTarifAplic", required = false)
    private String valorTarifaAplicada;

    @Element(name = "motDifTarif", required = false)
    private NF3eMotivoDiferencaTarifa motivoDiferencaTarifa;

    public LocalDate getDataInicioTarifa() {
        return dataInicioTarifa;
    }

    public void setDataInicioTarifa(LocalDate dataInicioTarifa) {
        this.dataInicioTarifa = dataInicioTarifa;
    }

    public LocalDate getDataFimTarifa() {
        return dataFimTarifa;
    }

    public void setDataFimTarifa(LocalDate dataFimTarifa) {
        this.dataFimTarifa = dataFimTarifa;
    }

    public NF3eTipoAtoANELL getTipoAto() {
        return tipoAto;
    }

    public void setTipoAto(NF3eTipoAtoANELL tipoAto) {
        this.tipoAto = tipoAto;
    }

    public String getNumeroAto() {
        return numeroAto;
    }

    public void setNumeroAto(String numeroAto) {
        DFStringValidador.tamanho4(numeroAto, "Numero Ato");
        this.numeroAto = numeroAto;
    }

    public Integer getAnoAto() {
        return anoAto;
    }

    public void setAnoAto(Integer anoAto) {
        DFIntegerValidador.tamanho4(anoAto, "Ano Ato");
        this.anoAto = anoAto;
    }

    public NF3eTipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(NF3eTipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public NF3eTipoPostoTarifarioCompleto getTipoPosTarifa() {
        return tipoPosTarifa;
    }

    public void setTipoPosTarifa(NF3eTipoPostoTarifarioCompleto tipoPosTarifa) {
        this.tipoPosTarifa = tipoPosTarifa;
    }

    public NF3eUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(NF3eUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getValorTarifaHomologada() {
        return valorTarifaHomologada;
    }

    public void setValorTarifaHomologada(BigDecimal valorTarifaHomologada) {
        this.valorTarifaHomologada = DFBigDecimalValidador.tamanho17Com8CasasDecimais(valorTarifaHomologada, "Valor Tarifa Homologada");
    }

    public String getValorTarifaAplicada() {
        return valorTarifaAplicada;
    }

    public void setValorTarifaAplicada(String valorTarifaAplicada) {
        this.valorTarifaAplicada = DFBigDecimalValidador.tamanho17Com8CasasDecimais(new BigDecimal(valorTarifaAplicada), "Valor Tarifa Aplicada");
    }

    public NF3eMotivoDiferencaTarifa getMotivoDiferencaTarifa() {
        return motivoDiferencaTarifa;
    }

    public void setMotivoDiferencaTarifa(NF3eMotivoDiferencaTarifa motivoDiferencaTarifa) {
        this.motivoDiferencaTarifa = motivoDiferencaTarifa;
    }
}
