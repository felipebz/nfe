package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoNaoLeitura;
import org.simpleframework.xml.transform.Transform;

public class NF3eMotivoNaoLeituraTransformer implements Transform<NF3eMotivoNaoLeitura> {

    @Override
    public NF3eMotivoNaoLeitura read(final String codigo) {
        return NF3eMotivoNaoLeitura.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eMotivoNaoLeitura tipo) {
        return tipo.getCodigo();
    }

}
