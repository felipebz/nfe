package com.fincatto.documentofiscal.nf3e100.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nf3e.NF3eConfig;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "gContab")
@Namespace(reference = NF3eConfig.NAMESPACE)
public class NF3eNotaInfoProdutosServicosDetalheInfoContabil extends DFBase {
    private static final long serialVersionUID = -510385663701134111L;

    @Element(name = "cContab")
    private String numeroContaContabil;

    @Element(name = "xContab")
    private String descricaoContaContabil;

    @Element(name = "vContab")
    private String valorContaContabil;

    @Element(name = "tpLanc")
    private String tipoLancamentoContabil;

    public String getNumeroContaContabil() {
        return numeroContaContabil;
    }

    public void setNumeroContaContabil(String numeroContaContabil) {
        this.numeroContaContabil = numeroContaContabil;
    }

    public String getDescricaoContaContabil() {
        return descricaoContaContabil;
    }

    public void setDescricaoContaContabil(String descricaoContaContabil) {
        DFStringValidador.tamanho100(descricaoContaContabil, "Descricao Conta Contabil");
        this.descricaoContaContabil = descricaoContaContabil;
    }

    public String getValorContaContabil() {
        return valorContaContabil;
    }

    public void setValorContaContabil(BigDecimal valorContaContabil) {
        this.valorContaContabil = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorContaContabil, "Valor Conta Contabil");
    }

    public String getTipoLancamentoContabil() {
        return tipoLancamentoContabil;
    }

    public void setTipoLancamentoContabil(String tipoLancamentoContabil) {
        if (!tipoLancamentoContabil.equals("D") && !tipoLancamentoContabil.equals("C")) {
            throw new IllegalArgumentException("Tipo Lancamento Contabil deve ser D ou C");
        }
        this.tipoLancamentoContabil = tipoLancamentoContabil;
    }
}
