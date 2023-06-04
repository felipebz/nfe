package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoDiferencaTarifa;
import org.simpleframework.xml.transform.Transform;

public class NF3eMotivoDiferencaTarifaTransformer implements Transform<NF3eMotivoDiferencaTarifa> {

    @Override
    public NF3eMotivoDiferencaTarifa read(final String codigo) {
        return NF3eMotivoDiferencaTarifa.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eMotivoDiferencaTarifa tipo) {
        return tipo.getCodigo();
    }

}
