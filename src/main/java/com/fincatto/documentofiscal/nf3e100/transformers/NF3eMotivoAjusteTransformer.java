package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eMotivoAjuste;
import org.simpleframework.xml.transform.Transform;

public class NF3eMotivoAjusteTransformer implements Transform<NF3eMotivoAjuste> {

    @Override
    public NF3eMotivoAjuste read(final String codigo) {
        return NF3eMotivoAjuste.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eMotivoAjuste tipo) {
        return tipo.getCodigo();
    }

}
