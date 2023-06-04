package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eClasseConsumo;
import org.simpleframework.xml.transform.Transform;

public class NF3eClasseConsumoTransformer implements Transform<NF3eClasseConsumo> {

    @Override
    public NF3eClasseConsumo read(final String codigo) {
        return NF3eClasseConsumo.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eClasseConsumo tipo) {
        return tipo.getCodigo();
    }

}
