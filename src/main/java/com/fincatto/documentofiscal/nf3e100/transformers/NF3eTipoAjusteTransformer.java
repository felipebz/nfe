package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoAjuste;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoAjusteTransformer implements Transform<NF3eTipoAjuste> {

    @Override
    public NF3eTipoAjuste read(final String codigo) {
        return NF3eTipoAjuste.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoAjuste tipo) {
        return tipo.getCodigo();
    }

}
