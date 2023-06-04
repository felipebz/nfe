package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoDiferencaBandeira;
import org.simpleframework.xml.transform.Transform;

public class NF3eMotivoDiferencaBandeiraTransformer implements Transform<NF3eMotivoDiferencaBandeira> {

    @Override
    public NF3eMotivoDiferencaBandeira read(final String codigo) {
        return NF3eMotivoDiferencaBandeira.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eMotivoDiferencaBandeira tipo) {
        return tipo.getCodigo();
    }

}
