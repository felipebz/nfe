package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoFase;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoFaseTransformer implements Transform<NF3eTipoFase> {

    @Override
    public NF3eTipoFase read(final String codigo) {
        return NF3eTipoFase.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoFase tipo) {
        return tipo.getCodigo();
    }

}
