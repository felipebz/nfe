package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eFinalidade;
import org.simpleframework.xml.transform.Transform;

public class NF3eFinalidadeTransformer implements Transform<NF3eFinalidade> {

    @Override
    public NF3eFinalidade read(final String codigo) {
        return NF3eFinalidade.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eFinalidade tipo) {
        return tipo.getCodigo();
    }

}
