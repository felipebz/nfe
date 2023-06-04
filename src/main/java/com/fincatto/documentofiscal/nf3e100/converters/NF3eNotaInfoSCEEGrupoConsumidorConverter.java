package com.fincatto.documentofiscal.nf3e100.converters;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eNotaInfoSCEEGrupoConsumidor;
import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada;
import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eFonteEnergia;
import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoPostoTarifario;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.convert.Converter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NF3eNotaInfoSCEEGrupoConsumidorConverter implements Converter<NF3eNotaInfoSCEEGrupoConsumidor> {

    @Override
    public NF3eNotaInfoSCEEGrupoConsumidor read(InputNode node) throws Exception {
        NF3eNotaInfoSCEEGrupoConsumidor energia = new NF3eNotaInfoSCEEGrupoConsumidor();
        InputNode child = node.getNext();

        NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada alocacao = null;
        List<NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada> alocacoes = new ArrayList<>();

        while (child != null) {
            String name = child.getName();
            String value = child.getValue();

            if (name.equals("idAcessGer")) {
                energia.setIdentificacaoUnidadeGeradora(value);
            } else if (name.equals("vPotInst")) {
                energia.setPotenciaInstalada(new BigDecimal(value));
            } else if (name.equals("tpFonteEnergia")) {
                energia.setTipoFonteEnergia(NF3eFonteEnergia.valueOfCodigo(value));
            } else if (name.equals("enerAloc")) {
                alocacao = new NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada();
                alocacao.setEnergiaAlocada(new BigDecimal(value));
            } else if (name.equals("tpPosTar")) {
                if (alocacao == null) {
                    throw new IllegalStateException("Energia alocada não definida");
                }
                alocacao.setTipoPostoTarifario(NF3eTipoPostoTarifario.valueOfCodigo(value));
                alocacoes.add(alocacao);
            }
            child = node.getNext();
        }
        energia.setAlocacoes(alocacoes);
        return energia;
    }

    @Override
    public void write(OutputNode node, NF3eNotaInfoSCEEGrupoConsumidor energia) throws Exception {
        node.getChild("idAcessGer").setValue(energia.getIdentificacaoUnidadeGeradora());
        node.getChild("vPotInst").setValue(energia.getPotenciaInstalada());
        node.getChild("tpFonteEnergia").setValue(energia.getTipoFonteEnergia().getCodigo());

        for (NF3eNotaInfoSCEEGrupoConsumidorEnergiaAlocada alocacao: energia.getAlocacoes()) {
            node.getChild("enerAloc").setValue(alocacao.getEnergiaAlocada());
            node.getChild("tpPosTar").setValue(alocacao.getTipoPostoTarifario().getCodigo());
        }
    }

}
