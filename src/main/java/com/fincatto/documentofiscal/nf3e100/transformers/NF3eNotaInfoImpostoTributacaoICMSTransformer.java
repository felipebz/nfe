package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eNotaInfoImpostoTributacaoICMS;
import org.simpleframework.xml.transform.Transform;

public class NF3eNotaInfoImpostoTributacaoICMSTransformer implements Transform<NF3eNotaInfoImpostoTributacaoICMS> {

    @Override
    public NF3eNotaInfoImpostoTributacaoICMS read(final String codigo) {
        return NF3eNotaInfoImpostoTributacaoICMS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eNotaInfoImpostoTributacaoICMS tipo) {
        return tipo.getCodigo();
    }

}
