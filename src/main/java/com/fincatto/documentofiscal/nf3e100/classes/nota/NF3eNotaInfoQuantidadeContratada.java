package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoGrandeza;
import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoPostoTarifario;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;


@Root(name = "gGrContrat")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoQuantidadeContratada extends DFBase {
    private static final long serialVersionUID = 2191410421136795021L;

    @Attribute(name = "nContrat")
    private String numeroReferencia;

    @Element(name = "tpGrContrat")
    private NF3eTipoGrandeza tipoGrandeza;

    @Element(name = "tpPosTar")
    private NF3eTipoPostoTarifario tipoPostoTarifario;

    @Element(name = "qUnidContrat")
    private String quantidade;

    public NF3eTipoGrandeza getTipoGrandeza() {
        return tipoGrandeza;
    }

    public void setTipoGrandeza(NF3eTipoGrandeza tipoGrandeza) {
        this.tipoGrandeza = tipoGrandeza;
    }

    public NF3eTipoPostoTarifario getTipoPostoTarifario() {
        return tipoPostoTarifario;
    }

    public void setTipoPostoTarifario(NF3eTipoPostoTarifario tipoPostoTarifario) {
        this.tipoPostoTarifario = tipoPostoTarifario;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = DFBigDecimalValidador.tamanho15comAte6CasasDecimais(quantidade, "Quantidade Contratada");
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }
}
