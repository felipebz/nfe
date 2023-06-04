package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eIndicadorOrigemQuantidade;
import org.simpleframework.xml.transform.Transform;

public class NF3eIndicadorOrigemQuantidadeTransformer implements Transform<NF3eIndicadorOrigemQuantidade> {

    @Override
    public NF3eIndicadorOrigemQuantidade read(final String codigo) {
        return NF3eIndicadorOrigemQuantidade.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eIndicadorOrigemQuantidade tipo) {
        return tipo.getCodigo();
    }

}
