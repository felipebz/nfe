package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoProcesso;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoProcessoTransformer implements Transform<NF3eTipoProcesso> {

    @Override
    public NF3eTipoProcesso read(final String codigo) {
        return NF3eTipoProcesso.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoProcesso tipo) {
        return tipo.getCodigo();
    }

}
