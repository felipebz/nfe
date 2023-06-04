package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eNotaInfoImpostoTributacaoCOFINS;
import org.simpleframework.xml.transform.Transform;

public class NF3eNotaInfoImpostoTributacaoCOFINSTransformer implements Transform<NF3eNotaInfoImpostoTributacaoCOFINS> {

    @Override
    public NF3eNotaInfoImpostoTributacaoCOFINS read(final String codigo) {
        return NF3eNotaInfoImpostoTributacaoCOFINS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eNotaInfoImpostoTributacaoCOFINS tipo) {
        return tipo.getCodigo();
    }

}
