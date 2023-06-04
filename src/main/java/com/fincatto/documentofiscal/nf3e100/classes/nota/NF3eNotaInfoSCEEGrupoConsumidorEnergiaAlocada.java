package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoPostoTarifario;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada extends DFBase {
    private static final long serialVersionUID = 166069981627754625L;

    @Element(name = "enerAloc")
    private String energiaAlocada;

    @Element(name = "tpPosTar")
    private NF3eTipoPostoTarifario tipoPostoTarifario;

    public String getEnergiaAlocada() {
        return energiaAlocada;
    }

    public void setEnergiaAlocada(BigDecimal energiaAlocada) {
        this.energiaAlocada = DFBigDecimalValidador.tamanho11Com3CasasDecimais(energiaAlocada, "Energia Alocada");
    }

    public NF3eTipoPostoTarifario getTipoPostoTarifario() {
        return tipoPostoTarifario;
    }

    public void setTipoPostoTarifario(NF3eTipoPostoTarifario tipoPostoTarifario) {
        this.tipoPostoTarifario = tipoPostoTarifario;
    }
}
