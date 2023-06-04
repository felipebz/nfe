package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoGrandeza;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoGrandezaTransformer implements Transform<NF3eTipoGrandeza> {

    @Override
    public NF3eTipoGrandeza read(final String codigo) {
        return NF3eTipoGrandeza.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoGrandeza tipo) {
        return tipo.getCodigo();
    }

}
