package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eModalidadeTarifa;
import org.simpleframework.xml.transform.Transform;

public class NF3eModalidadeTarifaTransformer implements Transform<NF3eModalidadeTarifa> {

    @Override
    public NF3eModalidadeTarifa read(final String codigo) {
        return NF3eModalidadeTarifa.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eModalidadeTarifa tipo) {
        return tipo.getCodigo();
    }

}
