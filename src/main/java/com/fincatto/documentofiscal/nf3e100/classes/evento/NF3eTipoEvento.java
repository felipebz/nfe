package com.fincatto.documentofiscal.nf3e100.classes.evento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class NF3eTipoEvento extends DFBase {
    private static final long serialVersionUID = -4386723720582191798L;

    @Element(name = "descEvento")
    private String descricaoEvento;

    public void setDescricaoEvento(final String descricaoEvento) {
        DFStringValidador.tamanho5a60(descricaoEvento, "Descricao do Evento");
        this.descricaoEvento = descricaoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }
}