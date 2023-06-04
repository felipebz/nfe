package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoAtoANELL;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoAtoANELLTransformer implements Transform<NF3eTipoAtoANELL> {

    @Override
    public NF3eTipoAtoANELL read(final String codigo) {
        return NF3eTipoAtoANELL.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoAtoANELL tipo) {
        return tipo.getCodigo();
    }

}
