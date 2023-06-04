package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eBandeira;
import org.simpleframework.xml.transform.Transform;

public class NF3eBandeiraTransformer implements Transform<NF3eBandeira> {

    @Override
    public NF3eBandeira read(final String codigo) {
        return NF3eBandeira.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eBandeira tipo) {
        return tipo.getCodigo();
    }

}
