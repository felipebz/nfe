package com.fincatto.documentofiscal.nf3e100.classes.nota;


import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoPostoTarifario;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "gSaldoCred")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoSCEECreditosPorPosto extends DFBase {
    private static final long serialVersionUID = -384599758622804591L;

    @Element(name = "tpPosTar")
    private NF3eTipoPostoTarifario tipoPostoTarifario;

    @Element(name = "vSaldAnt")
    private String saldoAnterior;

    @Element(name = "vCredExpirado")
    private String creditosExpirados;

    @Element(name = "vSaldAtual")
    private String saldoAtual;

    @Element(name = "vCredExpirar", required = false)
    private String creditosExpirar;

    @Element(name = "CompetExpirar", required = false)
    private String competenciaExpirar;

    public NF3eTipoPostoTarifario getTipoPostoTarifario() {
        return tipoPostoTarifario;
    }

    public void setTipoPostoTarifario(NF3eTipoPostoTarifario tipoPostoTarifario) {
        this.tipoPostoTarifario = tipoPostoTarifario;
    }

    public String getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(saldoAnterior, "Saldo Anterior de Créditos em kWh");
    }

    public String getCreditosExpirados() {
        return creditosExpirados;
    }

    public void setCreditosExpirados(BigDecimal creditosExpirados) {
        this.creditosExpirados = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(creditosExpirados, "Créditos Expirados");
    }

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(BigDecimal saldoAtual) {
        this.saldoAtual = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(saldoAtual, "Saldo Atual de Créditos em kWh");
    }

    public String getCreditosExpirar() {
        return creditosExpirar;
    }

    public void setCreditosExpirar(BigDecimal creditosExpirar) {
        this.creditosExpirar = DFBigDecimalValidador.tamanho15comAte4CasasDecimais(creditosExpirar, "Créditos a Expirar");
    }

    public String getCompetenciaExpirar() {
        return competenciaExpirar;
    }

    public void setCompetenciaExpirar(String competenciaExpirar) {
        DFStringValidador.exatamente6N(competenciaExpirar, "Ciclo de faturamento em que ocorrerá a expiração (AAAAMM)");
        this.competenciaExpirar = competenciaExpirar;
    }
}
