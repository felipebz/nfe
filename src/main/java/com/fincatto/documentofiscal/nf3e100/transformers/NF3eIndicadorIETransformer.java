package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eIndicadorIE;
import org.simpleframework.xml.transform.Transform;

public class NF3eIndicadorIETransformer implements Transform<NF3eIndicadorIE> {

    @Override
    public NF3eIndicadorIE read(final String codigo) {
        return NF3eIndicadorIE.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eIndicadorIE tipo) {
        return tipo.getCodigo();
    }

}
