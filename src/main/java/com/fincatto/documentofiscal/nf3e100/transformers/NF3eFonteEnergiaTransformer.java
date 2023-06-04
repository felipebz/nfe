package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eFonteEnergia;
import org.simpleframework.xml.transform.Transform;

public class NF3eFonteEnergiaTransformer implements Transform<NF3eFonteEnergia> {

    @Override
    public NF3eFonteEnergia read(final String codigo) {
        return NF3eFonteEnergia.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eFonteEnergia tipo) {
        return tipo.getCodigo();
    }

}
