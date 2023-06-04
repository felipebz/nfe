package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoSubstituicao;
import org.simpleframework.xml.transform.Transform;

public class NF3eMotivoSubstituicaoTransformer implements Transform<NF3eMotivoSubstituicao> {

    @Override
    public NF3eMotivoSubstituicao read(final String codigo) {
        return NF3eMotivoSubstituicao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eMotivoSubstituicao tipo) {
        return tipo.getCodigo();
    }

}
