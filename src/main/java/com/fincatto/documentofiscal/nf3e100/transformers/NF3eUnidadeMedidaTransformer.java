package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eUnidadeMedida;
import org.simpleframework.xml.transform.Transform;

public class NF3eUnidadeMedidaTransformer implements Transform<NF3eUnidadeMedida> {

    @Override
    public NF3eUnidadeMedida read(final String codigo) {
        return NF3eUnidadeMedida.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eUnidadeMedida tipo) {
        return tipo.getCodigo();
    }

}
