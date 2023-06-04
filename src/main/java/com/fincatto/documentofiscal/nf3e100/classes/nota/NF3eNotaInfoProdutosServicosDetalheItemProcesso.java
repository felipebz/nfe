package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoProcesso;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NF3eNotaInfoProdutosServicosDetalheItemProcesso extends DFBase {
    private static final long serialVersionUID = 1257932553140881646L;

    @Element(name = "tpProc")
    private NF3eTipoProcesso tipoProcesso;

    @Element(name = "nProcesso")
    private String numeroProcesso;

    public NF3eTipoProcesso getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(NF3eTipoProcesso tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        DFStringValidador.tamanho60(numeroProcesso, "Numero Processo");
        this.numeroProcesso = numeroProcesso;
    }
}
