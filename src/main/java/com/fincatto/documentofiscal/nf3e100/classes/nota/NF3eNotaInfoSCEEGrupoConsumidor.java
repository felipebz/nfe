package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eFonteEnergia;
import com.fincatto.documentofiscal.nf3e100.converters.NF3eNotaInfoSCEEGrupoConsumidorConverter;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Root(name = "gConsumidor")
@Namespace(reference = NF3eConfig.NAMESPACE)
@Convert(NF3eNotaInfoSCEEGrupoConsumidorConverter.class)
public class NF3eNotaInfoSCEEGrupoConsumidor extends DFBase {
    private static final long serialVersionUID = 5989414553887694978L;

    private String identificacaoUnidadeGeradora;

    private String potenciaInstalada;

    private NF3eFonteEnergia tipoFonteEnergia;

    private List<NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada> alocacoes = new ArrayList<>();

    public String getIdentificacaoUnidadeGeradora() {
        return identificacaoUnidadeGeradora;
    }

    public void setIdentificacaoUnidadeGeradora(String identificacaoUnidadeGeradora) {
        DFStringValidador.tamanho20(identificacaoUnidadeGeradora, "Identificacao Unidade Geradora");
        this.identificacaoUnidadeGeradora = identificacaoUnidadeGeradora;
    }

    public String getPotenciaInstalada() {
        return potenciaInstalada;
    }

    public void setPotenciaInstalada(BigDecimal potenciaInstalada) {
        this.potenciaInstalada = DFBigDecimalValidador.tamanho8Com3CasasDecimais(potenciaInstalada, "Potencia Instalada");
    }

    public NF3eFonteEnergia getTipoFonteEnergia() {
        return tipoFonteEnergia;
    }

    public void setTipoFonteEnergia(NF3eFonteEnergia tipoFonteEnergia) {
        this.tipoFonteEnergia = tipoFonteEnergia;
    }

    public List<NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada> getAlocacoes() {
        return alocacoes;
    }

    public void setAlocacoes(List<NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada> alocacoes) {
        this.alocacoes = alocacoes;
    }
}
