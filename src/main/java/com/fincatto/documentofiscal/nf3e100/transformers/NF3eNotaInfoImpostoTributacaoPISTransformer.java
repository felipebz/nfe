package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eNotaInfoImpostoTributacaoPIS;
import org.simpleframework.xml.transform.Transform;

public class NF3eNotaInfoImpostoTributacaoPISTransformer implements Transform<NF3eNotaInfoImpostoTributacaoPIS> {

    @Override
    public NF3eNotaInfoImpostoTributacaoPIS read(final String codigo) {
        return NF3eNotaInfoImpostoTributacaoPIS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eNotaInfoImpostoTributacaoPIS tipo) {
        return tipo.getCodigo();
    }

}
